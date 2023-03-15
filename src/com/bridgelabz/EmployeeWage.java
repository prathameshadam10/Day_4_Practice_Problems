package com.bridgelabz;



import java.util.Scanner;

public class EmployeeWage {
        public static final int emp_Full_Time = 1;
        public static final int emp_Part_Time = 2;
        public static class CompanyEmpWage {
            String companyName;
            int emp_Rate_Per_Hour;
            int Num_Of_Working_Days;
            int max_Hrs_In_Month;

            CompanyEmpWage() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the company name :");
                companyName = sc.next();
                System.out.println("Enter Employee Wage per hour :");
                emp_Rate_Per_Hour = sc.nextInt();
                System.out.println("Enter total working days for an employee in month");
                Num_Of_Working_Days = sc.nextInt();
                System.out.println("Enter maximum working hours for an employee in month");
                max_Hrs_In_Month = sc.nextInt();

            }

            public void EmpWageBuilder() {

                int empHrs;
                int totalEmpHrs = 0;
                int total_Working_Days = 0;
                while (totalEmpHrs <= max_Hrs_In_Month &&
                        total_Working_Days < Num_Of_Working_Days) {
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

                    int totalEmpWagePerMonth = totalEmpHrs * emp_Rate_Per_Hour;
                    System.out.println("Total Emp Wage for Month :" + totalEmpWagePerMonth);
                    int totalEmpWagePerYear = totalEmpWagePerMonth * 12;
                    System.out.println("Total Emp Wage per year : " + totalEmpWagePerYear);


                }
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                CompanyEmpWage[] company = new CompanyEmpWage[5];
                System.out.println("Welcome To Employee Wage Program");
                System.out.println("-----------------------------");

                for (int i = 0; i < company.length; i++) {
                    System.out.println("**********Menu*********");
                    System.out.println("Press 1: To Calculate the wage in a company.");
                    System.out.println("Press 2: To Exit.");
                    int choice = sc.nextInt();
                    if (choice == 1) {
                        System.out.println("Enter the details:");
                        company[i] = new CompanyEmpWage();
                        System.out.println("---------------------------");
                        company[i].EmpWageBuilder();
                    } else
                        i = company.length;
                }


            }

        }
}







