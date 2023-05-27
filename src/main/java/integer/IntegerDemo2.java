package integer;

public class IntegerDemo2 {
    public static void main(String[] args) {
        int imax = Integer.MAX_VALUE;
        System.out.println(imax);
        int imin = Integer.MIN_VALUE;
        System.out.println(imin);

        long lmax = Long.MAX_VALUE;
        System.out.println(lmax);
        double dou = Double.MAX_VALUE;
        System.out.println(dou);

        String s1 = "123";
        int i = Integer.parseInt(s1);
        System.out.println(i+1);
        double d= Double.parseDouble(s1);
        System.out.println(d);

        String s2 ="123.123";
        d=Double.parseDouble(s2);
        System.out.println(d);
    }
}
