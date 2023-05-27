package string;

import java.util.Locale;
//性能:三目>switch>if
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String str = "我爱Java";
        String upper=str.toUpperCase();

        String lower = str.toLowerCase();
        System.out.println(lower);

        String img = "2Y5jZa";
        String input = "2y5jza";
        //boolean match = img.equals(input);
//        img = img.toLowerCase();
//        input = input.toLowerCase();
//        boolean match = img.equals(input);

        boolean match = img.equalsIgnoreCase(input);
        System.out.println("输入"+(match?"正确":"错误"));

    }
}
