package io;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/main/java/io");
        File[] subs = file.listFiles();
        for (File sub:subs) {
            System.out.println(sub.getName());
            printFile(sub);
        }
    }
    public static void printFile(File sub) throws IOException {
        FileInputStream fis = new FileInputStream(sub);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
