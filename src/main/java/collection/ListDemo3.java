package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);
        //E.subList()截取范围内的值,含头不含尾
        List<Integer> subList = list.subList(3,8);
        System.out.println(subList);

        for (int i=0;i<subList.size();i++){
            subList.set(i,subList.get(i)*10);
        }
        System.out.println(subList);
        System.out.println(list);

        list.subList(2,9).clear();
        System.out.println(list);
    }
}
