/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author rafae
 */
public class Problem12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("=========================");
            System.out.println("Shopping Bill with VAT ");
            System.out.println("by Rafael Hidalgo");
            System.out.println("=========================");
            
            System.out.print("Product Price: ");
            double price = input.nextDouble();
            
            System.out.print("Quantity: ");
            int quantity = input.nextInt();
            
            double subtotal = price * quantity;
            double vat = subtotal * 0.12;
            double total = subtotal + vat;
            
            System.out.println("=========================");
            System.out.printf("Subtotal: PHP %.1f%n", subtotal);
            System.out.printf("VAT: PHP %.2f%n", vat);
            System.out.printf("Total: PHP %.f%n", total);
            System.out.println("==========================");
            
            
            
    }
}
