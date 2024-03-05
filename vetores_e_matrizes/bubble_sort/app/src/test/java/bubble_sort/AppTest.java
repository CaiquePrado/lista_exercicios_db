package bubble_sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import bubble_sort.models.Vector;
import bubble_sort.services.VectorService;

class AppTest {

    Vector vector;
    VectorService vectorService;

    @Test
    void testGenerateHundredRandomNumberBetweenZeroToNinety(){

        vector = new Vector();
        vectorService = new VectorService(vector);

        int[] numbersBetweenZeroToNinety = vectorService.generateHundredRandomNumbers();

        for(int number: numbersBetweenZeroToNinety){
            assertTrue(number >= 0 && number <=99);
        }
    }

    @Test
    void testBubleSort_WhenGivenHundredRandomNumbers_shouldReturnNumbersSorted(){
        vector = new Vector();
        vectorService = new VectorService(vector);

        int[] randomArray = {
            12, 45, 6, 78, 90, 23, 11, 55, 66, 31,
            99, 88, 3, 21, 77, 34, 8, 67, 41, 20,
            53, 10, 19, 80, 44, 98, 56, 14, 72, 30,
            25, 76, 7, 57, 36, 9, 91, 48, 62, 85,
            24, 69, 82, 37, 63, 16, 42, 95, 51, 70,
            87, 27, 46, 73, 29, 68, 5, 52, 61, 93,
            35, 84, 47, 17, 81, 38, 74, 50, 18, 64,
            89, 40, 58, 26, 97, 4, 83, 22, 65, 39,
            94, 49, 75, 2, 59, 86, 15, 32, 71, 43,
            92, 1, 79, 54, 28, 60, 13, 96, 33, 0
        };

        vectorService.bubbleSort(randomArray);

        int[] expectedSortedArray = {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
            20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
            30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
            40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
            50, 51, 52, 53, 54, 55, 56, 57, 58, 59,
            60, 61, 62, 63, 64, 65, 66, 67, 68, 69,
            70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
            80, 81, 82, 83, 84, 85, 86, 87, 88, 89,
            90, 91, 92, 93, 94, 95, 96, 97, 98, 99
        };

        assertArrayEquals(randomArray, expectedSortedArray);
    }
}