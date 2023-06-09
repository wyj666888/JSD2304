package collection;

import java.util.Comparator;

public class LambdaDemo {
    public static void main(String[] args) {
        Comparator<String> c1 = new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
        Comparator<String> c2 = (String o1, String o2) ->{
            return o1.length()-o2.length();
        };
        Comparator<String> c3 = (o1, o2) -> o1.length()-o2.length();
    }
}
