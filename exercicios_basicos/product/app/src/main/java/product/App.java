package product;

import java.util.Scanner;

import product.models.Product;
import product.services.ProductService;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String name = scanner.nextLine();

        System.out.println("Digite o preço do produto: ");
        double price = 0.0D;
        price = scanner.nextDouble();

        System.out.println("Digite a quantidade de produtos: ");
        int quantity = 0;
        quantity = scanner.nextInt();

        Product product = new Product(name, price, quantity);

        ProductService productService = new ProductService(product);
        
        System.out.println("Produto: " + product.getName() + " Total a pagar: R$ " + productService.discountPerUnitPurchased());

        scanner.close();
    }
}
