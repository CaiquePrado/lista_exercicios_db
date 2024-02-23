package phonebook;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import phonebook.models.Contact;
import phonebook.services.AgendaService;

class AppTest {

    AgendaService agendaService;
    Contact contact1;
    Contact contact2;
    Contact contact3;
    List<Contact> contacts;

    @BeforeEach
    void setUp() {
        contact1 = new Contact("Caique", "77999763053");
        contact2 = new Contact("Victor", "5369372728");
        contact3 = new Contact("Luca", "7763256538");
        contacts = new ArrayList<>();
        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        agendaService = new AgendaService(contacts);
    }

    @Test
    void testRegister() {
        Contact newContact = new Contact("NovoNome", "NovoNumero");
        agendaService.register(newContact);
        assertEquals(newContact, agendaService.getByNumberOrName("NovoNome"));
    }

    @Test
    void testRemove() {
        agendaService.remove(contact1);
        assertNull(agendaService.getByNumberOrName("Caique"));
    }

    @Test
    void testGetByNumberOrName() {
        assertEquals(contact1, agendaService.getByNumberOrName("Caique"));
        assertEquals(contact1, agendaService.getByNumberOrName("77999763053"));
    }
}

