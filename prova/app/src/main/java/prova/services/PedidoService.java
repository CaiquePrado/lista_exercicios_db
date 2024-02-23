package prova.services;

import java.util.Scanner;

import prova.models.Estoque;
import prova.models.Item;
import prova.models.Pedido;
import prova.models.Produto;
import prova.services.interfaces.IPedidoService;
import prova.utils.PriceFormatter;

public class PedidoService implements IPedidoService {

  private Pedido pedido;

  public PedidoService(Pedido pedido) {
    this.pedido = pedido;
  }

  @Override
  public void calcularValorTotal() {
    double total = 0.0D;
    for (Item item : pedido.getListaDeItens()) {
        total += item.getProduto().getPreco() * item.getQuantidade();
    }
    pedido.setValorTotalDoPedido(total);
  }

  @Override
  public boolean adicionaItemNaLista(Produto produto, int quantidade) {
    Item novoItem = new Item(produto, quantidade);
    if(pedido.getListaDeItens().add(novoItem)){
      return true;
    }else{
      return false;
    }
  }

  @Override
  public void imprimePedido() {
     System.out.println("Detalhes do pedido:");
    for (Item item : pedido.getListaDeItens()) {
        System.out.println(item.getProduto().getNome() + " - Quantidade: " + item.getQuantidade());
    }
  }

  @Override
  public void imprimeValorTotal() {
    PriceFormatter priceFormatter = new PriceFormatter();
    System.out.println("Valor total do pedido: R$" + priceFormatter.format(pedido.getValorTotalDoPedido()));
  }

  @Override
  public void adicionaItem() {
    EstoqueService estoqueService = new EstoqueService(new Estoque());
    String nomeProduto = recebeNomeDoTeclado();
    int quantidade = recebeQuantidadeDoTeclado();

    Produto produto = estoqueService.encontraProduto(nomeProduto);
    if (estoqueService.temEstoqueOuNao(produto, quantidade)) {
        adicionaItemNaLista(produto, quantidade);
        estoqueService.darBaixaEmEstoque(nomeProduto, quantidade);
    } else {
      System.out.println("Não há estoque suficiente deste produto.");
    }
  }

  @Override
  public String recebeNomeDoTeclado() {
    try(Scanner scanner = new Scanner(System.in)){
      System.out.print("Digite a quantidade: ");
      return scanner.nextLine();
    }
  }

  @Override
  public int recebeQuantidadeDoTeclado() {
    try(Scanner scanner = new Scanner(System.in)){
      System.out.print("Digite a quantidade: ");
      return scanner.nextInt();
    }
  }

  @Override
  public void limparCarrinho() {
    pedido.setValorTotalDoPedido(0);
    pedido.getListaDeItens().clear();
  }

  public double receberTroco(double valorPago) {
    double troco = 0.0D;
    if(valorPago >= pedido.getValorTotalDoPedido()){
      troco += valorPago - pedido.getValorTotalDoPedido();
    }
    return troco;
  }

  public int[] calcularNumeroMinimoDeCedulas(double valorRecebido){
    int[] notas = {200, 100, 50, 20, 10, 5, 2};
    int[] quantidadeNotas = new int[notas.length];

    double troco = receberTroco(valorRecebido);
    int trocoInt = (int) Math.floor(troco);

    for (int i = 0; i < notas.length; i++) {
        if (trocoInt / notas[i] > 0) {
            quantidadeNotas[i] = trocoInt / notas[i];
            trocoInt = trocoInt % notas[i];
        }
    }
    return quantidadeNotas;
  }
}
