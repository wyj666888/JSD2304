package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 聊天室客户端
 */
public class Client_V3 {
    private Socket socket;
    public Client_V3(){
        try {
            System.out.println("正在链接服务端...");
            socket = new Socket("176.114.19.175",8088);
            System.out.println("与服务端成功链接!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start() {
        try {
            //启动线程用于读取服务端发送过来的消息
            ServerHandler handler = new ServerHandler();
            Thread t = new Thread(handler);
            //设置守护线程
            t.setDaemon(true);
            t.start();

            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);

            Scanner scanner = new Scanner(System.in);
            while(true) {
                String line = scanner.nextLine();//获取控制台输入的一行字符串
                if("exit".equalsIgnoreCase(line)){
                    break;
                }
                pw.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //最终交互完毕后，要断开连接
            try {
                //close方法内部会进行TCP的四次挥手操作
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client_V3 client = new Client_V3();
        client.start();
    }
    //建立新线程:来接受服务端的信息,并输出
    private class ServerHandler implements Runnable{
        public void run(){
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                //循环读取服务端发过来的消息
                String line;

                while((line = br.readLine())!=null){
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
