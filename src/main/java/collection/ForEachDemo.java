package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        for (String e :c){
            System.out.println(e);
        }
        c.forEach(e -> System.out.println(e));
        //当拉lambda表达式的参数与方法体中调用方法的参数一致时,可以用::
        c.forEach(System.out::println);
    }
}
