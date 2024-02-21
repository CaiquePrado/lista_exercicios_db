package random_number;

import random_number.models.RandomNumber;
import random_number.services.RandomNumberService;

public class App {
    
    public static void main(String[] args) {
        int[] tenNumbersBetweenTenToHundred = new int[10];
        RandomNumber randomNumber = new RandomNumber(tenNumbersBetweenTenToHundred);
        RandomNumberService randomNumberService = new RandomNumberService(randomNumber);

        randomNumberService.generateTenRandomNumberBetweenOneToHundred();
        System.out.println("");
        System.out.println("Minimo: " + randomNumberService.minNumber(tenNumbersBetweenTenToHundred));
        System.out.println("Maximo: " + randomNumberService.maxNumber(tenNumbersBetweenTenToHundred));
    }
}
