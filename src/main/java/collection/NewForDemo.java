package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class NewForDemo {
    public static void main(String[] args) {
        String[] arr={"one","two","three","four","five","six","seven"};
        for (String e : arr){
            System.out.println(e);

            Collection<String> c = new ArrayList<>();
            c.add("one");
            c.add("two");
            c.add("three");
            c.add("four");
            c.add("five");
            c.add("six");
            for (Object s : c){
                System.out.println(s);
            }
            Iterator<String> it = c.iterator();
            while (it.hasNext()){
                String s = it.next();
                System.out.println(s);
            }
        }
    }
}
