package age;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import age.services.PersonService;

class AppTest {

    PersonService legalAge;

    @Test
    public void testLegalAge() {
        legalAge = new PersonService(20);
        assertEquals("Voce eh maior de idade!", legalAge.elderAge());
    }

    @Test
    public void testMinorAge() {
        legalAge = new PersonService(16);
        assertEquals("Voce eh menor de idade!", legalAge.elderAge());
    }

    @Test
    public void testZeroAge() {
        legalAge = new PersonService(0);
        assertEquals("Digite uma idade válida!", legalAge.elderAge());
    }

    @Test
    public void testNegativeAge() {
        legalAge = new PersonService(-5);
        assertEquals("Digite uma idade válida!", legalAge.elderAge());
    }  
}