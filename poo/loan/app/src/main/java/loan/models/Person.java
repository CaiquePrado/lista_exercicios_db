package loan.models;

import java.util.UUID;

public class Person {
  
  private UUID id;
  private String name;
  private long phone;
  private String address;
  private String email;

  public Person() {}

  public Person(UUID id, String name, long phone, String address, String email) {
    this.id = id;
    this.name = name;
    this.phone = phone;
    this.address = address;
    this.email = email;
  }

  public UUID getId() {
    return this.id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getPhone() {
    return this.phone;
  }

  public void setPhone(long phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", name='" + getName() + "'" +
      ", phone='" + getPhone() + "'" +
      ", address='" + getAddress() + "'" +
      ", email='" + getEmail() + "'" +
      "}";
  }
  
}
