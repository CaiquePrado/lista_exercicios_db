package prova.services;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import prova.models.Item;
import prova.models.Pedido;
import prova.models.Produto;

public class PedidoServiceTest {

  Pedido pedido;
  Produto produto = new Produto(1, "Produto A", 20.0, 4);
  int quantidade = 3;
  Item item = new Item(produto, quantidade);
  ArrayList<Item> listaDeItens = new ArrayList<>();
  PedidoService pedidoService;


  @BeforeEach
  void setUp() {
    listaDeItens.add(item);
    pedido = new Pedido(listaDeItens);
    pedidoService = new PedidoService(pedido);
  }

  @Test
  void testCalcularValorTotal() {
    pedido = new Pedido(listaDeItens);
    pedidoService = new PedidoService(pedido);

    pedidoService.calcularValorTotal();

    double expectedTotal = 20.0 * 3;
    assertEquals(expectedTotal, pedido.getValorTotalDoPedido());
  }

  @Test
  void testAdicionaItemNaLista(){
    pedido = new Pedido(listaDeItens);
    pedidoService = new PedidoService(pedido);

    Produto novoProduto = new Produto(2, "Produto B", 15.0, 2);
    int novaQuantidade = 1;
    boolean adicionadoComSucesso = pedidoService.adicionaItemNaLista(novoProduto, novaQuantidade);

    assertTrue(adicionadoComSucesso);
    assertEquals(2, pedido.getListaDeItens().size());
  }

  @Test
  void testImprimePedido() {

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    pedidoService.imprimePedido();

    String expectedOutput = "Produto A - Quantidade: 3";
    assertTrue(outputStream.toString().contains(expectedOutput));
  }

  @Test
  void testRecebeNomeDoTeclado() {

    String nomeDoProduto = "Produto";
    System.setIn(new ByteArrayInputStream(nomeDoProduto.getBytes()));

    String resultado = pedidoService.recebeNomeDoTeclado();

    assertEquals(nomeDoProduto, resultado);
  }

  @Test
  void testRecebeQuantidadeDoTeclado(){

    String quantidadeDoProduto = "2";
    System.setIn(new ByteArrayInputStream(quantidadeDoProduto.getBytes()));
    
    String resultado = pedidoService.recebeNomeDoTeclado();

    assertEquals("2", resultado);
  }

  @Test
  void testLimparCarrinho(){
    pedidoService.limparCarrinho();

    assertEquals(0.0, pedido.getValorTotalDoPedido());

    assertTrue(pedido.getListaDeItens().isEmpty());
  }

  @Test
  void testReceberTroco_ComValorPagoMaiorQueTotal() {
      pedido.setValorTotalDoPedido(50.0);

      double valorPago = 70.0;
      double trocoEsperado = valorPago - pedido.getValorTotalDoPedido();

      double trocoCalculado = pedidoService.receberTroco(valorPago);

      assertEquals(trocoEsperado, trocoCalculado);
  }

  @Test
  void testReceberTroco_ComValorPagoMenorQueTotal() {
      pedido.setValorTotalDoPedido(50.0);

      double valorPago = 30.0;
      double trocoEsperado = 0.0; 

      double trocoCalculado = pedidoService.receberTroco(valorPago);

      assertEquals(trocoEsperado, trocoCalculado);
  }

 @Test
void testCalcularNumeroMinimoDeCedulasEMoedas_ComValorPagoMaiorQueTotal() {
    double valorPago = 500.0;
    double valorTotalDoPedido = 450.0;
    pedido.setValorTotalDoPedido(valorTotalDoPedido);
    
    double expectedTroco = 50.0;
    double actualTroco = pedidoService.receberTroco(valorPago);
    assertEquals(expectedTroco, actualTroco);
    
    int[] expectedNotas = {0, 0, 1, 0, 0, 0, 0};
    int[] actualNotas = pedidoService.calcularNumeroMinimoDeCedulas(valorPago);
    assertArrayEquals(expectedNotas, actualNotas, "The number of notes should match the expected array");
}

@Test
void testCalcularNumeroMinimoDeCedulasEMoedas_ComValorPagoMenorQueTotal() {
    double valorPago = 400.0;
    double valorTotalDoPedido = 450.0;
    pedido.setValorTotalDoPedido(valorTotalDoPedido);
    
    double expectedTroco = 0.0;
    double actualTroco = pedidoService.receberTroco(valorPago);
    assertEquals(expectedTroco, actualTroco);
    
    int[] expectedNotas = {0, 0, 0, 0, 0, 0, 0};
    int[] actualNotas = pedidoService.calcularNumeroMinimoDeCedulas(valorPago);
    assertArrayEquals(expectedNotas, actualNotas);
  }
}


