package newvector.models;

public class Vectors {
  
  private int[] firstVector;
  private int[] secondVector;
  
  public Vectors() {
    this.firstVector =  new int[50];
    this.secondVector =  new int[50];
  }

  public int[] getFirstVector() {
    return firstVector;
  }

  public int[] getSecondVector() {
    return secondVector;
  }
}
