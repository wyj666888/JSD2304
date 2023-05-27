package ooday05;

public class GetterSetterDemo {
    public static void main(String[] args) {
        Point a=new Point();//创建Point类型的对象a
        a.setX(100);
        a.setX(200);
        System.out.println(a.getX()+","+a.getY());
    }
}
/*
第二遍:
public class GetterSetterDemo{
    public static void main(String[] args){
    Point p =new Point();
    p.setX(100);
    P.setY(200);
    System.out.println(a.getX()+","+p.getY());
    }
}
 */