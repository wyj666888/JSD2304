package exception;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            String str = "null";
            System.out.println(str.length());
            return;//结束方法，结束前finally还是要执行的
        } catch (Exception e) {
            System.out.println("出错了");
        }finally {
            System.out.println("finally中的代码执行了");
        }
        System.out.println("程序结束了");
    }
}
