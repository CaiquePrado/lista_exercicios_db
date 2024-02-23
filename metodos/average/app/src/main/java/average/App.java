package average;

import java.util.Scanner;

import average.models.Grade;
import average.services.GradeService;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] alumnGrade = new double[3];

        for(int i = 0; i < 3; i++){
            System.out.println("Digite sua " + (i + 1) + " nota: ");
            alumnGrade[i] = scanner.nextDouble(); 
        }

        Grade grade = new Grade(alumnGrade);
        GradeService gradeService = new GradeService(grade);

        double average = gradeService.average();

        System.out.println("Média: " + average);
        System.out.println("Status: " + gradeService.status(average));

        scanner.close();
    }
}
