package random_number.services;

import java.util.Arrays;
import java.util.Random;

import random_number.models.RandomNumber;

public class RandomNumberService {

  private RandomNumber numbersBewteenOneToHundred;

  public RandomNumberService(RandomNumber numbersBewteenOneToHundred) {
    this.numbersBewteenOneToHundred = numbersBewteenOneToHundred;
  }

  public int[] generateTenRandomNumberBetweenOneToHundred(){
    Random random = new Random();
    int[] numbers = numbersBewteenOneToHundred.getTenNumbersBetweenTenToHundred();

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(101);
    }

    System.out.print(numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ", " + numbers[3] + ", " + numbers[4] + ", " + 
    numbers[5] + ", " + numbers[6] + ", " + numbers[7] + ", " + numbers[8] + ", " + numbers[9] );
    return numbers;
  }

  public int minNumber(int[] numbers){
    int minimun = Arrays.stream(numbers).min().getAsInt();
    return minimun;
  }

  public int maxNumber(int[] numbers){
    int maximun = Arrays.stream(numbers).max().getAsInt();
    return maximun;
  }
}
