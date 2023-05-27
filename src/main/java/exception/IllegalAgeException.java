package exception;

/**
 * 自定义异常
 * 通常用来声明那些在项目中满足语法但是不满足业务场景的问题
 * 自定义异常需要做一下几件事:
 * 1:类名要做到见名知义
 * 2:继承Exception(直接或间接继承都可以)
 * 3:提供超类异常提供的所有构造器
 *
 * @author 范传奇
 */
public class IllegalAgeException extends Exception{
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}







