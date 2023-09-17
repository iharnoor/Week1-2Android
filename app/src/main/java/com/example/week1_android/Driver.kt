package com.example.week1_android

import com.example.week1_android.kotlinlearning.Contractor
import com.example.week1_android.kotlinlearning.Employee
import com.example.week1_android.kotlinlearning.FullTime
import com.example.week1_android.kotlinlearning.Intern

object Driver {

    @JvmStatic
    fun main(args: Array<String>) {

        // Homework
        val square: Shape = Square(4.0)
        val rectangle: Shape = Rectangle(4.0, 5.0)
        val triangle: Shape = Triangle(9.0, 2.0)

        println(square)
        println(rectangle)
        println(triangle)

        // challenge -> figure out a way to print salaries of each employee based on
        //  1. Contractor
        // 2. Full Time
        // 3. Intern
        val employee1: Employee = Contractor("John", "Contractor", 123)
        val employee2: Employee = Intern("Smith", "Full Time", 456)
        val employee3: Employee = FullTime("Sara", "Intern", 789)

        // print employee1
        println(employee1)
        println(employee2)
        println(employee3)
    }
}