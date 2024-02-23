package prova.models;
import java.util.Objects;

public class Produto {
  
  private int id;
  private String nome;
  private double preco;
  private int quantidadeEmEstoque;

  public Produto() {}

  public Produto(int id, String nome, double preco, int quantidadeEmEstoque) {
    this.id = id;
    this.nome = nome;
    this.preco = preco;
    this.quantidadeEmEstoque = quantidadeEmEstoque;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getQuantidadeEmEstoque() {
    return quantidadeEmEstoque;
  }

  public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
    this.quantidadeEmEstoque = quantidadeEmEstoque;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Produto)) {
            return false;
        }
        Produto produto = (Produto) o;
        return id == produto.id && nome.equals(produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}


