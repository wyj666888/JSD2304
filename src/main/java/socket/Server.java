package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    private ServerSocket serverSocket;

    public Server() {
        try {
              /*
                ServerSocket实例化的同时指定服务端口
                如果该端口被其他程序占用则会抛出异常:
                java.net.BindException:address already in use
                此时我们需要更换端口，或者杀死占用该端口的进程。

                端口号范围:0-65535,建议8000以后
             */
            System.out.println("正在启动服务端...");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务器启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            /*
                ServerSocket的一个重要方法:
                Socket accept()
                该方法用于接受客户端的连接。这是一个阻塞方法，调用后会"卡住"，直到
                一个客户端与ServerSocket连接，此时该方法会立即返回一个Socket实例
                通过这个Socket实例与该客户端对等连接并进行通讯。
                相当于"接电话"的动作
             */
            while (true) {
                System.out.println("等待客户端连接...");
                Socket socket = serverSocket.accept();
                System.out.println("一个客户端连接了!");
                /*
                Socket一个重要的方法
                InputStream getInputStream()
                通过socket获取的字节输入流可以读取远端计算机发送过来的数据
             */
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                String line;
                /*
                    当客户端断开连接时，如果是异常断开，服务端这里readLine方法会
                    抛出异常:
                    java.net.SocketException: Connection reset

                    客户端正常进行了挥手操作，那么服务端这里readLine方法会返回null
                 */
                while ((line = br.readLine()) != null) {
                    System.out.println("客户端说:" + line);
                }
                System.out.println("客户端已断开!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Server server = new Server();
        server.start();
    }
}
