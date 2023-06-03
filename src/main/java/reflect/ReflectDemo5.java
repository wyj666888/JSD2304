package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectDemo5 {
    public static void main(String[] args) throws Exception{
        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();
        //getMethod()第一个参数为方法名,从第二个参数开始是方法的参数列表
        Method m1 = cls.getMethod("say",String.class);
        //调用该方法时:参数1为方法所属对象,参数2开始为实参列表
        m1.invoke(obj,"大家好!");

        Method m2 = cls.getMethod("say",String.class,int.class);
        m2.invoke(obj,"干得漂亮",5);

        /*
        int getModifiers()
        返回当前方法对象所表示的的方法的语言修饰符

        int getParameterCount()
        返回当前对象所表示的方法的参数个数
         */
        int modifier = m1.getModifiers();
        switch (modifier){
            case Modifier.PUBLIC:
                System.out.println("公开方法");
                break;
            case Modifier.PRIVATE:
                System.out.println("私有方法");
                break;
        }

        int count = m2.getParameterCount();
        System.out.println(m2.getName()+"方法有"+count+"个参数");


    }
}
