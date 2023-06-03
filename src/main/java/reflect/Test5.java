package reflect;

import reflect.annotations.AutoRunClass;

import java.io.File;

public class Test5 {
    public static void main(String[] args) throws Exception{
        File dir = new File(Test5.class.getResource(".").toURI());
        String packageName=dir.getName();
        File[] subs = dir.listFiles(f -> f.getName().contains(".class"));
        for (File sub : subs) {
            int a = sub.getName().indexOf(".");
            String className = sub.getName().substring(0, a);
            Class cls = Class.forName(packageName + "." + className);
            boolean mark = cls.isAnnotationPresent(AutoRunClass.class);
            if (mark) {
                System.out.println("实例化:" + className);
                Object obj = cls.newInstance();
                System.out.println(obj);
            }
        }
    }
}
