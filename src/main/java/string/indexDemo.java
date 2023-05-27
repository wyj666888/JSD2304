package string;

public class indexDemo {
    public static void main(String[] args) {
        String line="thinking in java";
        int index=line.indexOf("in");
        System.out.println(index);

        index=line.indexOf("in",3);
        System.out.println(index);

        index = line.lastIndexOf("in");
        System.out.println(index);

        index = line.indexOf("IN");
        System.out.println(index);
    }
}
