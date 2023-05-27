package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        c.add("#");
        Iterator iterator = c.iterator();
        while (iterator.hasNext()){
            String str = (String)iterator.next();
            //书写习惯:字符串变量与字面比较时用字面量.equals(变量),避免空指针的产生
            //if(str.equals(#)){
            if ("#".equals(str)){
                iterator.remove();
            }
            System.out.println(str);
        }
        System.out.println(c);
    }
}
