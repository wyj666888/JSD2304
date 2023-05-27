package Thread;

public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread t1 = new Thread("王克晶"){
            public void run(){
                shop.buy();
            }
        };
        Thread t2 = new Thread("范传奇"){
            public void run(){
                shop.buy();
            }
        };
        t1.start();
        t2.start();
    }
}

class Shop {
//      public synchronized void buy(){
    public void buy() {
        try {
            Long e = System.currentTimeMillis();
            Thread t = Thread.currentThread();
            long a = System.currentTimeMillis();
            System.out.print(t.getName() + ":正在挑衣服...");
            Thread.sleep(3000);
            long b = System.currentTimeMillis();
            System.out.println(t.getName()+"挑衣服耗时:"+(b-a)+"ms");
            synchronized (this) {
                long c = System.currentTimeMillis();
                System.out.print(t.getName() + ":正在试衣服...");
                Thread.sleep(5000);
                long d = System.currentTimeMillis();
                System.out.println(t.getName()+"试衣服耗时:"+(d-c)+"ms");
            }
                System.out.print(t.getName() + ":结账离开...");
            long f = System.currentTimeMillis();
            System.out.println(t.getName()+"总耗时:"+(f-e)+"ms");
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
