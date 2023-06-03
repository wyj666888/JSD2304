package reflect;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        Person p = new Person("王克晶",18);
        System.out.println(p);

        Class cls = Class.forName("reflect.Person");
//        Constructor con = cls.getConstructor();//获取无参构造器


        //Person(String name)
        Constructor constructor = cls.getConstructor(String.class);
        Object obj = constructor.newInstance("李四");
        System.out.println(obj);
        //Person(String name,int age)
//        Constructor con2 = cls.getConstructor(String.class,int.class);
        Constructor con2 = cls.getConstructor(new Class[]{String.class,int.class});
        Object obj2 = con2.newInstance("王五",33);
        System.out.println(obj2);

    }
}
