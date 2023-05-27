package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt");
        /*
        转换流的主要工作之一就是将写出的字符按照指定的字符集转换
         */
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

        osw.write("夜空中最亮的星，能否听清，");
        osw.write("那仰望的人心底的孤独和叹息。");
        System.out.println("写出完毕");
        osw.close();
    }
}
