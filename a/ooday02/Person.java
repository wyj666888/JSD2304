package ooday02;
public class Person {
    String name;//成员变量
    int age;
    String address;
    Person(){}//无参构造
    Person(String name,int age,String address){//有参构造
        this.name=name;
        this.age=age;
        this.address=address;
    }
    void eat(){
        System.out.println(name+"正在吃饭...");
    }
    void sleep(){
        System.out.println(name+"正在睡觉...");
    }
    void sayhi(){
        System.out.println("大家好,我叫"+name+",今年"+age+"岁了,家住"+address);
    }
}
/*
第二遍:
public class Person {
    String name;
    int age;
    String address;
    Person(){}
    Person(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    void eat(){
        System.out.println(name+"正在吃饭...");
    }
    void sleep(){
        System.out.println(name+"正在睡觉...");
    }
    void sayhi(){
        System.out.println("大家好,我叫"+name+",今年"+age+"岁了,家住"+address);
    }
}
 */
/*
第三遍:
public class Person {
    String name;
    int age;
    String address;
    Person(){}
    Person(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    void eat(){
        System.out.println(name+"正在吃饭...");
    }
    void sleep(){
        System.out.println(name+"正在睡觉...");
    }
    void sayhi(){
        System.out.println("大家好,我叫"+name+",今年"+age+"岁了,家住"+address);
    }
}
 */