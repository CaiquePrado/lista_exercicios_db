package fibonacci.services;

import fibonacci.models.FibonacciModel;

public class FibonacciService {
  
  private FibonacciModel fibonacciModel;

  public FibonacciService(FibonacciModel fibonacciModel) {
    this.fibonacciModel = fibonacciModel;
  }

  public String fibonacciFunction() {
    String fibonacciSequence = "";
    int fibonacciSize = fibonacciModel.getFibonacciSize();
    int termoAnterior = 0;
    int termoAtual = 1;

    fibonacciSequence += termoAnterior + " " + termoAtual + " ";

    for (int i = 2; i < fibonacciSize + 1; i++) {
        int proximoTermo = termoAnterior + termoAtual;
        fibonacciSequence += proximoTermo + " ";
        termoAnterior = termoAtual;
        termoAtual = proximoTermo;
    }
    return fibonacciSequence;
  }
}
