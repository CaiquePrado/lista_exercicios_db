package automotive.models;

public class Car extends Automotive {

  public Car(int numRodas, int velMax) {
      super(numRodas, velMax);
  }

  public void abrirPortas() {
    System.out.println("Portas do carro abertas.");
  }
}
