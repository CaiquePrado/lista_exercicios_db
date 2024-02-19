package jokenpo.services;

import java.util.Random;

import jokenpo.models.Jokenpo;

public class JokenpoService {

  private Jokenpo jokenpo;

  public JokenpoService(Jokenpo jokenpo) {
    this.jokenpo = jokenpo;
  }

  public int gernerateRandomNumber(){
    Random random = new Random();
    int randomNumber = random.nextInt(3) + 1;
    return randomNumber;
  }

  public String generateMachineResponse() {
    int randomNumber = gernerateRandomNumber();
    String machineResponse;

    if(randomNumber == 1){
      machineResponse = "pedra";
    }else if(randomNumber == 2){
      machineResponse = "papel";
    }else{
      machineResponse = "tesoura";
    }
    return machineResponse;
  }

  public String winner(String machineChoice){
    String userChoice = jokenpo.getUserChoice();

    System.out.println("Sua escolha: " + userChoice);
    System.out.println("Escolha da máquina: " + machineChoice);

    if(userChoice.equals("pedra") && machineChoice.equals("papel")){
      return "Máquina ganhou!";
    }else if(userChoice.equals("papel") && machineChoice.equals("tesoura")){
      return "Máquina ganhou!";
    }else if(userChoice.equals("tesoura") && machineChoice.equals("pedra")){
      return "Máquina ganhou!";
    }else if(userChoice.equals(machineChoice)){
      return "Empate!";
    }else{
      return "Você ganhou!";
    }
  }
}
