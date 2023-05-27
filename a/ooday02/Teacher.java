package ooday02;
public class Teacher extends Person {
    double salary;
    Teacher(){}
    Teacher(String name,int age,String address,double salary){
        super(name,age,address);
        this.salary = salary;
    }
    void teach(){
        System.out.println(name+"正在讲课...");
    }
    void sayhi(){
        System.out.println("大家好,我叫"+name+",今年"+age+"岁了,家住"+address+",工资为"+salary);
}
}
/*
第二遍:
public class Teacher extends Person {
    double salary;
    Teacher(){}
    Teacher(String name,int age,String address,double salary){
        super(name,age,address);
        this.salary = salary;
    }
    void teach(){
        System.out.println(name+"正在讲课...");
    }
    void sayhi(){
        System.out.println("大家好,我叫"+name+",今年"+age+"岁了,家住"+address+",工资为"+salary);
}
}
 */
/*
第三遍:
public class Teacher extends Person {
    double salary;
    Teacher(){}
    Teacher(String name,int age,String address,double salary){
        super(name,age,address);
        this.salary = salary;
    }
    void teach(){
        System.out.println(name+"正在讲课...");
    }
    void sayhi(){
        System.out.println("大家好,我叫"+name+",今年"+age+"岁了,家住"+address+",工资为"+salary);
}
}
 */