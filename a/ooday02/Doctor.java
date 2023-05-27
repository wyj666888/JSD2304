package ooday02;
public class Doctor extends Person {
    String title;
    Doctor(String name,int age,String address,String title){
            super(name,age,address);
            this.title = title;
    }
    void cut(){
        System.out.println(name+"正在做手术...");
    }
}
/*
第二遍:
public class Doctor extends Person {
    String title;
    Doctor(String name,int age,String address,String title){
            super(name,age,address);
            this.title = title;
    }
    void cut(){
        System.out.println(name+"正在做手术...");
    }
}
 */
/*
第三遍:
public class Doctor extends Person {
    String title;
    Doctor(String name,int age,String address,String title){
            super(name,age,address);
            this.title = title;
    }
    void cut(){
        System.out.println(name+"正在做手术...");
    }
}
 */