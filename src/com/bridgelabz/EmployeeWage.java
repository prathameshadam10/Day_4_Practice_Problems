package com.bridgelabz;



public class EmployeeWage {


    public static void computeEmpWage(String companyName, int emp_Rate_Per_Hour,
                                     int Num_Of_working_Days, int max_Hrs_In_Month){

        final int emp_Full_Time = 1;
        final int emp_Part_Time = 2;
        int empHrs = 0;
        int totalEmpHrs = 0;
        int total_Working_Days = 0;
        System.out.println("Details of " + companyName + "employee");
        System.out.println("--------------------------------------");
        System.out.println("Emp Rate per hour :" + emp_Rate_Per_Hour );
        System.out.println("Maximum Working days :" + Num_Of_working_Days);
        System.out.println("Maximum hrs in month :" + max_Hrs_In_Month);

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
        System.out.println("Total Emp Wage for Month :" + totalEmpWage);

    }



    public static void main(String[] args) {
            System.out.println("Welcome To Employee Wage Program");
            EmployeeWage.computeEmpWage("Amazon", 20,
                    20,100);
            EmployeeWage.computeEmpWage("TATA", 50,
                    25,150);





        }

    }







