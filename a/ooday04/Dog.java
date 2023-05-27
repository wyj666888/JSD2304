package ooday04;

public class Dog extends Animal implements Swim {//继承Animal类,实现Swim接口
    Dog(String name,int age,String color){
        super(name,age,color);
    }
    void eat(){
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在吃骨头...");
    }
    void lookHome(){
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在看家...");
    }
    public void swim(){//重写接口方法时,要写public
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在游泳...");
    }
}
/*
第二遍:
public class Dog extends Animal implements Swim{//继承Animal类
    Dog(String name,int age,String color){
        super(name,age,color);
    }
    void eat(){
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在吃骨头...");
    }
    void lookHome(){
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在看家...");
    }
    public void swim(){
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在游泳...");
    }
}
 */
/*
第三遍:
public class Dog extends Animal implements Swim{//继承Animal类
    Dog(String name,int age,String color){
        super(name,age,color);
    }
    void eat(){
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在吃骨头...");
    }
    void lookHome(){
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在看家...");
    }
    public void swim(){
        System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在游泳...");
    }
}
 */