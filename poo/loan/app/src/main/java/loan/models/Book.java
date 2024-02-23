package loan.models;

import java.time.LocalDate;

public class Book {
  
  private String title;
  private String author;
  private String genre;
  private String language;
  private LocalDate yearOfPublication;
  private boolean available;

  public Book() {}

  public Book(String title, String author, String genre, String language, LocalDate yearOfPublication, boolean available) {
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.language = language;
    this.yearOfPublication = yearOfPublication;
    this.available = available;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getGenre() {
    return this.genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public LocalDate getYearOfPublication() {
    return this.yearOfPublication;
  }

  public void setYearOfPublication(LocalDate yearOfPublication) {
    this.yearOfPublication = yearOfPublication;
  }
  public boolean isAvailable() {
    return this.available;
  }

  public boolean getAvailable() {
    return this.available;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }

  @Override
  public String toString() {
    return "{" +
      " title='" + getTitle() + "'" +
      ", author='" + getAuthor() + "'" +
      ", genre='" + getGenre() + "'" +
      ", language='" + getLanguage() + "'" +
      ", yearOfPublication='" + getYearOfPublication() + "'" +
      ", available='" + isAvailable() + "'" +
      "}";
  }
}
