package calculator.services;

import calculator.models.Calculator;
import calculator.utils.NumberFormatter;

public class CalculatorService {
  
    private Calculator calculator;

    public CalculatorService(Calculator calculator) {
      this.calculator = calculator;
    }

    public String calc() {
      double numberOne = calculator.getN1();
      double numberTwo = calculator.getN2();
    
      NumberFormatter formatNumber = new NumberFormatter();
    
      double result = 0.0D;
      String formattedResult = ""; 
    
      switch (calculator.getOperator()) {
          case "+":
              result = numberOne + numberTwo;
              formattedResult = formatNumber.format(result);
              break;
          case "-":
              result = numberOne - numberTwo;
              formattedResult = formatNumber.format(result);
              break;
          case "*":
              result = numberOne * numberTwo;
              formattedResult = formatNumber.format(result);
              break;
          case "/":
              result = numberOne / numberTwo;
              formattedResult = formatNumber.format(result);
              break;
          default:
              return "Digite um operador válido";
      }
    
      return formattedResult;
  } 
}
