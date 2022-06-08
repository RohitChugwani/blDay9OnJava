package com.bridgelabz;

public class UC1 {
    public static boolean IsPresent()
    {
        double x = Math.random();
        if ( x >=0.5)
        {
            System.out.println("Emplouee is present");
            return true;
        }
        else
        {
            System.out.println("Emplouee is absent");
            return false;
        }

    }
}
