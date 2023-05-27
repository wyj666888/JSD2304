package ooday03;

public class DaNei {
    public static void main(String[] args) {
        System.out.println("达内员工管理系统设计:");
        System.out.println("雇员超类:名字,年龄,工资,上班打卡(){},下班打卡(){},abstract 完成工作()");
        System.out.println("企业顾问接口:解决企业问题(),培训员工()");
        System.out.println("技术作者接口:编辑书籍");
        System.out.println("教研总监类: 继承雇员超类,实现企业顾问接口,重写4个抽象方法");
        System.out.println("讲师类: 继承雇员超类,实现企业顾问接口,,重写4个抽象方法");
        System.out.println("项目经理: 继承雇员超类,实现技术作者接口,重写2个抽象方法");
        System.out.println("班主任类: 继承雇员超类,重写1个抽象方法");
    }
}
