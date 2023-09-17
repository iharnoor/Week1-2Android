package com.example.week1_android.kotlinlearning

// package com.microsoft.myapplication;
// Paste in Kotlin file and it will give you an option to convert
object Story1 {
    // this part makes code very difficult to understand due to if statements
    //Todo cover concepts of Switch here
    fun printEmployeeSalary(employee: Employee) {
        if (employee.employeeType == "Contractor") {
            println("Contractor Salary: $100,000")
        } else if (employee.employeeType == "Full Time") {
            println("Full Time Salary: $150,000")
        } else if (employee.employeeType == "Intern") {
            println("Intern Salary: $50,000")
        }
    }

    fun printHelloWorld() {
        for (i in 1..5) {
            println("Hello World$i") // concatenation
        }
    }

    fun calculate(input1: Int, input2: Int): Int { // returninng int trasnferring to a variabl
        return input1 + input2
    }

    fun calculate2(a: Int, b: Int) {
        println(a + b)
    }
} // blue print of data which represents an employee with employee data

 open class Employee(private var employeeName: String, var employeeType: String, var employeeId: Int) {

     fun getEmployeeName(): String {
         return employeeName
     }

    // toString() -> method
    override fun toString(): String {
        return "Employee Name: $employeeName\nEmployee First Character: $employeeType\nEmployee ID: $employeeId"
    }
}

internal class Contractor(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {

    var salary = "$100,000"
    override fun toString(): String {
        return """${super.toString()}
 Salary = $salary"""
    }
} // Intern & Fulltime

internal class Intern(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    var salary = "$50,000"
    override fun toString(): String {
        return """${super.toString()}
 Salary = $salary"""
    }
}

internal class FullTime(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    var salary = "$150,000"
    override fun toString(): String {
        return """${super.toString()}
 Salary = $salary"""
    }
}