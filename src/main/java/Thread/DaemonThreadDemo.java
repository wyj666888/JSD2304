package Thread;

public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread("rose"){
            public void run(){
                for (int i=0;i<5;i++){
                    System.out.println(getName()+":let me go!!!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(getName()+":啊啊啊啊啊AAAAAaaaaa....");
                System.out.println("噗通!");
            }
        };

        Thread jack = new Thread("jack"){
            public void run(){
                while (true) {
                    System.out.println(getName() + ":you jump!i jump!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        jack.setDaemon(true);
        jack.start();
        rose.start();
        //main线程是最先结束的
    }
}
