package average.models;

public class Grade {
  
  private double[] grade = new double[3];

  public Grade(double[] grade) {
    this.grade = grade;
  }

  public double[] getGrade() {
    return grade;
  }
}
