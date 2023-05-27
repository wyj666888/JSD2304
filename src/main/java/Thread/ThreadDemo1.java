package Thread;

public class ThreadDemo1 {
    /**
     * 多线程
     * 线程:程序中一个单一的顺序执行流程，即：线性流程
     * 多线程:多个线性流程"一起"执行。
     *
     * 线程是并发运行的。
     * 并发：线程间的代码在微观世界都是走走停停的，宏观上给我们的感受是在一起执行
     *
     * 线程的创建
     * 第一种方式:继承Thread并重写run方法
     *
     */
    public static void main(String[] args) {
        Thread a = new MyThread1();
        Thread b = new MyThread2();
        a.start();
        b.start();
    }
}

/**
 * 第一种创建线程的方式的优点:结构简单，利于匿名内部类创建
 * 缺点:
 * 1:存在继承冲突问题，由于java是单继承的，这导致如果我们继承了Thread就无法再
 *   继承其他类去复用方法。这在实际开发中是极其不方便的
 * 2:当我们继承Thread并重写run方法，在run方法中定义线程要执行的任务。这会导致
 *   线程与任务存在一个必然的耦合关系，不利于线程的重用。
 */
class MyThread1 extends Thread{
    public void run(){
        for (int i=0;i<1000;i++){
            System.out.println("你是谁啊?");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for (int i=0;i<1000;i++){
            System.out.println("开门!查水表的!!");
        }
    }
}