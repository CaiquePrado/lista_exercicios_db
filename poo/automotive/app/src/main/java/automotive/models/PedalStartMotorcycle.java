package automotive.models;

public class PedalStartMotorcycle extends Motorcycle {

  public PedalStartMotorcycle(int numRodas, int velMax) {
      super(numRodas, velMax);
  }

  @Override
  public void ligar() {
      if (super.ligado == false) {
          System.out.println("Para ligar a moto é preciso puxar o pedal do acelerador");
          super.ligar();
      } else {
          System.out.println("A moto já está ligada");
      }
  }

  @Override
  public void desligar() {
      if(super.ligado == true){
        System.out.println("Desligou a moto");
        super.desligar();
      }
  }
}