
import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("=========================");
        System.out.println("Weighted Final Grade ");
        System.out.println("by Rafael Hidalgo");
        System.out.println("=========================");
        
        
        System.out.print("Enter quiz grade: ");
        double quiz = input.nextDouble();
        System.out.print("Enter project grade: ");
        double project = input.nextDouble();
        System.out.print("Enter exam grade: ");
        double exam = input.nextDouble();
        
        double weightedQuiz = quiz * 0.30;
        double weightedProject= project * 0.30;
        double weightedExam= exam * 0.40;
        
        double finalGrade = weightedQuiz + weightedProject + weightedExam; 
        System.out.printf("Final Grade: %.1f%n", finalGrade);
        System.out.println("==========================");
        input.close();
    }
}
