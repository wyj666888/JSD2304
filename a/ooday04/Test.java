package ooday04;
public class Test {
    public static void main(String[] args) {
        Animal[] animals= new Animal[5];//创建animals数组,引用Animal类
        animals[0]=new Dog("小黑",2,"黑");//给数组初始化,引用Animal的派生类
        animals[1]=new Dog("小白",4,"白");
        animals[2]=new Fish("小绿",1,"绿");
        animals[3]=new Fish("小金",2,"金");
        animals[4]=new Chick("小黄",2,"黄");
        for (int i=0;i<animals.length;i++){//遍历数组,输出
            System.out.println(animals[i].name);
            animals[i].eat();
            animals[i].drink();
            if (animals[i] instanceof Dog){//与Dog类比较
                Dog dog=(Dog)animals[i];//大转小
                dog.lookHome();
            }
            if (animals[i] instanceof Chick){
                Chick chick=(Chick)animals[i];
                chick.layEggs();
            }
            if (animals[i] instanceof Fish){
                Fish fish=(Fish) animals[i];
            }
            if (animals[i] instanceof Swim){//与有无Swim接口辨别
                Swim s=(Swim)animals[i];//animals[i]强转为Swim
                s.swim();//调用swim方法
            }
        }
        Master master=new Master();
        Dog dog=new Dog("小黑",2,"黑");
        Dog dog1=new Dog("小白",4,"白");
        Fish fish=new Fish("小绿",1,"绿");
        Fish fish1=new Fish("小金",2,"金");
        Chick chick=new Chick("小黄",2,"黄");
        master.feed(dog);
        master.feed(dog1);
        master.feed(fish);
        master.feed(fish1);
        master.feed(chick);
    }
}
/*
第二遍:
public class Test {
    public static void main(String[] args) {
        Animal[] animals= new Animal[5];
        animals[0]=new Dog("小黑",2,"黑");
        animals[1]=new Dog("小白",4,"白");
        animals[2]=new Fish("小绿",1,"绿");
        animals[3]=new Fish("小金",2,"金");
        animals[4]=new Chick("小黄",2,"黄");
        for (int i=0;i<animals.length;i++){
            System.out.println(animals[i].name);
            animals[i].eat();
            animals[i].drink();
            if (animals[i] instanceof Dog){
                Dog dog=(Dog)animals[i];
                dog.lookHome();
            }
            if (animals[i] instanceof Chick){
                Chick chick=(Chick)animals[i];
                chick.layEggs();
            }
            if (animals[i] instanceof Fish){
                Fish fish=(Fish) animals[i];
            }
            if (animals[i] instanceof Swim){
                Swim s=(Swim)animals[i];
                s.swim();
            }
        }
        Master master=new Master();
        Dog dog=new Dog("小黑",2,"黑");
        Dog dog1=new Dog("小白",4,"白");
        Fish fish=new Fish("小绿",1,"绿");
        Fish fish1=new Fish("小金",2,"金");
        Chick chick=new Chick("小黄",2,"黄");
        master.feed(dog);
        master.feed(dog1);
        master.feed(fish);
        master.feed(fish1);
        master.feed(chick);
    }
}
 */
/*
第三遍:
public class Test {
    public static void main(String[] args) {
        Animal[] animals= new Animal[5];
        animals[0]=new Dog("小黑",2,"黑");
        animals[1]=new Dog("小白",4,"白");
        animals[2]=new Fish("小绿",1,"绿");
        animals[3]=new Fish("小金",2,"金");
        animals[4]=new Chick("小黄",2,"黄");
        for (int i=0;i<animals.length;i++){
            System.out.println(animals[i].name);
            animals[i].eat();
            animals[i].drink();
            if (animals[i] instanceof Dog){
                Dog dog=(Dog)animals[i];
                dog.lookHome();
            }
            if (animals[i] instanceof Chick){
                Chick chick=(Chick)animals[i];
                chick.layEggs();
            }
            if (animals[i] instanceof Fish){
                Fish fish=(Fish) animals[i];
            }
            if (animals[i] instanceof Swim){
                Swim s=(Swim)animals[i];
                s.swim();
            }
        }
        Master master=new Master();
        Dog dog=new Dog("小黑",2,"黑");
        Dog dog1=new Dog("小白",4,"白");
        Fish fish=new Fish("小绿",1,"绿");
        Fish fish1=new Fish("小金",2,"金");
        Chick chick=new Chick("小黄",2,"黄");
        master.feed(dog);
        master.feed(dog1);
        master.feed(fish);
        master.feed(fish1);
        master.feed(chick);
    }
}
 */