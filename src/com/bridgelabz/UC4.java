package com.bridgelabz;

import java.util.Scanner;

public class UC4 extends UC1{
    public static void Calculate_wage()
    {
        System.out.println("Enter 1 if you are a full time employee or 2 if you are aprt time employee");
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        switch (input){
            case 1:
                UC2.EmployeeWagePerDay();
                break;
            case 2:
                UC3.PartTimeWage();
                break;
            default:
               System.out.println("Press the correct input ");

        }
    }


}
