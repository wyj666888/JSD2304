package exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ThrowsDemo {
    public void dosome() throws IOException, AWTException {
    }
}
class SubClass extends ThrowsDemo{
//    允许不再抛出任何异常
//    public void dosome(){
//    }
//
//    允许仅抛出部分异常
//    public void dosome()throws IOException{
//    }
//
//    允许抛出超类方法声明抛出异常的子类型异常
    public void dosome()throws FileNotFoundException {
    }
//不允许抛出额外异常(超类方法没有声明的且不存在继承关系的)
//    public void dosome()throws SQLException {
//    }

    //不允许抛出超类方法抛出异常的超类型异常
//    public void dosome()throws Exception {
//    }
}
