package file;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            File file = new File("./test"+i+".txt");
            file.delete();
            System.out.println(i+"次删除完毕");
        }
    }
}
