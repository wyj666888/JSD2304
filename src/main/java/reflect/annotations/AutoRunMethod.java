package reflect.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoRunMethod {
 /*
        注解可以定义参数
        格式:
        类型 参数名() [default 默认值]    //[]中的内容可有可无

        参数如果指定了默认值，那么使用该注解时可以不指定参数。
        如果没有指定默认值，则使用该注解时必须指定参数

        如果注解中只声明了一个参数时，参数名推荐使用"value"
        原因:
        正常情况下，当我们在注解中声明一个参数时，外面使用该注解为该参数赋值时
        格式如下:
        @注解名(参数名=参数值)

        例如:
        当前注解@AutoRunMethod中定义了一个int行的参数，名字为count:
        public @interface AutoRunMethod {
            int count() default 1;
        }

        那么外面在使用该注解时，格式如下
        @AutoRunMethod(count=3)
        public void sayHi(){....}


        如果注解定义了多个参数，比如:
        public @interface AutoRunMethod {
            int count() default 1;
            String name();
        }

        外界使用时，为参数赋值的格式
        1:
            @AutoRunMethod(count=3,name="张三")
            public void sayHi(){....}

        2:
            @AutoRunMethod(name="张三",count=3)
            public void sayHi(){....}

        3:
            @AutoRunMethod(name="张三")   //因为count指定了默认值
            public void sayHi(){....}


        多个参数时，上述写法优点:可读性强  缺点:啰嗦
        但是对于只有一个参数的情况下:
        @AutoRunMethod(count=1)   对于一个参数时，不存在混淆问题，之带来啰嗦
        @AutoRunMethod(1)         优雅~
        为了解决该问题，java建议当注解只有一个参数时，参数名取名为value，此时
        允许我们不指定参数名:@AutoRunMethod(1)

        对于多参数时，就算某个参数取名为value，使用该直接为参数赋值时也不能
        省略参数名:
        public @interface AutoRunMethod {
            int value();
            String name();
        }

        @AutoRunMethod(value=1,name="XXXX")   可以
        @AutoRunMethod(name="XXXX",value=1)   可以
        @AutoRunMethod(name="XXXX",1)       不可以
        @AutoRunMethod(1,name="XXXX")       不可以
     */
    int value() default 1;
}
