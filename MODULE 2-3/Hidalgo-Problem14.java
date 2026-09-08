
import java.util.Scanner;


public class Problem14 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("BMI Calculator ");
        System.out.println("by Rafael Hidalgo");
        System.out.println("=========================");
        System.out.print("Enter weight in kilogram: ");
            double weight = input.nextDouble();
        System.out.print("Enter height in meters: ");
            double height= input.nextDouble();
            
            double bmi =  weight / (height * height);
            System.out.printf("BMI: approximately %.10f%n", bmi);
            System.out.println("==========================");
            
            input.close();
    }
    
}
