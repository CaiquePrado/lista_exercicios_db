package prova.services.interfaces;

import prova.models.Produto;

public interface IPedidoService {
  
  void calcularValorTotal();

  boolean adicionaItemNaLista(Produto produto, int quantidade);

  void imprimePedido();

  void imprimeValorTotal();

  void adicionaItem();

  String recebeNomeDoTeclado();

  int recebeQuantidadeDoTeclado();
  
  void limparCarrinho();
  
}
