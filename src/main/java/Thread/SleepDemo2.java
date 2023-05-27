package Thread;

/**
 * sleep方法要求必须处理中断异常
 * 当一个线程调用sleep方法处于睡眠阻塞的过程中，如果此时该线程的interrupt()方法被
 * 调用，此时会中断该线程的睡眠阻塞，那么sleep方法就会抛出中断异常。
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread("林永健"){
            public void run(){
                System.out.println(getName()+":刚美完容,睡一会吧...");
                try {
                    Thread.sleep(50000);
                } catch (InterruptedException e) {
                    System.out.println(getName()+":干嘛呢!干嘛呢!干嘛呢!都破了相了!");
                }
                System.out.println(getName()+":醒了");
            }
        };
        Thread huang = new Thread("黄宏"){
            public void run(){
                System.out.println(getName()+":大锤80,小锤40,开始砸墙!");
                for (int i=0;i<5;i++){
                    System.out.println(getName()+":80!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("哐当!!!!");
                System.out.println(getName()+":大哥!搞定!");
                lin.interrupt();
            }
        };
        lin.start();
        huang.start();
    }
}
