package product.services;

import product.models.Product;
import product.utils.PriceFormatter;

public class ProductService {

  private Product product;

  public ProductService(Product product) {
    this.product = product;
  }

  public double getTotal(){
    return product.getPrice() * product.getQuantity();
  }

  public String discountPerUnitPurchased() {
    int quantity = product.getQuantity();
    double total = getTotal();
    
    PriceFormatter priceFormatter = new PriceFormatter();

    if (quantity >= 51) {
        total *= 0.75;
    } else if (quantity >= 21 && quantity <= 50) {
        total *= 0.80;
    } else if (quantity >= 11 && quantity <= 20) {
        total *= 0.90;
    }

    return priceFormatter.format(total);
  }
}