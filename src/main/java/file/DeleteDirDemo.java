package file;

import java.io.File;

public class DeleteDirDemo {
    public static void main(String[] args) {
        File file = new File("./a/b/c");
        boolean c=file.delete();
        System.out.println("目录删除"+(c?"成功":"失败"));
    }
}
