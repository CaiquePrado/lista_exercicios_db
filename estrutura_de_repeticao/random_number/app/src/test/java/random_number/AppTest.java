package random_number;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import random_number.models.RandomNumber;
import random_number.services.RandomNumberService;

class AppTest {

    private RandomNumber randomNumbers;
    private RandomNumberService randomNumberService;
    
    @Test
    void testGenerateTenRandomNumberBetweenOneToHundred(){

        int[] tenNumbersBetweenTenToHundred = new int[10];
        randomNumbers = new RandomNumber(tenNumbersBetweenTenToHundred);
        randomNumberService = new RandomNumberService(randomNumbers);

        int[] numbers = randomNumberService.generateTenRandomNumberBetweenOneToHundred();

        for(int number: numbers){
            assertTrue(number >= 0 && number <=100);
        }
    }

    @Test
    void testGetMinNumber(){
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        randomNumbers = new RandomNumber(numbers);
        randomNumberService = new RandomNumberService(randomNumbers);

        int minNumber = randomNumberService.minNumber(numbers);

        int expectedMinNumber = 0;

        assertEquals(expectedMinNumber, minNumber);
    }

    @Test
    void testGetMaxNumber(){
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        randomNumbers = new RandomNumber(numbers);
        randomNumberService = new RandomNumberService(randomNumbers);

        int maxNumber = randomNumberService.maxNumber(numbers);

        int expectedMinNumber = 9;

        assertEquals(expectedMinNumber, maxNumber);
    }
}
