package com.bridgelabz;



import java.util.Scanner;

public class EmployeeWage {




        final int emp_Full_Time = 1;
        final int emp_Part_Time = 2;
        public static int emp_Rate_Per_Hour, Num_of_Working_Days, max_Hrs_In_Month;

        public void EmpWageBuilder1() {
            emp_Rate_Per_Hour = 100;
            Num_of_Working_Days = 20;
            max_Hrs_In_Month = 100;
            System.out.println("Total Comapny wage : " + (emp_Rate_Per_Hour * max_Hrs_In_Month));
        }

        public void EmpWageBuilder2() {
            emp_Rate_Per_Hour = 200;
            Num_of_Working_Days = 23;
            max_Hrs_In_Month = 120;
            System.out.println("Total Company wage :" + (emp_Rate_Per_Hour * max_Hrs_In_Month));
        }
         public void EmpWageBuilder3() {
        emp_Rate_Per_Hour = 300;
        Num_of_Working_Days = 25;
        max_Hrs_In_Month = 150;
        System.out.println("Total Company wage :" + (emp_Rate_Per_Hour * max_Hrs_In_Month));
        }

        public void computeEmpWage(){
            int empHrs = 0;
             int totalEmpHrs = 0;
             int total_Working_Days = 0;


        while (totalEmpHrs <= max_Hrs_In_Month &&
                total_Working_Days < Num_of_Working_Days) {
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
        int totalEmpWagePerMonth = totalEmpHrs * emp_Rate_Per_Hour;
        System.out.println("Total Emp Wage for Month :" + totalEmpWagePerMonth);
        int totalEmpWagePerYear = totalEmpWagePerMonth * 12;


        }
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
        System.out.println("Welcome To Employee Wage Program");
            System.out.println("-----------------------------");
            System.out.println("Enter the Company name : \n 1. Amazon \n 2. TATA \n 3.Infosis");
            int company = sc.nextInt();
            EmployeeWage s = new EmployeeWage();
            switch (company){
                case 1:
                    s.EmpWageBuilder1();
                    s.computeEmpWage();
                    break;
                case 2:
                    s.EmpWageBuilder2();
                    s.computeEmpWage();
                    break;
                case 3:
                    s.EmpWageBuilder3();
                    s.computeEmpWage();
                    break;
            }





    }

}








