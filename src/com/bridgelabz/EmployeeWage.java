package com.bridgelabz;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EmployeeWage {
    public static final int emp_Full_Time = 1;
    public static final int emp_Part_Time = 2;
    public static final int emp_Rate_Per_Hour = 20;
     static  int Num_Of_working_Days;


    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Program");

        int empHrs = 0;
        int empwage = 0;
        int totalEmpWage = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of Working Days");
        EmployeeWage.Num_Of_working_Days = sc.nextInt();
        for (int day = 0; day < EmployeeWage.Num_Of_working_Days; day++) {

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case emp_Part_Time:
                    empHrs = 4;
                    System.out.println("Employee is PartTime Present");
                    break;
                case emp_Full_Time:
                    empHrs = 8;
                    System.out.println("Employee is FullTime Present");
                    break;
                default:
                    empHrs = 0;
                    System.out.println("Employee is Absent");
            }
            empwage = empHrs * emp_Rate_Per_Hour;
            totalEmpWage += empwage;
            System.out.println("Emp Wage :" + empwage);
        }
        System.out.println("Total Emp Wage :" + totalEmpWage);
    }
    }

