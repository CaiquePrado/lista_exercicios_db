package number_until_ten;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Você pode digitar números até 10: ");
            number = scanner.nextInt();
        } while (number != 10);

        System.out.println("Você digitou 10!");

        scanner.close();
    }
}
