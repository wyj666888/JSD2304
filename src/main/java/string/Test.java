package string;

public class Test {
    public static void main(String[] args) {
        String s1="www.tedu.cn";
        String s2="http://www.tarena.com.cn";
        String name1=getHostName(s1);
        System.out.println(name1);
        String name2=getHostName(s2);
        System.out.println(name2);

    }
    public static String getHostName(String url){
        int a=url.indexOf(".")+1;//找到开始截取的位置(第一个"."之后的字符的位置)
        int b=url.indexOf(".",a);//找到截取的结束位置,第二个"."的位置
        String c=url.substring(a,b);
        return c;
    }
}
