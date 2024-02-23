package prova.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import prova.models.Item;
import prova.models.Produto;

public class ItemServiceTest {

  Item item;
  Produto produto;
  ItemService itemService;

  @BeforeEach
  void setUp() {
    int idDoProduto = 1;
    String nomeDoProduto = "teclado";
    double precoDoProduto = 88.00;
    int quantidadeEmEstoqueDoProduto = 5;

    produto = new Produto(idDoProduto, nomeDoProduto, precoDoProduto, quantidadeEmEstoqueDoProduto);
    item = new Item(produto, 5);

    itemService = new ItemService(item);
  }

  @Test 
  void testDefineValorTotal(){
    itemService.defineValorTotal();
    double expected = produto.getPreco() * item.getQuantidade();
    double actual = item.getValorDoItem();
    assertEquals(expected, actual);
  }
}

