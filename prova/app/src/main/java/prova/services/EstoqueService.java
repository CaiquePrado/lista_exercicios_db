package prova.services;

import prova.models.Estoque;
import prova.models.Produto;
import prova.services.interfaces.IEstoqueService;

public class EstoqueService implements IEstoqueService {

  private Estoque estoque;

  public EstoqueService(Estoque estoque) {
    this.estoque = estoque;
  }

  @Override
  public void inicializaEstoque() {
    Produto produto1 = new Produto(1,"teclado", 10.0, 82);
    Produto produto2 = new Produto(2, "mouse", 20.0, 33);
    Produto produto3 = new Produto(3, "mousepad", 30.0, 0);

    estoque.getListaDeProdutos().add(produto1);
    estoque.getListaDeProdutos().add(produto2);
    estoque.getListaDeProdutos().add(produto3);
  }

  @Override
  public Produto encontraProduto(String nome) {
    for (Produto produto : estoque.getListaDeProdutos()) {
      if (produto.getNome().equals(nome)) {
        return produto;
      }
    }
    return null;
  }

  @Override
  public Produto encontraProduto(int id) {
    for (Produto produto : estoque.getListaDeProdutos()) {
      if (produto.getId() == id) {
        return produto;
      }
    }
    return null;
  }

  @Override
  public boolean cadastraProduto(Produto produto) {
    return estoque.getListaDeProdutos().add(produto);
  }

  @Override
  public void imprimeCatalogoDoEstoque() {
    for (Produto produto : estoque.getListaDeProdutos()) {
      System.out.println(produto.getNome());
    }
  }

  @Override
  public boolean darBaixaEmEstoque(String nome, int quantidadeParaDarBaixa) {
    Produto produto = encontraProduto(nome);
    if (produto != null && produto.getQuantidadeEmEstoque() >= quantidadeParaDarBaixa) {
      produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidadeParaDarBaixa);
      return true;
    }
    return false;
  }

  @Override
  public boolean darBaixaEmEstoque(int id, int quantidadeParaDarBaixa) {
    Produto produto = encontraProduto(id);
    if (produto != null && produto.getQuantidadeEmEstoque() >= quantidadeParaDarBaixa) {
      produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidadeParaDarBaixa);
      return true;
    }
    return false;
  }

  @Override
  public int getQuantidadeAtualEmEstoque(Produto produto) {
    return produto.getQuantidadeEmEstoque();
  }

  @Override
  public int getPosicaoDoProdutoNaLista(Produto produto) {
    if(estoque.getListaDeProdutos().indexOf(produto) == -1){
      System.out.println("Não foi encontrado o produto");
    }
    return estoque.getListaDeProdutos().indexOf(produto);
  }

  @Override
  public boolean temEstoqueOuNao(Produto produto, int quantidadeParaDarBaixa) {
    return produto.getQuantidadeEmEstoque() >= quantidadeParaDarBaixa;
  }
}
