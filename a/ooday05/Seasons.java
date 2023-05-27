package ooday05;

public enum Seasons {
    SPRING,SUMMER,AUTUMN,WINTER
}
/*
第二遍:
public enum Seasons{//复杂版
     SPRING("春天","暖和"),
     SUMMER("夏天","热"),
     AUTUMN("秋天","凉爽"),
     WINTER("冬天","冷");
     private String seasonName;
     private String seasonDesc;
       Seasons(String seasonName, String seasonDesc) {
           this.seasonName = seasonName;
           this.seasonDesc = seasonDesc;
       }
       public String getSeasonName() {
           return seasonName;
       }
       public void setSeasonName(String seasonName) {
           this.seasonName = seasonName;
       }
       public String getSeasonDesc() {
           return seasonDesc;
       }
       public void setSeasonDesc(String seasonDesc) {
           this.seasonDesc = seasonDesc;
       }
   }
}
 */