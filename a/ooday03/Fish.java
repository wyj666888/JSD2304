package ooday03;

public class Fish extends Animal implements Swim{//继承Animal类、实现Swim接口
    Fish(String name,int age,String color){
        super(name,age,color);
    }
    void eat(){
        System.out.println(color+"色的"+age+"岁的鱼儿"+name+"正在吃小虾...");
    }
    public void swim(){
        System.out.println(color+"色的"+age+"岁的鱼儿"+name+"正在游泳...");
    }
}
/*
第二遍:
public class Fish extends Animal implements Swim{//继承Animal类、实现Swim接口
    Fish(String name,int age,String color){
        super(name,age,color);
    }
    void eat(){
        System.out.println(color+"色的"+age+"岁的鱼儿"+name+"正在吃小虾...");
    }
    public void swim(){
        System.out.println(color+"色的"+age+"岁的鱼儿"+name+"正在游泳...");
    }
}
 */
/*
第三遍:
public class Fish extends Animal implements Swim{//继承Animal类、实现Swim接口
    Fish(String name,int age,String color){
        super(name,age,color);
    }
    void eat(){
        System.out.println(color+"色的"+age+"岁的鱼儿"+name+"正在吃小虾...");
    }
    public void swim(){
        System.out.println(color+"色的"+age+"岁的鱼儿"+name+"正在游泳...");
    }
}
 */