package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./a.mp4");
        FileOutputStream fos = new FileOutputStream("./copy.mp4");
        byte[] data = new byte[1024*100];
        int len;
        long start = System.currentTimeMillis();
        while ((len=fis.read(data))!=-1){
            fos.write(data,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕!+耗时:"+(end-start)+"ms");
        fis.close();
        fos.close();
    }
}
