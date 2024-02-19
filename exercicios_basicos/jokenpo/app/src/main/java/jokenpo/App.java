package jokenpo;

import java.util.Scanner;

import jokenpo.models.Jokenpo;
import jokenpo.services.JokenpoService;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite (pedra), (papel) ou (tesoura): ");
        String userChoice = scanner.nextLine();

        Jokenpo jokenpo = new Jokenpo(userChoice);

        JokenpoService jokenpoService = new JokenpoService(jokenpo);
        String machineChoie = jokenpoService.generateMachineResponse();
        System.out.println("Resultado: " + jokenpoService.winner(machineChoie));

        scanner.close();
    }
}
