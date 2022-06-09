package com.bridgelabz;

public class UC8 extends UC1{
    int monthly_wage = 0;


    public  void  monthly_Wage(int working_days,int working_hours_per_day,int wage)
    {
        for (int i=1 ;i<=working_days;i++){
            if( UC8.IsPresent()) {
                monthly_wage = monthly_wage + working_hours_per_day * wage;

            }

        }
        System.out.println("Monthly wage is " + monthly_wage);
    }
}
