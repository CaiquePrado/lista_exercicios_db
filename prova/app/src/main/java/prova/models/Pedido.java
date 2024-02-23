package prova.models;

import java.util.ArrayList;

import prova.utils.PriceFormatter;

public class Pedido {

  PriceFormatter priceFormatter = new PriceFormatter();
  ArrayList<Item> listaDeItens = new ArrayList<>();
  private double valorTotalDoPedido = 0.0D;

  public Pedido() {}

  public Pedido(ArrayList<Item> listaDeItens) {
    this.listaDeItens = listaDeItens;
  }

  public ArrayList<Item> getListaDeItens() {
    return listaDeItens;
  }

  public double getValorTotalDoPedido() {
    return valorTotalDoPedido;
  }

  public void setValorTotalDoPedido(double valorTotalDoPedido) {
    this.valorTotalDoPedido = valorTotalDoPedido;
  }
}
