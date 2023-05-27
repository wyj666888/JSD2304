package ooday04;
interface Inter{}//创建Inter接口
interface InterInter{//创建InterInter接口
    void show();//创建不完整方法show
}
public class InnerTest {//创建InnerTest类
    public static void main(String[] args) {
        Inter o1=new Inter() {};//创建Inter的匿名内部类对象
        Inter o2=new Inter() {};
        InterInter o3=new InterInter(){//创建InterInter的匿名内部对象
            public void show(){
                System.out.println("show1");
            }
        };
        o3.show();//调用o3的show方法
        InterInter o4=new InterInter(){
            public void show(){
                System.out.println("show2");
            }
        };
        o4.show();
    }
}
/*
第二遍:
interface Inter{}
interface InterInter{}
void show();
public class InnerTest{
public static void main(String[] args){
      Inter o1=new Inter(){};
      Inter o2=new Inter(){};
      InterInter o3=new InterInter(){
      public void show(){
      System.out.println("show1");
      }
      };
      o3.show();
      InterInter o4=new InterInter(){
      public void show(){
      System.out.println("show2");
      }
      };
      o4.show();
}
 */
/*
第三遍:
interface Inter{}
interface InterInter{}
public class InnerTest{
    public static void main(String args){
    Inter o1=new Inter(){};
    Inter o2=new Inter(){};
    InterInter o3=new InterInter(){
    public void show(){
      System.out.println("show1")
    }
    };
    o3.show();
    InterInter o4=new InterInter(){
      public void show(){
       System.out.println("show2")
      }
    };
    o4.show;
    }
}
 */
