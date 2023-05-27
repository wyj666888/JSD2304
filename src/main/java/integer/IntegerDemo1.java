package integer;

public class IntegerDemo1 {
    public static void main(String[] args) {
        int i=137217481;
//        Integer i1 = new Integer(i);
//        Integer i2 = new Integer(i);
        Integer i1 = Integer.valueOf(i);
        Integer i2 = Integer.valueOf(i);
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));

        double d = 123.123;
        Double d1 = Double.valueOf(d);
        Double d2 = Double.valueOf(d);
        System.out.println(d1==d2);
        System.out.println(d1.equals(d2));

        int in = i1.intValue();
        System.out.println(in);
        long lon = i1.longValue();
        System.out.println(lon);
        byte b = i1.byteValue();
        System.out.println(b);

        in = d1.intValue();
        System.out.println(in);
        double dou = d1.doubleValue();
        System.out.println(dou);
    }
}
