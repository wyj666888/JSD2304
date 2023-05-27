package Thread;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println(main);
        dosome();
        Thread myThread = new Thread(() -> dosome());
        myThread.start();
    }
    public static void dosome(){
        Thread t = Thread.currentThread();
        System.out.println("执行dosome方法的线程是:"+t);
    }
}
