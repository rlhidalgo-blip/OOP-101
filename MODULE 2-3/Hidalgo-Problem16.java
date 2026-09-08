import java.util.Scanner;

public class Problem16{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Pass or Fail Using Ternary");
        System.out.println("by Rafael Hidalgo");
        System.out.println("=========================");
         
        System.out.print("Enter grade: ");
            double grade = input.nextDouble();
            
        String result = grade >= 75 ? "PASSED" : "FAILED";
        System.out.println("Result: " + result);
            
        input.close();
    }
  
            
}
