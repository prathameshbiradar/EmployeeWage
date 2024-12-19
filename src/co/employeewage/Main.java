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

        // Calculate daily wages for full-time and part-time hours
        int fullTimeWage = wagePerHour * fullTimeHours;
        int partTimeWage = wagePerHour * partTimeHours;

        int attendence = random.nextInt(3); //generate 0,1,2

        // Full-Time Employee
        if(attendence==1)
        {
            System.out.println("Employee is Present");
            System.out.println("Employee Type: Full-Time");
            System.out.println("Daily wage is $"+fullTimeWage);
        }
        // Part-Time Employee
        else if (attendence == 2) {
            System.out.println("Employee is present");
            System.out.println("Employee Type: Full-Time");
            System.out.println("Daily wage is $"+partTimeWage);

        }
        // Employee is absent
        else {
            System.out.println("Employee is absent");
            System.out.println("Daily wage is $0");
        }

    }
}
