package reflect;

import reflect.annotations.AutoRunMethod;

public class Student {
    private String name="张三";
    private int age = 18;
    private char gender = '男';

    public Student(){}

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void sayHello(){
        System.out.println(name+":hello");
    }
    @AutoRunMethod
    public void sayHi(){
        System.out.println(name+":hi");
    }

    public void sleep(){
        System.out.println(name+"在睡觉");
    }
    @AutoRunMethod
    public void study(){
        System.out.println(name+"good good study,day day up！");
    }

    @AutoRunMethod
    public void playGame(){
        System.out.println(name+"在玩游戏");
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
