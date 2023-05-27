package ooday05;

public class EnumTest {
    public static void main(String[] args) {
        Seasons[] seasons=Seasons.values();
        for(int i=0;i<seasons.length;i++){
             System.out.println(seasons[i]);
        }
        Seasons s=Seasons.WINTER;
        switch (s){
            case SPRING:
                System.out.println("春天到了...");
                break;
            case SUMMER:
                System.out.println("夏天到了...");
            case AUTUMN:
                System.out.println("秋天到了...");
                break;
            case WINTER:
                System.out.println("冬天到了...");
                break;
        }
    }
}
/*
第二遍:
public class EnumTest {
    public static void main(String[] args) {
   Seasons s = Seasons.WINTER;
           System.out.println(s.getSeasonName()+","+s.getSeasonDesc());

           Seasons[] seasons = Seasons.values();
           for(int i=0;i<seasons.length;i++){
               System.out.println(seasons[i]);
               System.out.println(seasons[i].getSeasonName());
               System.out.println(seasons[i].getSeasonDesc());
        }
    }
}
 */