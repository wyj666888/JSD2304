package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

import java.io.File;
import java.lang.reflect.Method;

public class Test7 {
    public static void main(String[] args) throws Exception{
        File dir = new File(Test6.class.getResource(".").toURI());
        String packageName = dir.getName();
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
                Method[] methods = cls.getDeclaredMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(AutoRunMethod.class)) {
                        AutoRunMethod arm = method.getAnnotation(AutoRunMethod.class);
                        int value = arm.value();
                        System.out.println("调用方法" + method.getName()+"()"+value+"次");
                        for (int i=0;i<value;i++){
                            method.invoke(obj);
                        }
                    }
                }
            }
        }
    }
}
