package newvector;

import java.util.Arrays;

import newvector.models.Vectors;
import newvector.services.VectorsService;

public class App {

    public static void main(String[] args) {
        Vectors vectors = new Vectors();
        VectorsService vectorsService = new VectorsService(vectors);

        var firstRandomNumbers = vectorsService.generateFirstFiftyRandomNumbers();
        var secondRandomNumbers = vectorsService.generateSecondFiftyRandomNumbers();

        System.out.println("1º array: " + Arrays.toString(firstRandomNumbers));
        System.out.println("2º array: " + Arrays.toString(secondRandomNumbers));

        System.out.println("Arrays combinados e ordenados: " + Arrays.toString(vectorsService.combineFirstVectorWithSecondVector()));
    }
}

