package string;

public class ChatAtDemo {
    public static void main(String[] args) {
        String line="thinking in java";
        char c=line.charAt(9);
        System.out.println(c);
        c=line.charAt(13);
        System.out.println(c);

        String str="上海自来水来自海上";
        for(int i=0;i<str.length()/2;i++){
            char c1=str.charAt(i);
            char c2=str.charAt(str.length()-1-i);
            if (c1!=c2){
                System.out.println("不");
                break;
            }
        }
        System.out.println("是回文");
    }
}
