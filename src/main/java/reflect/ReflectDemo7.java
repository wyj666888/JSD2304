package reflect;

import reflect.annotations.AutoRunClass;

public class ReflectDemo7 {
    public static void main(String[] args) throws Exception{
        //Person类是否被注解@AutoRunClass标注
        Class cls = Class.forName("reflect.Person");
          /*
            【所有反射对象】都提供了用于判断是否被某个注解标注的方法
            boolean isAnnotationPresent(Class cls)
            判断当前反射对象表示的内容是否被参数类对象表示的注解标注了
         */
        boolean mark = cls.isAnnotationPresent(AutoRunClass.class);
        System.out.println((mark?"有":"没有")+"被标注");
    }
}
