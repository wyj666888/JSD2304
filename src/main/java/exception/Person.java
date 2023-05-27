package exception;

public class Person {
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age) throws IllegalAccessException{
        if (age<0||age>100000){
            throw new IllegalAccessException("年龄超出范围");
        }
        this.age=age;
    }
}
