package apidemo;
/**
 * 文档注释
 * 文档注释是功能级别的注释,用来说明类,方法和常量的功能.
 * 文档注释可以通过javadoc命令生成手册(与官方api手册一样的一套页面)
 *
 * 在类使用时,用来说明当前类的整体作用和功能介绍
 * @author 范传奇
 * @see java.lang.String
 * @version 1.0
 *
 *
 */
public class DocDemo {
    /**
     * sayHello方法中使用的问候语
     */
   public static final String INFO="你好:";

    /**
     *
     * @param name
     * @return
     */

public String sayHello(String name){
    return INFO+name;
}
}