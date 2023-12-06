/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab;

/**
 *
 * @author user
 */
public class circle {
    public int area (int reduis)
    {
        int area = (int) (Math.pow(reduis, 2) * Math.PI);
        return area;
    }
    public double area (double reduis)
    {
        double area = Math.pow(reduis, 2) * Math.PI;   return area;
    }
    public int perimeter(int reduis)
    {
        int perimeter = (int) (2*reduis*Math.PI);
        return perimeter;
    }
     public double perimeter(double reduis)
    {
        double perimeter =  2*reduis*Math.PI;
        return perimeter;
    }
     public int diameter(int reduis)
     {
         int dimeter = 2*reduis;
         return dimeter;
     }
     public double diameter(double reduis)
     {
         double dimeter = 2*reduis;
         return dimeter;
     }
     
}
