package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Program");
        int emp_Full_Time = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == emp_Full_Time)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
