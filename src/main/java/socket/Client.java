package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    /*
    java.net.Socket 套接字
    Socket封装了TCP协议的通讯细节，使用它可以通过网络与远端计算机进行TCP链接
        并基于两条流(输入与输出)与远端计算机通讯。
        Socket可以想象为我们使用的"手机"。
     */
    private Socket socket;
    public Client(){
        try {
            System.out.println("正在链接服务端...");
            //localhost=127.0.0.1
            socket = new Socket("localhost",8088);
            System.out.println("与服务端成功链接!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
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
        }finally {
            //最终交互完毕后，要断开连接
            try {
                //close方法内部会进行TCP的四次挥手操作
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        Client client = new Client();
        client.start();
    }
}
