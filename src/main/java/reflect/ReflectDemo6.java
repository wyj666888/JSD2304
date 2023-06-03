package reflect;

import java.lang.reflect.Method;

public class ReflectDemo6 {
    public static void main(String[] args) throws Exception {
//        Person p = new Person();
//        p.heihei();//编译不通过！类的外部不能访问类的私有成员
        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();
//        Method method = cls.getMethod("heihei");
//        method.invoke(obj);// p.heihei();
        /*
            java.lang.NoSuchMethodException
                      没有这个方法异常
            原因:
            Class的getMethod()和getMethods()仅能获取该类对象所表示的类的
            公开方法(包含从超类继承的)
         */
        /*
            Class提供了一组:getDeclaredXXXX()都是用于获取本类定义的内容
            getDeclaredMethod用来获取Class表示的类的自己定义的方法(包含私有方法)
         */
        Method method = cls.getDeclaredMethod("heihei");
        method.setAccessible(true);//强行打开该方法的访问权限
        method.invoke(obj);
        method.setAccessible(false);//操作后记得关闭,尽量保证封装性
    }
}
