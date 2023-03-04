package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Program");
        int emp_Full_Time = 1;
        int emp_Rate_Per_Hour = 20;
        int empHrs = 0;
        int empwage = 0;


        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == emp_Full_Time) {
            empHrs = 8;
            System.out.println("Employee is Present");
        } else {
            empHrs = 0;
            System.out.println("Employee is Absent");
        }
        empwage = empHrs * emp_Rate_Per_Hour;
        System.out.println("Emp Wage :" + empwage);
    }


}
