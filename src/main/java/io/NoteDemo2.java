package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class NoteDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("note2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        /*
        当自动行刷新功能开启后,每当我们调用println方法时就会自动flush
         */
        PrintWriter pw =new PrintWriter(bw,true);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请开始输入内容,单独输入exit退出");
        while (true){
            String line = scanner.nextLine();
            if ("exit".equalsIgnoreCase(line)){
                break;
            }
            pw.println(line);
        }
        System.out.println("结束!");
        pw.close();
    }
}
