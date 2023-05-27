package exception;

public class ExceptionAPIDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            String str = "abc";
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            //输出错误堆栈跟踪信息便于程序员找到错误根源，分析错误原因制定B计划
            e.printStackTrace();//输出错误信息
            //错误消息多用于提示给用户或记录日志使用
            String message = e.getMessage();//获取错误消息
            System.out.println(message);
        }
        System.out.println("程序结束了");
    }
}
