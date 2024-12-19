package co.employeewage;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");

        Random random = new Random();
        // Wage per Hour
        int wagePerHour = 20;

        // Full-time and part-time hours (both 8 hours)
        int fullTimeHours = 8;
        int partTimeHours = 8;

        // Total working hours and days limit
        int totalWorkingHoursLimit = 100;
        int totalWorkingDaysLimit = 20;

        // Variables to track remaining working hours and days
        int remainingHours = totalWorkingHoursLimit;
        int remainingDays = totalWorkingDaysLimit;

        // Variables to track total working hours and total wage
        int totalWorkingHours = 0;
        int totalWage = 0;

        while (remainingHours > 0 && remainingDays > 0) {
            remainingDays--;

            int attendence = random.nextInt(3);  // 0 - absent, 1 - full-time, 2 - part-time

            int dailyHoursWorked = 0;
            int dailyWage = 0;

            switch (attendence) {
                case 1:  // Full-Time Employee
                    dailyHoursWorked = fullTimeHours;
                    dailyWage = wagePerHour * fullTimeHours;
                    break;

                case 2:  // Part-Time Employee
                    dailyHoursWorked = partTimeHours;
                    dailyWage = wagePerHour * partTimeHours;
                    break;

                default:  // Employee is Absent
                    dailyHoursWorked = 0;
                    dailyWage = 0;
                    break;
            }

            // Deduct the worked hours from the remaining hours
            if (remainingHours >= dailyHoursWorked) {
                remainingHours -= dailyHoursWorked;
                totalWorkingHours += dailyHoursWorked;
                totalWage += dailyWage;
            } else {
                // If remaining hours are less than the daily hours worked, we end the loop
                totalWorkingHours += remainingHours;
                totalWage += remainingHours * wagePerHour;
                break;
            }

            // Print daily details
            System.out.println("Day " + (totalWorkingDaysLimit - remainingDays) + ": ");
            System.out.println("Employee Type: " + (attendence == 1 ? "Full-Time" : attendence == 2 ? "Part-Time" : "Absent"));
            System.out.println("Daily Wage: ₹" + dailyWage);
            System.out.println("Total Hours Worked: " + totalWorkingHours);
            System.out.println("Remaining Hours: " + remainingHours);
            System.out.println("Remaining Days: " + remainingDays);
            System.out.println("Total Wage: ₹" + totalWage);
            System.out.println();

            // If total working hours or total working days limit is reached, break the loop
            if (remainingHours <= 0 || remainingDays <= 0) {
                break;
            }
        }

        // Final output
        System.out.println("Final Total Wage for the month: ₹" + totalWage);
        System.out.println("Total Hours Worked: " + totalWorkingHours);
        System.out.println("Total Days Worked: " + (totalWorkingDaysLimit - remainingDays));










    }
}
