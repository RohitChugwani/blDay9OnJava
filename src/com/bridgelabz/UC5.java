package com.bridgelabz;

public class UC5 extends UC2{

    public static void monthly_Wage()
    {
        int monthly_wage = 0;
        for (int i= 1 ;i<=20;i++)
        {
            if (UC5.IsPresent())
                monthly_wage = monthly_wage + UC5.EmployeeWagePerDay();
        }
        System.out.println("monthly wge of employee is " +monthly_wage);

    }
}
