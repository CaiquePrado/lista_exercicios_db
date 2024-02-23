package newvector.services;

import java.util.Arrays;
import java.util.Random;

import newvector.models.Vectors;

public class VectorsService {
  
  private Vectors vectors;
  private Random random = new Random();

  public VectorsService(Vectors vectors) {
    this.vectors = vectors;
  }

  public int[] generateFirstFiftyRandomNumbers(){
    int[] firstVector = vectors.getFirstVector();
    for (int i = 0; i < 50; i++) {
        firstVector[i] = random.nextInt(50);
    }
    return sortVectors(firstVector);
  }

  public int[] generateSecondFiftyRandomNumbers(){
    int[] secondVector = vectors.getSecondVector();
    for (int i = 0; i < 50; i++) {
        secondVector[i] = random.nextInt(50);
    }
    return sortVectors(secondVector);
  }

  public int[] sortVectors(int[] vector){
    Arrays.sort(vector);
    return vector;
  }

  public int[] combineFirstVectorWithSecondVector(){
    int[] firstVector = generateFirstFiftyRandomNumbers();
    int[] secondVector = generateSecondFiftyRandomNumbers();
    int[] newArrayWithHundredNumbers = new int[100];
    System.arraycopy(firstVector,0,newArrayWithHundredNumbers,0,50);
    System.arraycopy(secondVector,0,newArrayWithHundredNumbers,50,50);
    
    return sortVectors(newArrayWithHundredNumbers);
  }
}
