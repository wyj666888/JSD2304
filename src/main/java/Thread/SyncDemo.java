package Thread;



public class SyncDemo {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread(){
            public void run() {
                while (true) {
                    int bean = table.getBean();
                    Thread.yield();
                    System.out.println(getName() + ":" + bean);
                }
            }
        };
        Thread t2 = new Thread(){
            public void run() {
                while (true) {
                    int bean = table.getBean();
                    Thread.yield();
                    System.out.println(getName() + ":" + bean);
                }
            }
        };
        t1.start();
        t2.start();
    }

}

class Table{
    private int beans = 20;
    /**
     * 当一个方法被关键字synchronized修饰后，该方法称为同步方法
     * 即:多个线程不能同时在方法内部执行
     * 将多个线程并发操作改为有先后顺序的同步执行就可以有效的解决多线程并发安全问题
     */
    public synchronized int getBean() {
        if(beans==0){
        throw new RuntimeException("没有豆子了!");
    }
    Thread.yield();
    return beans--;
    }
}