package tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import tree.models.Father;
import tree.models.Mother;

class AppTest {

    Mother mother;
    Father father;

    @Test
    void testGetMotherName() {

        String motherName = "Cristina";
        int motherAge = 42;
        mother = new Mother(motherName, motherAge);

        String expectedName = "Cristina";
        var actual = mother.getName();

        assertEquals(expectedName, actual);
    }

    @Test
    void testGetMotherAge() {

        String motherName = "Cristina";
        int motherAge = 42;
        mother = new Mother(motherName, motherAge);

        int expectedAge = 42;
        var actual = mother.getAge();

        assertEquals(expectedAge, actual);
    }

    @Test
    void testMotherInBeatySalon(){

        String motherName = "Cristina";
        int motherAge = 42;
        mother = new Mother(motherName, motherAge);

        String expectedMessage = "Mamãe está no salão";
        var actual = mother.beautySalon();

        assertEquals(expectedMessage, actual);
    }

    @Test
    void testFatherPlayingSoccer(){

        String fatherName = "Edmar";
        int fatherAge = 47;
        father = new Father(fatherName, fatherAge);

        String expectedMessage = "Papai está jogando bola";
        var actual = father.playSoccer();

        assertEquals(expectedMessage, actual);
    }
}
