package file;

import java.io.File;

public class MkDirDemo {
    public static void main(String[] args) {
       // File file = new File("demo");
      //  boolean a=file.mkdir();
        File file = new File("./a/b/c/d/f");
        boolean b=file.mkdirs();
        System.out.println("目录创建"+(b?"成功":"失败"));
        boolean c=file.delete();
        System.out.println("目录删除"+(c?"成功":"失败"));
    }
}
