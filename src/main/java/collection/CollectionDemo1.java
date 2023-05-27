package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection c= new ArrayList();

        /*
        boolean add(E e)
        集合提供了添加元素的方法,如果元素成功存入集合则返回true
         */
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        c.add("six");
        System.out.println(c);

        int size = c.size();
        System.out.println("集合元素个数:"+size);

        /*
        boolean isEmpty()   empty:空的
        判断当前集合是否为空集
        当且仅当size为0时,该方法返回true
         */
        boolean isEmpty = c.isEmpty();
        System.out.println("是否为空集:"+isEmpty);

        c.clear();
        System.out.println(c);
        System.out.println("集合元素个数:"+c.size());
        System.out.println("是否为空集:"+isEmpty);

    }
}
