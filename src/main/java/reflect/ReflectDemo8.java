package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;

public class ReflectDemo8 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("reflect.Person");
        boolean mark = cls.isAnnotationPresent(AutoRunClass.class);
        if (mark){
            Method method = cls.getDeclaredMethod("sayHi");
            mark = method.isAnnotationPresent(AutoRunMethod.class);
            if (mark){
                System.out.println(method.getName()+"()被标注了");
            }else{
                System.out.println(method.getName()+"()没有被标注");
            }
        }else {
            System.out.println(cls.getSimpleName()+"类没有被标注");
        }


    }
}
