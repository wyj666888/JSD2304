package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * 聊天室服务端
 */
public class Server_V2 {
    /**
     * java.net.ServerSocket
     * 运行在服务端的ServerSocket主要有两个工作:
     * 1:打开服务端口，客户端就是通过这个端口与服务端建立连接的
     * 2:监听服务端口，一旦一个客户端连接，则立即返回一个Socket实例
     */
    private ServerSocket serverSocket;

    public Server_V2(){
        try {
            /*
                ServerSocket实例化的同时指定服务端口
                如果该端口被其他程序占用则会抛出异常:
                java.net.BindException:address already in use
                此时我们需要更换端口，或者杀死占用该端口的进程。

                端口号范围:0-65535
             */
            System.out.println("正在启动服务端...");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 服务端开始工作的方法
     */
    public void start(){
        try {
            /*
                ServerSocket的一个重要方法:
                Socket accept()
                该方法用于接受客户端的连接。这是一个阻塞方法，调用后会"卡住"，直到
                一个客户端与ServerSocket连接，此时该方法会立即返回一个Socket实例
                通过这个Socket实例与该客户端对等连接并进行通讯。
                相当于"接电话"的动作
             */
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
        Server_V2 server = new Server_V2();
        server.start();
    }
    /**
     * 第二种创建线程的方式:实现Runnable接口单独定义线程任务
     * 这个线程任务就是让一个线程与指定的客户端进行交互
     */
    private class ClientHandler implements Runnable{
        private Socket socket;
        private String host;//客户端的地址信息

        public ClientHandler(Socket socket){
            this.socket = socket;
            //通过socket获取远端计算机的地址信息
            host = socket.getInetAddress().getHostAddress();
        }

        public void run(){
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(host + "说:" + line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
