package collection;


import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        c.add(new Point(9,0));
        c.add(new Point(1,2));
        /*
            集合重写了toString，格式为:
            [元素1.toString(), 元素2.toString(), 元素3.toString(), ...]
            由此可见，想更直观的体现元素时，元素也需要妥善重写toString方法。
         */
        System.out.println(c);

        Point p = new Point(1,2);
        /*
        contains:包含
        boolean contains(Object o)
        判断当前集合是否包含给定元素,若包含则返回true
         */
        boolean contains = c.contains(p);
        System.out.println("是否包含："+contains);

        c.remove(p);//删除指定元素一个
        System.out.println(c);
    }
}
