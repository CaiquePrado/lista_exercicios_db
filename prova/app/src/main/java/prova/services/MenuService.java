package prova.services;

import java.util.Scanner;

import prova.services.interfaces.IMenuService;

public class MenuService implements IMenuService {

  private EstoqueService estoqueService;

  public MenuService(EstoqueService estoqueService) {
    this.estoqueService = estoqueService;
  }

  public void controlaMenu() {
    boolean continuar = true;
    while (continuar) {
      mostraMenu();
      int opcao = recebeOpcaoDoUsuario();
      continuar = switchCase(opcao);
    }
  }

  public void mostraMenu() {
    System.out.println("1. Mostrar estoque");
    System.out.println("2. Sair");
  }

  public int recebeOpcaoDoUsuario() {
    try(Scanner scanner = new Scanner(System.in)){
      System.out.print("Digite a opção: ");
      return scanner.nextInt();
    }
  }

  public void mostraEstoque() {
    estoqueService.imprimeCatalogoDoEstoque();
  }

  public boolean switchCase(int opcao) {
    switch (opcao) {
      case 1:
        mostraEstoque();
        break;
      case 2:
        System.out.println("Você saiu do sistema");
        return false;
      default:
        System.out.println("Opção inválida!");
    }
    return true;
  }
}
