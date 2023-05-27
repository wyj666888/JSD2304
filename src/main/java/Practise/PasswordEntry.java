package Practise;
import java.util.Scanner;

public class PasswordEntry {
    //数字型密码
    public static void main(String[] args){
        System.out.print("请设置密码(六位数字): ");
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            //控制密码的范围
            while (a < 100000 || a > 999999) {
                System.out.print("\r密码设置错误,非六位数,请重新输入:  ");
                int b = s.nextInt();
                a = b;
            }
            for (int i=0;i<2;i++){
            System.out.print("\r密码设置成功");
            }
        //输入密码,只能输入5次
        for (int i = 1; i <= 6; i++) {
            if (i == 6) {
                System.out.print("\r密码输入已达上限5次");
                break;
            }
            System.out.print("\r请输入密码(共5次,第" + i + "次): ");
            int b = s.nextInt();
            if (b == a) {
                System.out.print("\r密码正确");
                break;
            } else {
                System.out.print("\r密码错误");
            }
        }
    }
}
    //任意密码
   /* public static void main(String[] args) {
        System.out.println("请设置密码: ");
        Scanner s = new Scanner(System.in);
        String a =  s.next();
        int d=a.length();
        while (d!=6) {
            System.out.println("密码设置错误,非六位,请重新输入:  ");
            String n= s.next();
            a=n;
            d=n.length();
        }
        System.out.println("密码设置成功");
        for (int i=1;i<=6;i++) {
            if (i == 6) {
                System.out.println("密码输入已达上限5次");
                break;
            }
            System.out.println("请输入密码(共5次,第" + i + "次): ");
            String b = s.next();
            int c = b.compareTo( a );//用b去比较a
            //int c = b.compareToIgnoreCase(a);//用b去比较a,不考虑大小写
            if (c == 0) {
                System.out.println("密码正确");
                break;
            } else {
                System.out.println("密码错误");
            }
        }
    }*/
    //隐藏设置的密码???
