package product;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import product.models.Product;
import product.services.ProductService;
import product.utils.PriceFormatter;

class AppTest {

  ProductService productService;
  Product product;
  PriceFormatter priceFormatter;

  @BeforeEach
  void setup(){
    priceFormatter = new PriceFormatter();
  }

  @Test
  void testGetTotal(){

    String productName = "camisa";
    double productPrice = 55.00;
    int productQuantity = 5;

    product = new Product(productName, productPrice, productQuantity);
    productService = new ProductService(product);

    double expectedTotal = productPrice * productQuantity;
    assertEquals(expectedTotal, productService.getTotal());
}

@Test
void testDiscountPerUnitPurchased_WhenDiscountIsTenPerCent_ShouldReturnTotalDiscounted() {

    String productName = "camisa";
    double productPrice = 55.00;
    int productQuantity = 11;
    double discount = 0.90;

    product = new Product(productName, productPrice, productQuantity);
    productService = new ProductService(product);

    double expectedTotal = productService.getTotal();
    String expectedTotalWithDiscount = priceFormatter.format(expectedTotal * discount);

    assertEquals(expectedTotalWithDiscount, productService.discountPerUnitPurchased());
  }

  @Test
  void testDiscountPerUnitPurchased_WhenDiscountIsTwentyPerCent_ShouldReturnTotalDiscounted(){
    
    String productName = "camisa";
    double productPrice = 55.00;
    int productQuantity = 22;
    double discount = 0.80;

    product = new Product(productName, productPrice, productQuantity);
    productService = new ProductService(product);

    double expectedTotal = productService.getTotal();
    String expectTotalWithDiscount = priceFormatter.format(expectedTotal * discount);

    assertEquals(expectTotalWithDiscount, productService.discountPerUnitPurchased());
  }

  @Test
  void testDiscountPerUnitPurchased_WhenDiscountIsThirdPerCent_ShouldReturnTotalDiscounted(){

    String productName = "camisa";
    double productPrice = 55.00;
    int productQuantity = 52;
    double discount = 0.75;

    product = new Product(productName, productPrice, productQuantity);
    productService = new ProductService(product);

    double expectedTotal = productService.getTotal();
    String expectTotalWithDiscount = priceFormatter.format(expectedTotal * discount);

    assertEquals(expectTotalWithDiscount, productService.discountPerUnitPurchased());
  }
}
