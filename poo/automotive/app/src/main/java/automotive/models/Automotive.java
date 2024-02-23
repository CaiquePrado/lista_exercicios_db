package automotive.models;

public class Automotive {

    private int numRodas;
    private int velMax;
    protected boolean ligado;

    public Automotive(int numRodas, int velMax) {
        this.numRodas = numRodas;
        this.velMax = velMax;
        this.ligado = false;
    }

    public int getNumRodas() {
      return numRodas;
    }

    public void setNumRodas(int numRodas) {
      this.numRodas = numRodas;
    }

    public int getVelMax() {
      return velMax;
    }

    public void setVelMax(int velMax) {
      this.velMax = velMax;
    }

    public boolean isLigado() {
      return ligado;
    }

    public void ligar() {
      this.ligado = true;
      System.out.println("Automóvel ligado: Clic");
    }

    public void desligar() {
      this.ligado = false;
      System.out.println("Automóvel ligado: Clic");
    }
}
