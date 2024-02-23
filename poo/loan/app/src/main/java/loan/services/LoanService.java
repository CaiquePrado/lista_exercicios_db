package loan.services;

import loan.models.Book;
import loan.models.Person;

public class LoanService {
  
  private Person person;
  private Book book;
  
  public LoanService(Person person, Book book) {
    this.person = person;
    this.book = book;
  }

  public String rentBook(){
    String rentedBook = "";
    if(book.getAvailable() == true){
      book.setAvailable(false);
      rentedBook = person.getName() + " pegou emprestado o livro: " + book.getTitle() + " autor(a) " + book.getAuthor() + "\n" +
      "Endereço do cliente: " + person.getAddress();
    }else{
      return "Livro já foi pego emprestado por outra pessoa";
    }
    return rentedBook;
  }

  public String returnBook(){
    String returnedBook = "";
    if(book.getAvailable() == false){
      book.setAvailable(true);
      returnedBook = person.getName() + " devolveu o livro: " + book.getTitle();
    }
    return returnedBook;
  }

  public String getDetailsOfBook(){
    return "Título: " + book.getTitle() + ", autor(a): " + book.getAuthor() + ", disponível: " + (book.getAvailable() ? "sim" : "não");
  }
}
