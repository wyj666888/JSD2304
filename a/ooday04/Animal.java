package ooday04;
public abstract class Animal {//创建Animal类
    String name;//设置成员变量
    int age;
    String color;
    Animal(){}
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    void drink(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在喝水...");
    }
    abstract void eat();
}
/*
第二遍:
public class Animal {
    String name;
    int age;
    String color;
    Animal(){}
    Animal(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    void drink(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在喝水...");
    }
    void eat(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在吃饭...");
    }
}
 */
/*
第三遍:
public class Animal {
    String name;
    int age;
    String color;
    Animal(){}
    Animal(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    void drink(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在喝水...");
    }
    void eat(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在吃饭...");
    }
}
 */