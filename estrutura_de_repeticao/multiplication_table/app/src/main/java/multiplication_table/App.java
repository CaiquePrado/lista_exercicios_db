package multiplication_table;

import java.util.Scanner;

import multiplication_table.models.MultiplicationTable;
import multiplication_table.services.MultiplicationTableService;

public class App {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = 0;
        num = scanner.nextInt();

        MultiplicationTable multiplicationTable = new MultiplicationTable(num);
        MultiplicationTableService multiplicationTableService = new MultiplicationTableService(multiplicationTable);

        multiplicationTableService.multiplicationTable();
        
        scanner.close();

    }
}
