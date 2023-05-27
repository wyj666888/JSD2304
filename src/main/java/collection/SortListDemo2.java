package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(1,2));
        list.add(new Point(15,28));
        list.add(new Point(91,52));
        list.add(new Point(13,68));
        list.add(new Point(4,8));
        System.out.println(list);
       //  Collections.sort(list);//编译不通过
        //MyComparator comparator = new MyComparator();

        Collections.sort(list,new Comparator<Point>(){
        public int compare(Point o1, Point o2) {
            int olen1=o1.getX()* o1.getY();
            int olen2=o2.getX()* o2.getY();
            return olen1-olen2;
        }
      });
        System.out.println(list);
    }
}

class MyComparator implements Comparator<Point>{
    @Override
    public int compare(Point o1, Point o2) {
        int olen1=o1.getX()* o1.getY();
        int olen2=o2.getX()* o2.getY();
        return olen1-olen2;
    }
}