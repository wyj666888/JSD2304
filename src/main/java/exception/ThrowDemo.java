package exception;

public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setAge(1000);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("此人年龄:"+p.getAge());
    }
}
