import java.io.*;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name) { //Employee 类的构造器
        this.name = name;
    }

    public void empAge(int empAge) {
        age = empAge;
    }

    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    public void empSalary(double emsSalary) {
        salary = emsSalary;
    }

    public void print_0() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(designation);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");
        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.print_0();

        empTwo.empAge(10);
        empTwo.empDesignation("初级程序员");
        empTwo.empSalary(500);
        empTwo.print_0();

    }
}
