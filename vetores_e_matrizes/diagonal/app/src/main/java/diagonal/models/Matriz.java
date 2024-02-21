package diagonal.models;

public class Matriz {
  
  private int sizeMatriz;
  private int[][] matriz;
  
  public Matriz(int sizeMatriz, int[][] matriz) {
    this.sizeMatriz = sizeMatriz;
    this.matriz = matriz;
  }

  public int getSizeMatriz() {
    return sizeMatriz;
  }

  public int[][] getMatriz() {
    return matriz;
  }
}
