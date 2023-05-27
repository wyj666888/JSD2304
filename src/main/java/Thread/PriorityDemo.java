package Thread;

public class PriorityDemo {
    public static void main(String[] args) {
        Thread min = new Thread(()->{
            long start = System.currentTimeMillis();
            for (int i=0;i<10000;i++){
                System.out.print("min"+i+"次");
//                if (i==9999){
//                    System.out.println("\rmin已结束!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//                }
            }
            long end = System.currentTimeMillis();
            System.out.println("\r线程结束!+耗时:"+(end-start)+"ms");
        });
        Thread max = new Thread(()->{
            long start = System.currentTimeMillis();
            for (int i=0;i<10000;i++){
                System.out.print("max"+i+"次");
//                if (i==9999){
//                    System.out.println("\rmax已结束!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//                }
            }
            long end = System.currentTimeMillis();
            System.out.println("\r线程结束!+耗时:"+(end-start)+"ms");
        });
        Thread norm = new Thread(()->{
            long start = System.currentTimeMillis();
            for (int i=0;i<10000;i++){
                System.out.print("nor"+i+"次");
//                if (i==9999){
//                    System.out.println("\rnorm已结束!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//                }
            }
            long end = System.currentTimeMillis();
            System.out.println("\r线程结束!+耗时:"+(end-start)+"ms");
        });
        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);

        min.start();
        norm.start();
        max.start();
    }
}
