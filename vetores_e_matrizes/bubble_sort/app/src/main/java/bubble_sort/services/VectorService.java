package bubble_sort.services;

import java.util.Random;

import bubble_sort.models.Vector;

public class VectorService {
  
  private Vector vector;

  public VectorService(Vector vector) {
    this.vector = vector;
  }
  
  public int[] generateHundredRandomNumbers(){
    int[] vectorForNumbers = vector.getHundredNumbers();
    Random random = new Random();
    for (int i = 0; i < 100; i++) {
        vectorForNumbers[i] = random.nextInt(100);
    }
    return vectorForNumbers;
  }

  public int[] bubbleSort(int[] vectorForNumbers){
    int arraySize = vectorForNumbers.length;

    for(int i = 0; i < arraySize - 1; i++){
      for(int j = 0; j < arraySize - i - 1; j++){
        if(vectorForNumbers[j] > vectorForNumbers[j+1]){
          vectorForNumbers[j] = vectorForNumbers[j] + vectorForNumbers[j+1];
          vectorForNumbers[j+1] = vectorForNumbers[j] - vectorForNumbers[j+1];
          vectorForNumbers[j] = vectorForNumbers[j] - vectorForNumbers[j+1];
        }
      }
    }
    return vectorForNumbers;
  }
}