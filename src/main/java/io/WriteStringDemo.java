package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos1.txt");
        fos.write("在小小的花园里面,挖呀挖呀挖呀".getBytes(StandardCharsets.UTF_8));
        System.out.println("写出完毕");
        fos.close();
    }
}
