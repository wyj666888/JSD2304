package Practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        // 初始化学生信息Map
        Map studentInfo = new HashMap<>();
        studentInfo.put("101", "张三");
        studentInfo.put("102", "李四");
        studentInfo.put("103", "王五");

        // 通过键盘输入学号
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学号：");
        String studentId = scanner.nextLine();

        // 判断学号是否在Map中存在
        if(studentInfo.containsKey(studentId)) {
            String studentName = (String) studentInfo.get(studentId);
            System.out.println("该学号对应的姓名为：" + studentName);
        } else {
            System.out.println("该学号不存在！");
        }
    }
}