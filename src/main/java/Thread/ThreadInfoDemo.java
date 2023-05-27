package Thread;

import sun.rmi.server.Activation$ActivationSystemImpl_Stub;

public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        long id = main.getId();
        System.out.println("id"+id);
        String name = main.getName();
        System.out.println("name:"+name);
        int priority = main.getPriority();
        System.out.println("优先级:"+priority);
        boolean isAlive = main.isAlive();
        System.out.println("是否还活着:"+isAlive);
        boolean isDaemon = main.isDaemon();
        System.out.println("是否为守护线程:"+isDaemon);
        boolean isInterrupted = main.isInterrupted();
        System.out.println("是否被中断:"+isInterrupted);
    }
}
