package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Program");
        int emp_Full_Time = 1;
        int emp_Part_Time = 2;
        int emp_Rate_Per_Hour = 20;
        int empHrs = 0;
        int empwage = 0;


        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == emp_Part_Time){
            empHrs = 4;
            System.out.println("Employee is partTime Present");
        }
        else if (empCheck == emp_Full_Time) {
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
