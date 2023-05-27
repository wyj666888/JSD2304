package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class NoteDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("note.txt");
        System.out.println("请输入:");
        while (true) {
            String a = scanner.nextLine();
            if ("exit".equalsIgnoreCase(a)){//equalsIgnoreCase比较忽略大小写
                break;
            }
            fos.write(a.getBytes(StandardCharsets.UTF_8));
        }
        System.out.println("再见");
        fos.close();
    }
}
