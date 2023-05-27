package string;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String str="好好学习java";
        StringBuilder builder = new StringBuilder(str);
        builder.append(",为了找个好工作!");
        String line = builder.toString();//转成一个字符串
        System.out.println(line);

        builder.replace(9,16,"就是为了改变世界!");
        System.out.println(builder.toString());

        builder.delete(0,8);
        System.out.println(builder);//不加toString默认也是输出toString返回

        int a = builder.indexOf("!");
        System.out.println(a);
        builder.insert(a,"活着");
        int b = builder.indexOf("!");
        System.out.println(b);
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
    }
}
