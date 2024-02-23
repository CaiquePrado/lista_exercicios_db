package phonebook.services;

import java.util.ArrayList;
import java.util.List;

import phonebook.models.Contact;

public class AgendaService {

  private List<Contact> contacts= new ArrayList<>();

  public AgendaService(List<Contact> contacts) {
    this.contacts = contacts;
  }

  public void register(Contact contact){
    contacts.add(contact);
  }

  public void remove(Contact contact){
    if (contacts.contains(contact)){
      contacts.remove(contact);
    } else {
      System.out.println("O número não está na agenda.");
    }
  }

  public Contact getByNumberOrName(String nameOrNumber){
    for (Contact contact : contacts) {
        if (contact.getNome().equals(nameOrNumber) || contact.getNumero().equals(nameOrNumber)) {
            return contact;
        }
    }
    System.out.println("O " + nameOrNumber + "não está na agenda." );
    return null;
  }
}
