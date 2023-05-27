package io;

import java.io.*;

public class FOSDemo {
    public static void main(String[] args) throws IOException {
        /*
        FileOutputStream是用于连接程序与程序的管道,负责将程序
        常用的构造方法:
        FileOutputStream(File file)
        FileOutputStream(String path)
         */
        FileOutputStream fos = new FileOutputStream("./fos.dat");
        fos.write(-1);
        fos.write(255);
        System.out.println("写出完毕");
        fos.close();
    }
}
