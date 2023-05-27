package file;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()){
            File[] subs =dir.listFiles( f -> f.getName().contains("."));
            for (File sub : subs){
                System.out.println(sub.getName());
            }
        }
    }
}
