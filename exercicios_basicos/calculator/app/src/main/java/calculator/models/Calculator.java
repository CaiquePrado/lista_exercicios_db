package calculator.models;

public class Calculator {

  private double n1;
  private String operator;
  private double n2;

  public Calculator(double n1, String operator, double n2) {
    this.n1 = n1;
    this.operator = operator;
    this.n2 = n2;
  }

  public double getN1() {
    return n1;
  }

  public double getN2() {
    return n2;
  }

  public String getOperator() {
    return operator;
  }
}
