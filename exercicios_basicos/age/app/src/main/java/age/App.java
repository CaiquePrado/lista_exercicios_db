package age;

import java.util.Scanner;

import age.services.PersonService;

public class App {
    public static void main(String[] args) {
        
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();
        
        PersonService legalAge = new PersonService(age);

        System.out.println(legalAge.elderAge());

        scanner.close();
    }
}
