package ooday03;

public class ReArrayDemo {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        Chick[] chicks = new Chick[3];
        Fish[] fish = new Fish[2];

        dogs[0]= new Dog("小强",2,"黑");
        dogs[1] = new Dog("小白",1,"白");
        dogs[2] = new Dog("小黄",3,"黄");
        for (int i=0;i< dogs.length; i++){
            System.out.println(dogs[i].name);
            System.out.println(dogs[i].age);
            System.out.println(dogs[i].color);
            dogs[i].lookHome();
            dogs[i].eat();
            dogs[i].swim();
            dogs[i].drink();
        }

        chicks[0] = new Chick("大公鸡",2,"黄");
        chicks[1] = new Chick("大母鸡",3,"红");
        chicks[2] = new Chick("小公鸡",1,"棕");
        for (int i=0;i< chicks.length; i++){
            System.out.println(chicks[i].name);
            System.out.println(chicks[i].age);
            System.out.println(chicks[i].color);
            chicks[i].layEggs();
            chicks[i].eat();
            chicks[i].drink();

        }

        fish[0] = new Fish("小金",2,"金");
        fish[1] = new Fish("大白",3,"白");
        for (int i=0;i< fish.length;i++){
            System.out.println(fish[i].name);
            System.out.println(fish[i].age);
            System.out.println(fish[i].color);
            fish[i].swim();
            fish[i].eat();
            fish[i].drink();
        }
    }
}
/*
第二遍:
public class ReArrayDemo {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        Chick[] chicks = new Chick[3];
        Fish[] fish = new Fish[2];

        dogs[0]= new Dog("小强",2,"黑");
        dogs[1] = new Dog("小白",1,"白");
        dogs[2] = new Dog("小黄",3,"黄");
        for (int i=0;i< dogs.length; i++){
            System.out.println(dogs[i].name);
            System.out.println(dogs[i].age);
            System.out.println(dogs[i].color);
            dogs[i].lookHome();
            dogs[i].eat();
            dogs[i].swim();
            dogs[i].drink();
        }

        chicks[0] = new Chick("大公鸡",2,"黄");
        chicks[1] = new Chick("大母鸡",3,"红");
        chicks[2] = new Chick("小公鸡",1,"棕");
        for (int i=0;i< chicks.length; i++){
            System.out.println(chicks[i].name);
            System.out.println(chicks[i].age);
            System.out.println(chicks[i].color);
            chicks[i].layEggs();
            chicks[i].eat();
            chicks[i].drink();

        }

        fish[0] = new Fish("小金",2,"金");
        fish[1] = new Fish("大白",3,"白");
        for (int i=0;i< fish.length;i++){
            System.out.println(fish[i].name);
            System.out.println(fish[i].age);
            System.out.println(fish[i].color);
            fish[i].swim();
            fish[i].eat();
            fish[i].drink();
        }
    }
}
 */
/*
第三遍:
public class ReArrayDemo {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        Chick[] chicks = new Chick[3];
        Fish[] fish = new Fish[2];

        dogs[0]= new Dog("小强",2,"黑");
        dogs[1] = new Dog("小白",1,"白");
        dogs[2] = new Dog("小黄",3,"黄");
        for (int i=0;i< dogs.length; i++){
            System.out.println(dogs[i].name);
            System.out.println(dogs[i].age);
            System.out.println(dogs[i].color);
            dogs[i].lookHome();
            dogs[i].eat();
            dogs[i].swim();
            dogs[i].drink();
        }

        chicks[0] = new Chick("大公鸡",2,"黄");
        chicks[1] = new Chick("大母鸡",3,"红");
        chicks[2] = new Chick("小公鸡",1,"棕");
        for (int i=0;i< chicks.length; i++){
            System.out.println(chicks[i].name);
            System.out.println(chicks[i].age);
            System.out.println(chicks[i].color);
            chicks[i].layEggs();
            chicks[i].eat();
            chicks[i].drink();

        }

        fish[0] = new Fish("小金",2,"金");
        fish[1] = new Fish("大白",3,"白");
        for (int i=0;i< fish.length;i++){
            System.out.println(fish[i].name);
            System.out.println(fish[i].age);
            System.out.println(fish[i].color);
            fish[i].swim();
            fish[i].eat();
            fish[i].drink();
        }
    }
}
 */