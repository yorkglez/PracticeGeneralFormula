package com.practicegeneralformula.app;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Declarations
        int a = 0;
        int b = 0;
        int c = 0;
        double determinant = 0;

        //Implementacion scanner
        Scanner In = new Scanner(System.in);

        //Input from user
        System.out.print("Write a: ");
        a = In.nextInt();
        System.out.print("Write b: ");
        b = In.nextInt();
        System.out.print("Write c: ");
        c = In.nextInt();

        //Process
        determinant = Math.pow(b,2) - (4*a*c);

        //Validate determinant
        if(determinant > 0){
            double x1 = (b * (-1)) + Math.sqrt(determinant) / (2*a);
            double x2 = (b * (-1)) - Math.sqrt(determinant) / (2*a);
            
            //Output results
            System.out.println(String.format("Results: x1 = %f  x2 = %f",x1,x2));
        }
        else{
            System.out.println("The determinant is negative, the operation cannot be completed");
        }
    }
}
