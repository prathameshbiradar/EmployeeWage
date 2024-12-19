package co.employeewage;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");

        Random random = new Random();
        // Wage per Hour
        int wagePerHour = 20;

        // full-time and part-time Hours
        int fullTimeHours = 8;
        int partTimeHours = 8;

        // Working days in a month
        int workingDaysPerMonth = 20;

        // Calculate daily wages for full-time and part-time hours
        int fullTimeDailyWage = wagePerHour * fullTimeHours;
        int partTimeDailyWage = wagePerHour * partTimeHours;

        //  monthly wage for full-time and part-time employees
        int fullTimeMonthlyWage = fullTimeDailyWage * workingDaysPerMonth;
        int partTimeMonthlyWage = partTimeDailyWage * workingDaysPerMonth;



        int attendence = random.nextInt(3); //generate 0,1,2

        switch (attendence)
        {
            // Full-Time Employee
            case 1:
                System.out.println("Employee is Present");
                System.out.println("Employee Type: Full-Time");
                System.out.println("Daily wage is $"+fullTimeDailyWage);
                System.out.println("Monthly Wage: $" + fullTimeMonthlyWage);
                break;
            case 2:
                // Part-Time Employee
                System.out.println("Employee is present");
                System.out.println("Employee Type: Full-Time");
                System.out.println("Daily wage is $"+partTimeDailyWage);
                System.out.println("Monthly Wage: $" + partTimeMonthlyWage);
                break;
            default:
                // Employee is absent
                System.out.println("Employee is absent");
                System.out.println("Daily wage is $0");
        }










    }
}
