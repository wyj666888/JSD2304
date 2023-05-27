package file;


import java.io.File;

public class ListFilesDemo {
    public static void main(String[] args) {
        File dir = new File(".");
        /*
            File[] listFiles()
            获取当前File对象表示的目录中的所有子项
            返回一个File数组,数组中每个元素(一个File对象)表示该目录中的一个子项
         */
        if(dir.isDirectory()){
            File[] subs = dir.listFiles();
            for (File sub : subs){
                System.out.println(sub.getName());
            }
        }
    }
}
