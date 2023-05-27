package ooday02;
public class Student extends Person {
    String stuId;
    String className;
    Student(){}
    Student(String name,int age,String address,String stuId,String className){
        super(name,age,address);
        this.className=className;
        this.stuId=stuId;
    }
    void study() {
        System.out.println(name + "正在学习...");
    }
    void sayhi(){
        System.out.println("大家好,我叫"+name+",今年"+age+"岁了,家住"+address+",所在班级为"+className+",学号为"+stuId);
    }
}
/*
第二遍:
public class Student extends Person {
    String stuId;
    String className;
    Student(){}
    Student(String name,int age,String address,String stuId,String className){
        super(name,age,address);
        this.className=className;
        this.stuId=stuId;
    }
    void study() {
        System.out.println(name + "正在学习...");
    }
    void sayhi(){
        System.out.println("大家好,我叫"+name+",今年"+age+"岁了,家住"+address+",所在班级为"+className+",学号为"+stuId);
    }
}
 */
/*
第三遍:
public class Student extends Person {
    String stuId;
    String className;
    Student(){}
    Student(String name,int age,String address,String stuId,String className){
        super(name,age,address);
        this.className=className;
        this.stuId=stuId;
    }
    void study() {
        System.out.println(name + "正在学习...");
    }
    void sayhi(){
        System.out.println("大家好,我叫"+name+",今年"+age+"岁了,家住"+address+",所在班级为"+className+",学号为"+stuId);
    }
}
 */