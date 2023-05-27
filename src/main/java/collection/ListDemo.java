package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        /*
        E get(int index)
        获取list集合中指定下标处对应的元素
         */
        String e = list.get(2);
        System.out.println(e);
        //List集合可以使用普通的for循环遍历
        for (int i=0;i<list.size();i++){
            e = list.get(i);
            System.out.println(e);
        }
        /*
        E set(int index,E e)
        将给定元素e设置到指定下标index处,返回值为被替换的元素
        该方法是替换元素的操作
         */
        String old = list.set(3,"six");
        System.out.println(list);
        System.out.println("被替代的元素:"+old);

//        for (int i=0;i<list.size()/2;i++){
//            String c1= list.set(i, list.get(list.size()-1-i));
//            list.set(list.size()-1-i,c1);
//        }
//
//        for (int i=0;i<list.size()/2;i++){
//            list.set(list.size()-1-i,list.set(i, list.get(list.size()-1-i)));
//        }
        for (int i=0;i<list.size()/2;i++){
            list.set(i,list.set(list.size()-1-i,list.get(i)));
        }
        System.out.println(list);
    }
}
