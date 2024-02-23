package newvector;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import newvector.models.Vectors;
import newvector.services.VectorsService;

class AppTest {

    Vectors vetor;
    VectorsService vetorService;

    @Test
    void testGenerateFiftyRandomNumberBetweenZeroToFourtyNine(){

        vetor = new Vectors();
        vetorService = new VectorsService(vetor);

        int[] numbersBetweenZeroToNinety = vetorService.generateFirstFiftyRandomNumbers();

        for(int number: numbersBetweenZeroToNinety){
            assertTrue(number >= 0 && number <=49);
        }
    }

    @Test
    void testSortArray_WhenGivenFiftyRandomNumbers_shouldReturnNumbersSorted(){
        vetor = new Vectors();
        vetorService = new VectorsService(vetor);

        int[] randomArray = {
            12, 45, 6, 78, 90, 23, 11, 55, 66, 31,
            99, 88, 3, 21, 77, 34, 8, 67, 41, 20,
            53, 10, 19, 80, 44, 98, 56, 14, 72, 30,
            25, 76, 7, 57, 36, 9, 91, 48, 62, 85,
            24, 69, 82, 37, 63, 16, 42, 95, 51, 70,
        };

        var actual = vetorService.sortVectors(randomArray);

        int[] expectedSortedArray = {
            3, 6, 7, 8, 9, 10, 11, 12, 14, 16,
            19, 20, 21, 23, 24, 25, 30, 31, 34, 36,
            37, 41, 42, 44, 45, 48, 51, 53, 55, 56,
            57, 62, 63, 66, 67, 69, 70, 72, 76, 77,
            78, 80, 82, 85, 88, 90, 91, 95, 98, 99
        };

        assertArrayEquals(actual, expectedSortedArray);
    }

    @Test
    void testCombineTwoArrays_WhenGivenTwoRandomArrays_ShouldReturnOneArrayWithHundredNumbersSorted(){
        vetor = new Vectors();
    vetorService = new VectorsService(vetor);

    int[] combinedArray = vetorService.combineFirstVectorWithSecondVector();

    assertEquals(100, combinedArray.length);

    for(int i = 0; i < combinedArray.length - 1; i++) {
        assertTrue(combinedArray[i] <= combinedArray[i + 1]);
    }
    
    }
}
