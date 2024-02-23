package calculator.models;

public class Calculator {

  private Double n1;
  private Double n2;
  private String operator;

  public Calculator(Double n1, Double n2, String operator) {
    this.n1 = n1;
    this.n2 = n2;
    this.operator = operator;
  }

  public Double getN1() {
    return n1;
  }

  public Double getN2() {
    return n2;
  }

  public String getOperator() {
    return operator;
  }
}
