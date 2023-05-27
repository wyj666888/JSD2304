package string;

public class ReplaceAllDemo {
    public static void main(String[] args){
        String line = "abc123asd5644saf32asf66adf";
        line=line.replaceAll("[a-zA-Z]","*");
        System.out.println(line);

        String regex = "(wqnmlgb|dsb|nc|tmd|nmd|wdnmd|cnm|djb)";
        String message = "wanmlgb,你这个dsb,你怎么这么的nc,你绝对是个djb!";
        message = message.replaceAll(regex,"***");
        System.out.println(message);
    }
}
