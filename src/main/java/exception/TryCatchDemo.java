package exception;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        String line = "";
        try {
            //String line = null;
            //String line = "abc";
            System.out.println(line.length());
            System.out.println(line.charAt(0));
            System.out.println(Integer.parseInt(line));
        }catch (NullPointerException|StringIndexOutOfBoundsException e){
            System.out.println("出现了空指针,并且解决了");
        }catch (Exception e){
            System.out.println("反正就是出了个错!");
        }
        System.out.println("程序结束了");
    }
}
