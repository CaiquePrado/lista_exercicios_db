package diagonal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import diagonal.models.Matriz;
import diagonal.services.MatrizService;

class AppTest {

    Matriz matriz;
    MatrizService matrizService;

    @Test
    void testCalculateDiagonalSum(){
      int sizeMatriz = 2;
      int[][] myMatriz = {{1,2},{3,4}};
      matriz = new Matriz(sizeMatriz, myMatriz);
      matrizService = new MatrizService(matriz);

      matrizService = new MatrizService(matriz);
      int expectedDiagonalSum = 5;
      var actual = matrizService.calculateDiagonalSum();

      assertEquals(expectedDiagonalSum, actual);
    }
}
