package reflect;

import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;

public class ReflectDemo9 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("reflect.Person");
        Method method = cls.getMethod("sayHi");

        if (method.isAnnotationPresent(AutoRunMethod.class)){
            /*
                所有的反射对象都支持获取注解的方法:
                getAnnotation(Class cls)
             */
            //1:获取该方法上的注解对象
            AutoRunMethod arm = method.getAnnotation(AutoRunMethod.class);
            //2:通过注解对象获取其表示的注解上的参数
            int value = arm.value();
            System.out.println("参数值: "+value);
        }
    }
}
