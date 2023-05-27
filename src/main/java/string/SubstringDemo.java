package string;

public class SubstringDemo {
    public static void main(String[] args) {
        String line ="ww.tddu.cn";
        String sub=line.substring(4,8);
        System.out.println(sub);

        sub=line.substring(4);
        System.out.println(sub);
    }
}
