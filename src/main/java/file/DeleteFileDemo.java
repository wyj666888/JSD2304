package file;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        File file = new File("./test2.txt");
        boolean a=file.delete();
        System.out.println("删除"+(a?"成功":"失败"));
    }
}
