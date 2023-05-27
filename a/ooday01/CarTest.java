package ooday01;
public class CarTest {
    public static void main(String[] args)
            throws InterruptedException {
        for (int i = 1; i >= 0; i--) {
            System.out.print("\r倒计时：" + i + "秒");//
            Thread.sleep(1000);//延时
        }
        System.out.println("\n倒计时结束！");
    }
}