package ooday05;

public class StaticDemo {
    public static void main(String[] args) {
        StaticVar o1=new StaticVar();//a=0,b=0
        o1.show();//a=1,b=1
        StaticVar o2=new StaticVar();//a=0,b=1
        o2.show();//a=1,b=2
        StaticVar o3=new StaticVar();//a=0,b=2
        o3.show();//a=1,b=3
        StaticBlock o4=new StaticBlock();
        StaticBlock o5=new StaticBlock();
        StaticBlock o6=new StaticBlock();
        StaticMethod.test();
    }
}
/*
第二遍:
public class StaticDemo {
    public static void main(String[] args) {
        StaticVar o1=new StaticVar();
        o1.show();
        StaticVar o2=new StaticVar();
        o2.show();
        StaticVar o3=new StaticVar();
        o3.show();
        StaticBlock o4=new StaticBlock();
        StaticBlock o5=new StaticBlock();
        StaticBlock o6=new StaticBlock();
        StaticMethod.test();
    }
}
 */