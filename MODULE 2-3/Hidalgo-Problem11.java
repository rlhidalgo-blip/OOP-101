
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafae
 */
public class Problem11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("=========================");
            System.out.println("Employee Salary Calculator");
            System.out.println("by Rafael Hidalgo");
            System.out.println("=========================");
          
           System.out.print("Enter hours work: ");
           double hoursWorked = input.nextDouble();
            
           System.out.print("Enter hourly rate: ");
           double hourlyRate = input.nextDouble();
           
           double grossSalary = hoursWorked * hourlyRate;
            
           System.out.printf("Gross Salary: PHP %.1f%n", grossSalary);
           System.out.println("=========================");
           input.close();
  
           }
       } 
