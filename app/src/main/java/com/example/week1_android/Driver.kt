package com.example.week1_android

object Driver {

    @JvmStatic
    fun main(args: Array<String>) {

        // todo showing the idea of getters & setters how they implement clean code

        // Object should be able to do a dot operation to get all the data



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