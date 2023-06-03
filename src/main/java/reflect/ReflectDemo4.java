package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectDemo4 {
    public static void main(String[] args)  throws Exception{
        Person p = new Person();
        p.playGame();

        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();//利用无参构造器实例化
        //通过类对象获取sayHello()
        Method method = cls.getMethod("sayHello");
        //执行当前Method对象表示的方法
        method.invoke(obj);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入类名:");
        String classname = scanner.nextLine();
        System.out.println("包含的方法有: ");

        Class cls1  = Class.forName(classname);
        Object obj1 = cls1.newInstance();

        Method[] methods = cls.getMethods();
        for (Method me :methods){
            System.out.print(me.getName()+" ");
        }
        while (true) {
            System.out.println();
            System.out.println("请输入方法名:");
            String methodName = scanner.nextLine();
            Method method1 = cls.getMethod(methodName);

            method1.invoke(obj1);
        }




    }
}
