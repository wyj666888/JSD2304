package string;

public class StartsWithDemo {
    public static void main(String[] args) {
        String line ="www.tedu.com";
        boolean starts = line.startsWith("www.");
        System.out.println("starts"+starts);
        boolean ends = line.endsWith(".cn");
        System.out.println("ends:"+ends);
    }
}
