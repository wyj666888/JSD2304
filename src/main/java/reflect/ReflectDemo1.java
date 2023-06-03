package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * JAVA反射机制
 * 反射是java的动态机制，允许程序在"运行期间"再确定如:对象的实例化，方法的调用，属性的
 * 操作等。
 * 反射机制可以提高代码的灵活性和适应性。但是会带来较多的系统开销和较慢的运行效率
 * 因此反射机制不能过度被依赖。
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
            反射机制使用的第一步:获取待操作的类的类对象
            类对象:Class类的实例
            JVM内部每个被加载的类都有且只有一个Class的实例与之对应。
            JVM加载一个类时会读取该类的.class文件然后将其载入到JVM内部，与此同时
            会实例化一个Class的实例，用该实例记录被加载的类的信息(类名，方法，构造器等)

            获取一个类的类对象方式:
            1:类名.class
              Class cls = String.class;//获取String的类对象
              Class cls = int.class;//获取int的类对象(基本类型只有这一种方式获取类对象)

            2:Class.forName(String className)
              根据类的完全限定(包名.类名)名加载并获取该类的类对象
              Class cls = Class.forName("java.lang.String");

            3:ClassLoader类加载器方式
         */
        //        Class cls = String.class;
//        Class cls = ArrayList.class;

//        Class cls = Class.forName("java.lang.String");
        /*
            java.util.ArrayList
            java.util.HashMap
            java.io.File
            java.io.ObjectInputStream
            reflect.Person
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个类的完全限定名: ");
        String className = scanner.nextLine();
        Class cls = Class.forName(className);

//        Class cls = String.class;

        String name = cls.getName();
        System.out.println("该类的完全限定名: "+name);

        name = cls.getSimpleName();
        System.out.println("类名:"+name);

        Package p =  cls.getPackage();
        String packageName =p.getName();
        System.out.println("包名: "+packageName);

        Method[] methods = cls.getMethods();
        //遍历输出该类的所有方法名
        System.out.println("包含的方法有: ");
        for (Method method :methods){
            System.out.println(method.getName());
        }
    }
}
