package co.employeewage;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");

        Random random = new Random();
        int attendence = random.nextInt(2);

        if(attendence==1)
        {
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is absent");
        }

    }
}
