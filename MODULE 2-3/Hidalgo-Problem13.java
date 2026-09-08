/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author rafae
 */
public class Problem13 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Celsius to Fahrenheit Converter");
        System.out.println("by Rafael Hidalgo");
        System.out.println("=========================");
        
        System.out.print("Temperature in Celsius: ");
            double celsius = input.nextDouble();
        
        double fahrenheit = (celsius * 9.0/5.0) + 32;
        System.out.printf("Fahrenheit: %.1f%n", fahrenheit);
        System.out.println("==========================");
        
        
    }
}
