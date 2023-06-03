package reflect;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test4 {
    public static void main(String[] args) throws Exception{
        File dir = new File(Test4.class.getResource(".").toURI());
        String packageName=dir.getName();
        File[] subs = dir.listFiles(f -> f.getName().contains(".class"));
        for (File sub : subs) {
            int a =sub.getName().indexOf(".");
            String className = sub.getName().substring(0,a);
            System.out.println("实例化:"+className);
            Class cls = Class.forName(packageName+"."+className);
            Object obj = cls.newInstance();
            System.out.println(obj);

            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                if (method.getParameterCount() == 0 &&
                        method.getModifiers() == Modifier.PUBLIC) {
                    System.out.println("调用方法"+method.getName());
                    method.invoke(obj);
                }
            }
        }
    }
}
