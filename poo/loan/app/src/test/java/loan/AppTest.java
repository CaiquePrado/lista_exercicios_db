package loan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.time.LocalDate;
import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import loan.models.Book;
import loan.models.Person;
import loan.services.LoanService;

class AppTest {

    Person person;

    @BeforeEach
    void setup(){
        UUID id = UUID.randomUUID();
        person = new Person(id, "Test", 123456789, "Test Address", "test@gmail.com");
    }
    
    @Test
    void testRentBook() {

        Book book = new Book("Test Book", "Test Author", "Test Genre", "Test Language", LocalDate.of(2020, 1, 1), true);
        LoanService loanService = new LoanService(person, book);

        String result = loanService.rentBook();

        assertFalse(book.getAvailable());
        String expected = "Test pegou emprestado o livro: Test Book autor(a) Test Author\nEndereço do cliente: Test Address";
        assertEquals(expected, result);
    }

    @Test
    void testAlreadyRentedBook() {
        Book book = new Book("Test Book", "Test Author", "Test Genre", "Test Language", LocalDate.of(2020, 1, 1), true);

        LoanService loanService = new LoanService(person, book);

        loanService.rentBook();
    
        String actual = loanService.rentBook();
    
        assertFalse(book.isAvailable());
    
        String expectedMessage = "Livro já foi pego emprestado por outra pessoa";
        assertEquals(expectedMessage, actual);
    }

    @Test
    void testReturnBook_WhenUserReturnBook_ShouldReturnAvailableTrue(){
        Book book = new Book("Test Book", "Test Author", "Test Genre", "Test Language", LocalDate.of(2020, 1, 1), true);
        LoanService loanService = new LoanService(person, book);

        String expectedGetDetailsMessage = "Test devolveu o livro: Test Book";
        loanService.rentBook();
        var actual = loanService.returnBook();

        assertEquals(expectedGetDetailsMessage, actual);
    }

    @Test
    void testGetDetailsBook_WhenGetDetailsBook_SouhldReturnGetDeilsBook(){
        Book book = new Book("Test Book", "Test Author", "Test Genre", "Test Language", LocalDate.of(2020, 1, 1), true);
        LoanService loanService = new LoanService(person, book);

        String expectedGetDetailsMessage = "Título: Test Book, autor(a): Test Author, disponível: sim";
        String actual = loanService.getDetailsOfBook();

        assertEquals(expectedGetDetailsMessage, actual);
    }
}
