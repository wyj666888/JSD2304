package Thread;

public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable r1 = new MyRunnable1();
        Runnable r2 = new MyRunnable2();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}

class MyRunnable1 implements Runnable{
    public void run(){
        int count = 0;
        for (int i=0;i<1000;i++){
            if (count++==10){
                System.out.println();
                count=0;
            }
            System.out.print("你是谁?");
        }
    }
}
class MyRunnable2 implements Runnable{
    public void run(){
        int count=0;
        for (int i=0;i<1000;i++){
            if (count++==10){
                System.out.println();
                count=0;
            }
            System.out.print("我是你爷爷!");
        }
    }
}