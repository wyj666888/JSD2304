package exception;

import javax.lang.model.type.ReferenceType;

public class FinallyDemo3 {
    public static void main(String[] args) {
//        String a="1234";
//        int b=a.charAt(0)-'0';
//        System.out.println(b);
        System.out.println(test("0")+","+test(null)+","+test(""));
    }
    public static int test(String str){
        try{
            return str.charAt(0)-'0';
        }catch (NullPointerException e){
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
            return 3;
        }
    }
}
