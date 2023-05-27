package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("唐僧");
        list.add("沙悟净");
        list.add("观音菩萨");
        list.add("老子");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        //Collections.sort(list, (o1, o2) -> -(o1.length()-o2.length()));
        list.sort((o1,o2)->-(o1.length()-o2.length()));
        System.out.println(list);
    }
}
