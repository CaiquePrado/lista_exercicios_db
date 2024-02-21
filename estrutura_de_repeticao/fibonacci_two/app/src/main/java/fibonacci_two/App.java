package fibonacci_two;

import java.util.Scanner;

import fibonacci_two.models.FibonacciModel;
import fibonacci_two.services.FibonacciService;

public class App {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do seu Fibonacci: ");
        int fibonacciSize = scanner.nextInt();

        FibonacciModel fibonacciModel = new FibonacciModel(fibonacciSize);
        FibonacciService fibonacciService = new FibonacciService(fibonacciModel);

        System.out.println(fibonacciService.fibonacciFunction());

        scanner.close();
    }
}
