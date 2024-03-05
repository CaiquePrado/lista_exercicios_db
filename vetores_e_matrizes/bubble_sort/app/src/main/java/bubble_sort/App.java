package bubble_sort;

import java.util.Arrays;

import bubble_sort.models.Vector;
import bubble_sort.services.VectorService;

public class App {

    public static void main(String[] args) {
        Vector vector = new Vector();
        VectorService vectorService = new VectorService(vector);

        var randomNumbers = vectorService.generateHundredRandomNumbers();
        
        System.out.print("Vetor aleatório: " + Arrays.toString(randomNumbers));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("Vetor aleatório ordenado: " + Arrays.toString(vectorService.bubbleSort(randomNumbers)));
    }
}
