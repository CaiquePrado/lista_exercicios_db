package jokenpo.models;

public class Jokenpo {
  
  private String userChoice;

  public Jokenpo() {}

  public Jokenpo(String userChoice) {
    this.userChoice = userChoice;
  }

  public String getUserChoice() {
    return userChoice;
  }
}
