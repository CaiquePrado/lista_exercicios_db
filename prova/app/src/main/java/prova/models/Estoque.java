package prova.models;

import java.util.ArrayList;

public class Estoque {
  
  private int id = 1;
  private ArrayList<Produto> listaDeProdutos = new ArrayList<>();

  public Estoque() {}

  public Estoque(int id, ArrayList<Produto> listaDeProdutos) {
    this.id = id;
    this.listaDeProdutos = listaDeProdutos;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public ArrayList<Produto> getListaDeProdutos() {
    return listaDeProdutos;
  }
}

