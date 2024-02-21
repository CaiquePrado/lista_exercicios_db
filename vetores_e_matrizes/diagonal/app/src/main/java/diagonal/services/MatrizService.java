package diagonal.services;

import diagonal.models.Matriz;

public class MatrizService {
  
  private Matriz matriz;

  public MatrizService(Matriz matriz) {
    this.matriz = matriz;
  }
  
  public int calculateDiagonalSum() {
    int diagonalSum = 0;
    for (int i = 0; i < matriz.getSizeMatriz(); i++) {
        diagonalSum += matriz.getMatriz()[i][i];
    }
    return diagonalSum;
  }
}
