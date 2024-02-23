package prova.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import prova.models.Estoque;
import prova.models.Produto;

public class EstoqueServiceTest {

  Estoque estoque;
  ArrayList<Produto> listaDeProdutos = new ArrayList<>();
  EstoqueService estoqueService;

  Produto produto1;
  Produto produto2;
  Produto produto3;

  @BeforeEach
  void setup(){
    produto1 = new Produto(1,"teclado", 10.0, 82);
    produto2 = new Produto(2, "mouse", 20.0, 33);
    produto3 = new Produto(3, "mousepad", 30.0, 0);
  }
  
  @Test
  void testInicializaEstoque(){
    
    int estoqueId = 1;
    estoque = new Estoque(estoqueId, listaDeProdutos);
    estoqueService = new EstoqueService(estoque);

    estoqueService.inicializaEstoque();

    assertEquals(3, listaDeProdutos.size());
  }

  @Test
  void testEncontraProdutoPorString(){

    int estoqueId = 1;
    estoque = new Estoque(estoqueId, listaDeProdutos);
    estoqueService = new EstoqueService(estoque);

    estoqueService.inicializaEstoque();

    Produto encontrado = estoqueService.encontraProduto("mouse");
    
    assertNotNull(encontrado);
    assertEquals("mouse", encontrado.getNome());
    assertEquals(20.0, encontrado.getPreco());
    assertEquals(33, encontrado.getQuantidadeEmEstoque());
  }

  @Test
  void testEncontraProdutoPorStringComNomeQueNaoEstaNaListaDeProdutos(){

    int estoqueId = 1;
    estoque = new Estoque(estoqueId, listaDeProdutos);
    estoqueService = new EstoqueService(estoque);

    estoqueService.inicializaEstoque();

    Produto naoEncontrado = estoqueService.encontraProduto("monitor");
    assertNull(naoEncontrado);
  }

  @Test
  void testEncontraProdutoPorId(){

    int estoqueId = 1;
    estoque = new Estoque(estoqueId, listaDeProdutos);
    estoqueService = new EstoqueService(estoque);

    estoqueService.inicializaEstoque();

    Produto encontrado = estoqueService.encontraProduto(1);
    
    assertNotNull(encontrado);
    assertEquals(1, encontrado.getId());
  }

  @Test
  void testEncontraProdutoPorIdQueNaoEstaNaListaDeProdutos(){

    int estoqueId = 1;
    estoque = new Estoque(estoqueId, listaDeProdutos);
    estoqueService = new EstoqueService(estoque);


    estoqueService.inicializaEstoque();

    Produto naoEncontrado = estoqueService.encontraProduto(4);
    assertNull(naoEncontrado);
  }

  @Test
  void testCadastraProduto(){

    int estoqueId = 1;
    estoque = new Estoque(estoqueId, listaDeProdutos);
    estoqueService = new EstoqueService(estoque);

    Produto produto4 = new Produto(4,"webcam", 30.0, 5);

    boolean actual = estoqueService.cadastraProduto(produto4);

    assertTrue(actual);
    assertEquals(1, estoque.getListaDeProdutos().size());
    assertEquals(produto4, estoque.getListaDeProdutos().get(0));
  }

  @Test
  void testGetQuantidadeAtualEmEstoque(){

    int estoqueId = 1;
    estoque = new Estoque(estoqueId, listaDeProdutos);
    estoqueService = new EstoqueService(estoque);

    int quantidadeProduto1 = estoqueService.getQuantidadeAtualEmEstoque(produto1);
    int quantidadeProduto2 = estoqueService.getQuantidadeAtualEmEstoque(produto2);
    int quantidadeProduto3 = estoqueService.getQuantidadeAtualEmEstoque(produto3);

    assertEquals(82, quantidadeProduto1);
    assertEquals(33, quantidadeProduto2);
    assertEquals(0, quantidadeProduto3);
  }

  @Test
  void testGetPosicaoDoProdutoNaLista(){

    int estoqueId = 1;
    estoque = new Estoque(estoqueId, listaDeProdutos);
    estoqueService = new EstoqueService(estoque);
    
    estoqueService.cadastraProduto(produto1);
    estoqueService.cadastraProduto(produto2);
    estoqueService.cadastraProduto(produto3);

    int posicaoProduto1 = estoqueService.getPosicaoDoProdutoNaLista(produto1);
    int posicaoProduto2 = estoqueService.getPosicaoDoProdutoNaLista(produto2);
    int posicaoProduto3 = estoqueService.getPosicaoDoProdutoNaLista(produto3);

    assertEquals(0, posicaoProduto1);
    assertEquals(1, posicaoProduto2);
    assertEquals(2, posicaoProduto3);
  }

  @Test
  void testTemEstoque(){

    int estoqueId = 1;
    estoque = new Estoque(estoqueId, listaDeProdutos);
    estoqueService = new EstoqueService(estoque);

    boolean temEstoqueProduto1 = estoqueService.temEstoqueOuNao(produto1, 82);

    assertTrue(temEstoqueProduto1);
  }

  @Test
  void testNaoTemEstoque(){

    int estoqueId = 1;
    estoque = new Estoque(estoqueId, listaDeProdutos);
    estoqueService = new EstoqueService(estoque);

    Produto produtoSemEstoque = new Produto(5,"processador", 2000.0, 0);
    estoqueService.cadastraProduto(produtoSemEstoque);

    boolean temEstoque = estoqueService.temEstoqueOuNao(produtoSemEstoque, 1);

    assertFalse(temEstoque);
  }
}
