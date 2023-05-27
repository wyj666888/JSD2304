package ooday05;

public class StaticBlock {
    static {
        System.out.println("静态块");
    }
    StaticBlock(){
        System.out.println("构造方法");
    }
}
/*
第二遍:
public class StaticBlock {
    static {
        System.out.println("静态块");
    }
    StaticBlock(){
        System.out.println("构造方法");
    }
}
*/