package io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DeleteDemo {
    public static void main(String[] args) throws IOException {
        Scanner a = new Scanner(System.in);
        File dir = new File("C:\\Users\\tarena\\IdeaProjects\\SpringBoot2304\\users");
            while (true) {
                System.out.println("请输入要删除的文件名(部分也行):");
                String b = a.nextLine();
                if (dir.isDirectory()) {
                    File[] subs = dir.listFiles(f -> f.getName().contains(b));
                    for (File sub : subs) {
                        if (sub.isFile()) {
                            System.out.println(sub.getName());
                            File file = new File("C:\\Users\\tarena\\IdeaProjects\\SpringBoot2304\\users\\"+sub.getName());
                            file.delete();
                            System.out.println("已删除!");
                        }
                    }
                if ("exit".equalsIgnoreCase(b)) {
                    break;
                }
            }
        }
    }
}