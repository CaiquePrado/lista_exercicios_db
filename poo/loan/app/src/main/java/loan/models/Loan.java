package loan.models;

import java.time.LocalDate;

public class Loan {
  
  private LocalDate loanDate;
  private LocalDate returnDate; 

  public Loan() {}

  public Loan(LocalDate loanDate, LocalDate returnDate) {
    this.loanDate = loanDate;
    this.returnDate = returnDate;
  }

  public LocalDate getLoanDate() {
    return this.loanDate;
  }

  public void setLoanDate(LocalDate loanDate) {
    this.loanDate = loanDate;
  }

  public LocalDate getReturnDate() {
    return this.returnDate;
  }

  public void setReturnDate(LocalDate returnDate) {
    this.returnDate = returnDate;
  }

  @Override
  public String toString() {
    return "{" +
      " loanDate='" + getLoanDate() + "'" +
      ", returnDate='" + getReturnDate() + "'" +
      "}";
  }  
}
