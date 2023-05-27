package string;

public class TrimDemo {
    public static void main(String[] args) {
        String line="         hello world      ";
        System.out.println(line);
        String trim=line.trim();//trim可以去掉字符串两边的空白
        System.out.println(trim);
    }
}
