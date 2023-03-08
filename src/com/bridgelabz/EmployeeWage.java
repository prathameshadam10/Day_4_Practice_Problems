package com.bridgelabz;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
class EmpWage{
 public static final int emp_Full_Time = 1;
    public static final int emp_Part_Time = 2;
    public static final int emp_Rate_Per_Hour = 20;
    public static final int Num_Of_working_Days = 20;
    public static final int max_Hrs_In_Month = 100;


    public void computeEmpWage(){

        int empHrs = 0;
        int totalEmpHrs = 0;
        int total_Working_Days = 0;

        while (totalEmpHrs <= max_Hrs_In_Month &&
                total_Working_Days < Num_Of_working_Days) {
            total_Working_Days++;

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println("Switch case starts :");

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
            totalEmpHrs += empHrs;
            System.out.println("Day :" + total_Working_Days + "Emp Hr :" + empHrs);
        }
        int totalEmpWage = totalEmpHrs * emp_Rate_Per_Hour;
        System.out.println("Total Emp Wage :" + totalEmpWage);

    }
}
    public class EmployeeWage {
    public static void main(String[] args) {
            System.out.println("Welcome To Employee Wage Program");
            EmpWage e = new EmpWage();
            e.computeEmpWage();




        }

    }


