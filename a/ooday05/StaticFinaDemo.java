package ooday05;

public class StaticFinaDemo {
    public static void main(String[] args) {
        System.out.println(Loo.PI);
        System.out.println(Loo.num);
        //编译器在编译时会将常量直接替换为具体的数,效率高
        //相当于System.out.println(5);
        System.out.println(Loo.COUNT);
    }
}
class Loo{
    public static int num = 5;//静态变量
    public static final int COUNT = 5;//静态常量
    public static final double PI=3.14159;
}
/*
第二遍:
public class StaticFinaDemo {
    public static void main(String[] args) {
        System.out.println(Loo.PI);
        System.out.println(Loo.num);
        System.out.println(Loo.COUNT);
    }
}
class Loo{
    public static int num = 5;
    public static final int COUNT = 5;
    public static final double PI=3.14159;
}
*/