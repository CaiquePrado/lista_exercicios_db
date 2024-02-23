package calculator.services;

import calculator.models.Calculator;
import calculator.utils.FormatNumber;

public class CalculatorService {
  
  private Calculator calculator;

  public CalculatorService(Calculator calculator) {
    this.calculator = calculator;
  }

  public Double sum(Double n1, Double n2) {
    return n1 + n2;
  }

  public Double subtraction(Double n1, Double n2) {
    return n1 - n2;
  }

  public Double multiplication(Double n1, Double n2) {
    return n1 * n2;
  }

  public Double division(Double n1, Double n2) {
    if (n2.equals(0D))
      throw new ArithmeticException("Impossible to divide by zero!");
      return n1 / n2;
  }

  public Double power(Double base, Double exponent) {
    return Math.pow(base, exponent);
  }
  
  public String calc() {
    
    Double n1 = calculator.getN1();
    Double n2 = calculator.getN2();
    String operator = calculator.getOperator();
  
    FormatNumber formatNumber = new FormatNumber();
    double result = 0.0D;
  
    switch (operator) {
        case "+":
            result = sum(n1, n2);
            break;
        case "-":
            result = subtraction(n1, n2);
            break;
        case "*":
            result = multiplication(n1, n2);
            break;
        case "/":
            result = division(n1, n2);
            break;
        case "^":
            result = power(n1, n2);
            break;
        default:
            return "Digite um operador válido";
    }
    return formatNumber.format(result);
  }
}
