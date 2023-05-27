package ooday01;

public class Car {
    String brand;
    double price;
    String color;
    Car(){}
    Car(String brand,String color,double price){
        this.brand=brand;
        this.color=color;
        this.price=price;
    }

    void start(){
        System.out.println(brand+"牌子的"+color+"色的"+price+"块钱的车启动了");
    }
    void run(){
        System.out.println(brand+"牌子的"+color+"色的"+price+"块钱的车跑了");
    }
    void stop(){
        System.out.println(brand+"牌子的"+color+"色的"+price+"块钱的车停止了");
    }
}
