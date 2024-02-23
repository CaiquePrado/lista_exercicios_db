package loan;

import java.time.LocalDate;
import java.util.UUID;

import loan.models.Book;
import loan.models.Person;
import loan.services.LoanService;

public class App {

    public static void main(String[] args) {

        UUID id1 = UUID.randomUUID();
        Person personOne = new Person(id1, "Caique", 134567890, "vitória da conquista, rua A, nº1", "caique@gmail.com");
        
        UUID id2 = UUID.randomUUID();
        Person personTwo = new Person(id2, "Lucca", 276543210, "Porto Alegre, rua B, nº1", "lucca@gmail.com");
        
        UUID id3 = UUID.randomUUID();
        Person personThree = new Person(id3, "Vitor Pedro", 551112222, "Minas Gerais, rua C, nº1", "VitorPedro@hotmail.com");

        Book narutoBook = new Book("Naruto", "Masashi Kishimoto", "Adventure", "Japain", LocalDate.of(2007, 4, 10), false);
        Book jsBook = new Book("Estruturas de Dados e Algoritmos com JavaScript", "Loiane Groner", "Educational", "Portuguese", LocalDate.of(2019, 3, 11), true);
        Book onePiceBook = new Book("One piece", "Eiichiro Oda", "Adventure", "Japain", LocalDate.of(2002, 7, 30), false);

        LoanService firstLoanService = new LoanService(personOne, narutoBook);
        LoanService secondLoanService = new LoanService(personTwo, jsBook);
        LoanService thirdLoanService = new LoanService(personThree, onePiceBook);

        secondLoanService.rentBook();
        System.out.println();
        firstLoanService.returnBook();
        System.out.println();
        thirdLoanService.getDetailsOfBook();
    }
}
