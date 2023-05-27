package Thread;

public class SyncDemo3 {
    public static void main(String[] args) {
        Boo b1 = new Boo();
        Boo b2 = new Boo();
        new Thread(()->b1.dosome()).start();
        new Thread(()->b2.dosome()).start();
    }
}
class Boo{
 //   public synchronized static void dosome(){
    public static void dosome(){
        /*
            在静态方法中使用同步块时，同步监视器对象还是使用当前类的类对象
            获取类对象的方式:类名.class
            例如获取Foo的类对象就是:Foo.class
         */
            synchronized (Boo.class) {
            try {
                Thread t = Thread.currentThread();
                System.out.println(t.getName() + ":正在执行dosome方法...");
                Thread.sleep(5000);
                System.out.println(t.getName() + ":执行dosome方法完毕!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}