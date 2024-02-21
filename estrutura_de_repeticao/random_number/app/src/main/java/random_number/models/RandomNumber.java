package random_number.models;

public class RandomNumber {
  private int[] tenNumbersBetweenTenToHundred = new int[10];

  public RandomNumber(int[] tenNumbersBetweenTenToHundred) {
    this.tenNumbersBetweenTenToHundred = tenNumbersBetweenTenToHundred;
  }

  public int[] getTenNumbersBetweenTenToHundred() {
    return tenNumbersBetweenTenToHundred;
  }

  public void setTenNumbersBetweenTenToHundred(int[] tenNumbersBetweenTenToHundred) {
    this.tenNumbersBetweenTenToHundred = tenNumbersBetweenTenToHundred;
  }
}
