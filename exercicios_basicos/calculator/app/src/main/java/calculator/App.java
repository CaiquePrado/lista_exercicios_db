package calculator;

import java.util.Scanner;

import calculator.models.Calculator;
import calculator.services.CalculatorService;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double n1 = 0.0D;
        n1 = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Digite (-), (+), (*) ou (/) para a operação que você quer: ");
        String operator = scanner.nextLine();

        System.out.println("Digite outro número: ");
        double n2 = 0.0D;
        n2 = scanner.nextDouble();

        Calculator calculator = new Calculator(n1, operator, n2);

        CalculatorService calculatorService = new CalculatorService(calculator);

        System.out.println(calculatorService.calc());

        scanner.close();
    }
}
