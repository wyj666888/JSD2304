package reflect;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Student");
        Object obj=cls.newInstance();
        System.out.println(obj);

        Constructor con2 = cls.getConstructor(String.class,int.class,char.class);
        Object obj2 = con2.newInstance("李四",15,'妖');
        System.out.println(obj2);
    }
}
