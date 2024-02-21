package diagonal;

import java.util.Scanner;

import diagonal.models.Matriz;
import diagonal.services.MatrizService;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da matriz:");
        int sizeMatriz = scanner.nextInt();
        int[][] matriz = new int[sizeMatriz][sizeMatriz];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < sizeMatriz; i++) {
            for (int j = 0; j < sizeMatriz; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        Matriz matrizz = new Matriz(sizeMatriz, matriz);

        MatrizService matrizService = new MatrizService(matrizz);

        System.out.println("A soma da diagonal principal é: " + matrizService.calculateDiagonalSum());

        scanner.close();
    }
}
