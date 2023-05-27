package ooday02;
public class Dog extends Animal{//继承Animal类
    Dog(String name,int age,String color){
        super(name,age,color);
    }
    void eat(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在吃骨头...");
    }
    void lookHome(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在看家...");
    }
}
/*
第二遍:
public class Dog extends Animal{//继承Animal类
    Dog(String name,int age,String color){
        super(name,age,color);
    }
    void eat(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在吃骨头...");
    }
    void lookHome(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在看家...");
    }
}
 */
/*
第三遍:
public class Dog extends Animal{//继承Animal类
    Dog(String name,int age,String color){
        super(name,age,color);
    }
    void eat(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在吃骨头...");
    }
    void lookHome(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在看家...");
    }
}
 */