package ooday05;

public class Point {
    private int x;//创建私有变量
    private int y;
    public int getX(){//返回值为int类型的方法,返回x值
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){//无返回值,传参给x值
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
}
/*
第二遍:
public class Point{
   private int x;
   private int y;
   public int getX(){
      return x;
   }
   public void setX(int x){
     if(x>=0){
         this.x=x;
     }
   }
   public void getY(){
     return y;
   }
   public int getY(){
      this.y=y;
   }
}
 */
