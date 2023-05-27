package io;

import java.io.*;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name = "王克晶";
        int age = 18;
        String gender = "女";
        String[] otherInfo = {"黑","嗓门大","java技术好","大家的启蒙老师","来自廊坊佳木斯"};
        Person p = new Person(name,age,gender,otherInfo);
        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p);
        System.out.println("对象写出完毕");
        oos.close();
    }
}
