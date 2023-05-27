package exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class AutoCloseableDemo {
    public static void main(String[] args) {
        //自动关闭特性是编译器认可的，编译后就变成FinallyDemo2的样子
        try(
                /*
                    try()中可以声明的对象对应的类必须实现了AutoCloseable接口
                 */
                //只有在finally中最后会调用close方法关闭的对象才在这里声明并初始化
                FileOutputStream fos = new FileOutputStream("fos.dat");
        ){
            fos.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
