package prova.services;

import prova.models.Item;
import prova.models.Produto;
import prova.services.interfaces.IItemService;

public class ItemService implements IItemService {

  private Item item;

  public ItemService(Item item) {
    this.item = item;
  }

  @Override
  public void defineValorTotal() {
    Produto produto = item.getProduto();
    item.setValorDoItem(produto.getPreco() * item.getQuantidade());
  }
}
