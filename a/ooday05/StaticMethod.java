package ooday05;

public class StaticMethod {
    int a;
    static int b;
    void say() {
        System.out.println(a);
    }
//在plus()中不需要访问对象的属性/行为,所以认为plus的操作与对象无关,可以设计为静态.
    static int plus(int num1,int num2){
        int num=num1+num2;
        return num;
    }
    void show(){//有隐式this
        System.out.println(a);
        System.out.println(StaticMethod.b);
    }
    static void test(){//没有隐式this
        //静态方法中没有隐式this
        //没有this就意味着没有对象
        //而实例变量a必须通过对象来访问
        //System.out.println(a);编译错误,静态方法中不能直接访问实例成员变量
        System.out.println(b);
    }
}
/*
第二遍:
public class StaticMethod {
    int a;
    static int b;
    void say() {
        System.out.println(a);
    }
    static int plus(int num1,int num2){
        int num=num1+num2;
        return num;
    }
    void show(){
        System.out.println(a);
        System.out.println(StaticMethod.b);
    }
    static void test(){
        System.out.println(b);
    }
}
 */