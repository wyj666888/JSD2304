package string;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args){
        String line = "abc123asd5644saf32asf66adf";
        String[] data = line.split("[0-9]+");
        System.out.println(Arrays.toString(data));
        data = line.split("[a-z]");
        System.out.println(data.length);
        System.out.println(Arrays.toString(data));

        String line2 = "=====a=b=============c=d===e=f====";
        String[] data2 = line2.split("=");
        System.out.println(data2.length);
        System.out.println(Arrays.toString(data2));
    }
}
