package Thread;

public class SyncDemo4 {
    public static void main(String[] args) {
        Foo foo = new Foo();
        new Thread(foo::methodA).start();
        new Thread(foo::methodB).start();
    }
}
class Foo{
    public  synchronized void methodA(){
        try {
            Thread t= Thread.currentThread();
            System.out.println(t.getName()+":正在执行A方法...");
            Thread.sleep(5000);
            System.out.println(t.getName()+":执行A方法完毕!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public  synchronized void methodB(){
        try {
            Thread t= Thread.currentThread();
            System.out.println(t.getName()+":正在执行B方法...");
            Thread.sleep(5000);
            System.out.println(t.getName()+":执行B方法完毕!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}