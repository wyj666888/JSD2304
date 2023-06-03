package reflect;

import java.io.File;


public class Test3 {
    public static void main(String[] args) throws Exception {
        File dir = new File(Test3.class.getResource(".").toURI());
//        System.out.println(dir.getName());
//        File dir1 = new File(
//                Test.class.getClassLoader().getResource(".").toURI()
//        );
//        System.out.println(dir1);
        //获取包名
        String packageName=dir.getName();
        //获取包下的包含".class"子文件
        File[] subs = dir.listFiles(f -> f.getName().contains(".class"));
        for (File sub : subs) {
            int a =sub.getName().indexOf(".");
            String className = sub.getName().substring(0,a);
            Class cls = Class.forName(packageName+"."+className);
            Object obj = cls.newInstance();
            System.out.println(obj);
        }
    }
}
