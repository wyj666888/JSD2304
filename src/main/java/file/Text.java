package file;

import java.io.File;
import java.io.IOException;

public class Text {
    public static void main(String[] args) throws IOException {
        for (int i=1;i<=100;i++){
            File file = new File("./test"+i+".txt");
            file.createNewFile();
            System.out.println(i+"次创建完毕");
        }
    }
}
