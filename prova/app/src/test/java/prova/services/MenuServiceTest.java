package prova.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import prova.models.Estoque;
import prova.models.Produto;

public class MenuServiceTest {

  Estoque estoque;
  EstoqueService estoqueService;
  MenuService menuService;

  @BeforeEach
  void setup(){

    Produto produto1 = new Produto(1,"teclado", 10.0, 82);
    Produto produto2 = new Produto(2, "mouse", 20.0, 33);
    Produto produto3 = new Produto(3, "mousepad", 30.0, 0);
  
    ArrayList<Produto> listaDeProdutos = new ArrayList<>();
    listaDeProdutos.add(produto1);
    listaDeProdutos.add(produto2);
    listaDeProdutos.add(produto3);
  
    int estoqueId = 1;
    estoque = new Estoque(estoqueId, listaDeProdutos);
  
    estoqueService = new EstoqueService(estoque);
  
    menuService = new MenuService(estoqueService);
  }
  
  
  @Test 
  void testMostraMenu(){
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outContent));

    menuService.mostraMenu();

    System.setOut(originalOut);

    assertTrue(outContent.toString().contains("1. Mostrar estoque"));
    assertTrue(outContent.toString().contains("2. Sair"));
  }

  @Test
  void testRecebeOpcaoDoUsuario() {

    ByteArrayInputStream in = new ByteArrayInputStream("1\n".getBytes());
    System.setIn(in);

    int opcao = menuService.recebeOpcaoDoUsuario();

    assertEquals(1, opcao);
  }

  @Test
  void testMostraEstoque() {
    
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outContent));

    menuService.mostraEstoque();

    System.setOut(originalOut);

    assertTrue(outContent.toString().contains("teclado"));
    assertTrue(outContent.toString().contains("mouse"));
    assertTrue(outContent.toString().contains("mousepad"));
  }
}
