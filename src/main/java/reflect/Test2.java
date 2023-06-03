package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test2 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();
        //getDeclaredMethods()获取自己写的方法,不包含超类
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method);
            if (method.getParameterCount()==0&&
            method.getModifiers()== Modifier.PUBLIC&&
            method.getName().startsWith("s")){
                method.invoke(obj);
            }else {
                System.out.println("不符合");
            }
        }
    }
}
