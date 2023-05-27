package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 聊天室服务端
 */
public class Server_V3 {
    private ServerSocket serverSocket;
    //存放所有客户端的输出流，用于广播消息
    private List<PrintWriter> allOut = new ArrayList<>();

    public Server_V3(){
        try {
            System.out.println("正在启动服务端...");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        try {
            while(true) {
                System.out.println("等待客户端连接...");
                Socket socket = serverSocket.accept();
                System.out.println("一个客户端连接了!");
                //启动一个线程负责与该客户端交互
                ClientHandler handler = new ClientHandler(socket);
                //创建线程
                Thread t = new Thread(handler);
                //启动线程
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        Server_V3 server = new Server_V3();
        server.start();
    }


//内部类可以访问外部类的属性
    private class ClientHandler implements Runnable{
        private Socket socket;
        private String host;//客户端的地址信息

        public ClientHandler(Socket socket){
            this.socket = socket;
            //通过socket获取远端计算机的地址信息
            host = socket.getInetAddress().getHostAddress();

        }

        public void run(){
            PrintWriter pw = null;
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw,true);

                //将对应该客户端的输出流存入共享集合allOut中
                synchronized (allOut) {//通常同步监视器对象可以选取临界资源
                    allOut.add(pw);
                }

                //通知所有客户端该用户上线了
                sendMessage(name(host)+"上线了,当前在线人数:"+allOut.size());
                System.out.println();

                String line;
                while ((line = br.readLine()) != null) {
                    sendMessage(name(host) + "说:" + line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                //处理该客户端下线后的操作
                synchronized (allOut) {
                    allOut.remove(pw);//将该客户端的输出流从共享集合中删除
                }
                //通知所有客户端该用户下线了
                sendMessage(name(host)+"下线了,当前在线人数:"+allOut.size());
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void sendMessage(String message){
            System.out.println(message);
            synchronized (allOut) {
                //要与其他线程可能对集合的增删元素互斥
                //因为迭代器要求遍历的过程中不可以通过集合方法增删元素
                for (PrintWriter p : allOut) {
                    p.println(message);
                }
            }
        }
        //ip配对姓名
        private String name(String host){
        Map studentInfo = new HashMap<>();
        studentInfo.put("176.114.19.190","康哥");
        studentInfo.put("176.114.19.175","嘉哥");
        studentInfo.put("176.114.19.180","鹏哥");
        studentInfo.put("176.114.19.156","雄哥");
        studentInfo.put("176.114.19.183","宝哥");
        studentInfo.put("176.114.19.174","旭哥");
        studentInfo.put("176.114.19.176","明哥");
        studentInfo.put("176.114.19.177","龙哥");
        studentInfo.put("176.114.19.188","欧文");
        studentInfo.put("176.114.19.51","武哥");

        String studentName=null;
        if(studentInfo.containsKey(host)) {
            studentName = (String) studentInfo.get(host);
            System.out.println("该学号对应的姓名为：" + studentName);
        } else {
            System.out.println("该学号不存在！");
        }
        return studentName;
    }
    }
}
