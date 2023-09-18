package com.example.week1_android;

// package com.microsoft.myapplication;
// Paste in Kotlin file and it will give you an option to convert
public class Story1 {


    // this part makes code very difficult to understand due to if statements
    public static void printEmployeeSalary(Employee employee) {
        if (employee.employeeType.equals("Contractor")) {
            System.out.println("Contractor Salary: $100,000");
        } else if (employee.employeeType.equals("Full Time")) {
            System.out.println("Full Time Salary: $150,000");
        } else if (employee.employeeType.equals("Intern")) {
            System.out.println("Intern Salary: $50,000");
        }
    }

    public static void printHelloWorld() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World" + i); // concatenation
        }
    }

    public static int calculate(int input1, int input2) { // returninng int trasnferring to a variabl
        return input1 + input2;
    }

    public static void calculate2(int a, int b) {
        System.out.println(a + b);
    }

}


// blue print of data which represents an employee with employee data
class Employee {

    // data
    String employeeName;
    String employeeType; // fulltime, intern, contractor
    int employeeId;


    // parameter / argument
    Employee(String employeeName, String employeeType, int employeeId) {
        this.employeeType = employeeType;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    // toString() -> method
    public String toString() {
        return "Employee Name: " + employeeName + "\nEmployee First Character: " + employeeType + "\nEmployee ID: " + employeeId;
    }
}

class Contractor extends Employee {

    String salary = "$100,000";

    Contractor(String employeeName, String employeeType, int employeeId) {
        super(employeeName, employeeType, employeeId);
    }

    public String toString() {
        return super.toString() + "\n Salary = " + salary;
    }
}

// Intern & Fulltime
class Intern extends Employee {

    String salary = "$50,000";

    Intern(String employeeName, String employeeType, int employeeId) {
        super(employeeName, employeeType, employeeId);
    }

    public String toString() {
        return super.toString() + "\n Salary = " + salary;
    }
}

class FullTime extends Employee {

    String salary = "$150,000";

     FullTime(String employeeName, String employeeType, int employeeId) {
        super(employeeName, employeeType, employeeId);
    }

    public String toString() {
        return super.toString() + "\n Salary = " + salary;
    }
}