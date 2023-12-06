/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Lab {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("enter two numbers");
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("x + y =" + (x + y));*/
        /* Scanner scan = new Scanner (System.in);
        System.out.println("enter 3 Numbers");
        int  a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double sm = Math.pow(b, 2) - 4*a*c;
        if (sm<0)
        {
        System.out.println("No root for this equation");
        }
        else if (sm == 0)
        {
        double root = -b / 2*a;
        System.out.println("Root = " + root );
        }
        else
        {
        double r1;
        r1 = (- b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2*a);
        double r2 = (- b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2*a);
        System.out.println ("R1 & R2 = " + r1 + "          " + r2);*/
        /*Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number");
        int y = scan.nextInt();
        if(y%2 == 0)
        {
        System.out.println("The number is even number");
        }
        else
        {
        System.out.println("The number is odd Number");
        }*/
        /*Scanner scan = new Scanner (System.in);
        int m = scan.nextInt();
        boolean s = false;
        for(int i =2; i<= m /2 ; i++)
        {
        if (m%i == 0)
        
        {
        s = true;
        break;
        }
        
        }
        
        if (!s)
        System.out.println(m + " is a prime number.");
        else
        System.out.println(m + " is not a prime number.");*/
        /*Scanner scan = new Scanner(System.in);
        double m=scan.nextDouble();
        int count =0;
        double sum = 0;
        while(m != 0)
        {
        sum += m;
        count++;
        m = scan.nextDouble();
        
        }
        System.out.println("Avarege =" + (sum/count));
        */
        /* Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int m = scan.nextInt();
        int s = 1;
        for (int i = m;i>0;i--)
        {
        s *= i;
        }
        System.out.println("The factorial of Number=" + s);*/
        Scanner scan = new Scanner (System.in); 
        circle c1 = new circle (); 
        System.out.println("The Menu");
        System.out.println("1- Tha area of circle in int tybe      2- The area of circle in double Tybe");
        System.out.println("3- Tha perimeter of circle in int tybe      4- The area of perimeter in double Tybe");
        System.out.println("5- the diameter of circle in int tybe       6- The diameter of circle in double tybe");
       System.out.println("Enter reduis in int tybe");
       int reduis = scan.nextInt();
          System.out.println("Enter reduis in double tybe");
                 double reduis1 = scan.nextDouble();
                 System.out.println("enter what you need from menue");
        int m = scan.nextInt();
        switch(m)
        {
               
            case 1:
                System.out.println(c1.area(reduis));
            case 2:
                System.out.println(c1.area(reduis1));
            case 3:
                System.out.println(c1.diameter(reduis));
            case 4:
                System.out.println(c1.diameter(reduis1));
            case 5:
                System.out.println(c1.perimeter(reduis));
            case 6:
                System.out.println(c1.perimeter(reduis1));
            default :
                break;
               
            
           
        }
        while(true);
    }
}
