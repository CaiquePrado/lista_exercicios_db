package automotive.models;

public class AutomaticCar extends Car {

  public AutomaticCar(int numRodas, int velMax) {
      super(numRodas, velMax);
  }

  @Override
  public void ligar() {
      if (super.ligado == false) {
          System.out.println("Para ligar o carro é preciso pressionar o freio");
      } else {
          System.out.println("O carro já está ligado");
      }
  }

  @Override
   public void abrirPortas() {
    super.abrirPortas();
  }
}
