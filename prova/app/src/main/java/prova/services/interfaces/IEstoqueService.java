package prova.services.interfaces;

import prova.models.Produto;

public interface IEstoqueService {
  
  void inicializaEstoque();

  Produto encontraProduto(String nome);

  Produto encontraProduto(int id);

  boolean cadastraProduto(Produto produto);

  void imprimeCatalogoDoEstoque();

  boolean darBaixaEmEstoque(String nome, int quantidadeParaDarBaixa);

  boolean darBaixaEmEstoque(int id, int quantidadeParaDarBaixa);

  int getQuantidadeAtualEmEstoque(Produto produto);

  int getPosicaoDoProdutoNaLista(Produto produto);

  boolean temEstoqueOuNao(Produto produto, int quantidadeParaDarBaixa);
  
}
