package co.employeewage;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");

        Random random = new Random();
        int wagePerHour = 20;
        int dailyHours = 8;
        int dailyWage = wagePerHour * dailyHours;
        int attendence = random.nextInt(2);

        if(attendence==1)
        {
            System.out.println("Employee is Present");
            System.out.println("Daily wage is $"+dailyWage);
        }
        else {
            System.out.println("Employee is absent");
            System.out.println("Daily wage is $0");
        }

    }
}
