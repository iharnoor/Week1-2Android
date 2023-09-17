package com.example.week1_android.kotlinlearning2

open class Employee(open val employeeName: String, open val employeeType: String, open val employeeId: Int) {
}

data class Contractor(override val employeeName: String, override val employeeType: String, override val employeeId: Int) : Employee(employeeName,employeeType, employeeId) {
    val salary = "$100,000"
    override fun toString(): String {
        return "Contractor(employeeName='$employeeName', employeeType='$employeeType', employeeId=$employeeId, salary='$salary')"
    }
}

data class Intern(override val employeeName: String, override val employeeType: String, override val employeeId: Int) : Employee(employeeName,employeeType, employeeId) {
    val salary = "$50,000"
    override fun toString(): String {
        return "Intern(employeeName='$employeeName', employeeType='$employeeType', employeeId=$employeeId, salary='$salary')"
    }
}

data class FullTime(override val employeeName: String, override val employeeType: String, override val employeeId: Int) : Employee(employeeName,employeeType, employeeId) {
    val salary = "$150,000"
    override fun toString(): String {
        return "FullTime(employeeName='$employeeName', employeeType='$employeeType', employeeId=$employeeId, salary='$salary')"
    }
}

object Story1 {
    fun printEmployeeSalary(employee: Employee) {
        when (employee.employeeType) {
            "Contractor" -> println("Contractor Salary: $100,000")
            "Full Time" -> println("Full Time Salary: $150,000")
            "Intern" -> println("Intern Salary: $50,000")
        }
    }

    fun printHelloWorld() {
        for (i in 1..5) {
            println("Hello World$i") // concatenation
        }
    }

    fun calculate(input1: Int, input2: Int, input3:Int): Int { // returning int transferring to a variable
        return input1 + input2 +input3
    }

    fun calculate(a: Int, b: Int) {
        println(a + b)
    }
}
