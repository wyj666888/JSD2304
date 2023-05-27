package io;

import java.io.*;
import java.util.Scanner;

public class BRDemo {
    public static void main(String[] args) throws IOException {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String a = scanner.nextLine();
            if ("t".equalsIgnoreCase(a)){
                break;
            }
            FileInputStream fis = new FileInputStream("./" + a);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            fis.close();
            System.out.println("是否删除?");
            if ("y".equalsIgnoreCase(scanner.nextLine())) {
                File file = new File("./" + a);
                boolean b=file.delete();
                System.out.println(b);
            }
        }
    }
}