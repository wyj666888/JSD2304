package ooday02;
public class Chick extends Animal{
    Chick(String name,int age,String color){
        super(name,age,color);
    }
    void eat(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在吃小米...");
    }
    void layEggs(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在下蛋...");
    }
}
/*
第二遍:
Chick(String name,int age,String color){
        super(name,age,color);
    }
    void eat(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在吃小米...");
    }
    void layEggs(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在下蛋...");
    }
}
 */
/*
第三遍:
Chick(String name,int age,String color){
        super(name,age,color);
    }
    void eat(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在吃小米...");
    }
    void layEggs(){
        System.out.println(color+"色的"+age+"岁的"+name+"正在下蛋...");
    }
}
 */