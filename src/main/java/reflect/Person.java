package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

@AutoRunClass
public class Person {
    private String name = "张三";
    private int age = 18;
    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello(){
        System.out.println(name+":hello");
    }
    @AutoRunMethod(6)
    public void sayHi(){
        System.out.println(name+":hi");
    }

    public void sleep(){
        System.out.println(name+"在睡觉");
    }

    public void watchTV(){
        System.out.println(name+"在看电视");
    }

    @AutoRunMethod(3)
    public void playGame(){
        System.out.println(name+"在玩游戏");
    }

    public void say(String info){
        System.out.println(name+":"+info);
    }

    public void say(String info,int count){
        for(int i=0;i<count;i++){
            System.out.println(name+":"+info);
        }
    }

    private void heihei(){
        System.out.println("我是Person的私有方法，嘿嘿嘿~");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
