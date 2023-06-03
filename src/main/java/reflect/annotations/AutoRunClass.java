package reflect.annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 注解是JDK5之后推出的特性，可以辅助我们在反射中做更多操作，注解被大量的应用于框架中
 *
 * 元注解:JAVA定义了许多元注解，用于说明我们定义的注解的一些特性
 * @Target:用于指定当前注解可以被应用于哪里，不指定时，注解可以被应用于任何可被使用的地方
 *         可以使用ElementType来指定注解可以被应用的位置
 *         例如:
 *         ElementType.TYPE   注解在类上可以被使用
 *         ElementType.METHOD 注解可以在方法上被使用
 *         ElementType.FIELD  注解可以在属性上被使用
 *         ElementType.CONSTRUCTOR 注解可以在构造器上被使用
 *         ...
 *
 * @Retention:用来说明当前注解的保留级别，级别有三种
 *            RetentionPolicy.SOURCE    注解仅保留在源代码中
 *            RetentionPolicy.CLASS     注解保留在字节码文件中但不能被反射机制使用
 *            RetentionPolicy.RUNTIME   注解保留在字节码文件中且可以被反射机制使用
 *
 *            当不指定@Retention时，注解默认的保留级别为CLASS
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoRunClass {
}
