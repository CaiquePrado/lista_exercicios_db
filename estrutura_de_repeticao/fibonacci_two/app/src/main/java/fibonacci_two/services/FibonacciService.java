package fibonacci_two.services;

import fibonacci_two.models.FibonacciModel;

public class FibonacciService {
  private FibonacciModel fibonacciModel;

  public FibonacciService(FibonacciModel fibonacciModel) {
    this.fibonacciModel = fibonacciModel;
  }

  public String fibonacciFunction() {
    String fibonacciSequence = "";
    int maxNumber = fibonacciModel.getMaxFibonacciSequence();
    int termoAnterior = 0;
    int termoAtual = 1;

    fibonacciSequence += termoAnterior + " ";

    while (termoAtual <= maxNumber) {
        fibonacciSequence += termoAtual + " ";
        int proximoTermo = termoAnterior + termoAtual;
        termoAnterior = termoAtual;
        termoAtual = proximoTermo;
    }
    return fibonacciSequence;
  }
}
