package jokenpo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import jokenpo.models.Jokenpo;
import jokenpo.services.JokenpoService;

class AppTest {

    private Jokenpo jokenpo;
    private JokenpoService jokenpoService;
    
    @Test
    void testGernerateRandomNumber(){
        jokenpoService = new JokenpoService(jokenpo);
        int actual = jokenpoService.gernerateRandomNumber();
        assertTrue(actual >= 1 && actual <=3);
    }
    
    @Test
    void testGenerateMachineResponse(){

        jokenpoService = new JokenpoService(jokenpo);
        String actual = jokenpoService.generateMachineResponse();

        if(actual.equals("pedra")){
            assertEquals("pedra", actual);
        }else if(actual.equals("papel")){
            assertEquals("papel", actual);
        }else{
            assertEquals("tesoura", actual);
        }
    }

    @Test
    void testMachineWinner_WhenPaperChoisedOnRock_ShouldReturnMachineWins(){
        String userChoice = "pedra";
        jokenpo = new Jokenpo(userChoice);
        jokenpoService = new JokenpoService(jokenpo);
    
        String machineChoice = "papel";
        String actual = jokenpoService.winner(machineChoice);
        String expectedMessage = "Máquina ganhou!";
        assertEquals(actual, expectedMessage);
    }
    
    @Test
    void testMachineWinner_WhenScissersChoisedOnPaper_ShouldReturnMachineWins(){
        String userChoice = "papel";
        jokenpo = new Jokenpo(userChoice);
        jokenpoService = new JokenpoService(jokenpo);
    
        String machineChoice = "tesoura";
        String actual = jokenpoService.winner(machineChoice);
        String expectedMessage = "Máquina ganhou!";
        assertEquals(actual, expectedMessage);
    }
    
    @Test
    void testMachineWinner_WhenRockChoisedOnScissers_ShouldReturnMachineWins(){
        String userChoice = "tesoura";
        jokenpo = new Jokenpo(userChoice);
        jokenpoService = new JokenpoService(jokenpo);
    
        String machineChoice = "pedra";
        String actual = jokenpoService.winner(machineChoice);
        String expectedMessage = "Máquina ganhou!";
        assertEquals(actual, expectedMessage);
    }
    
    @Test
    void testDrawGame_WhenUserAndMachineHasSameChoices_ShouldReturnDraw(){
        String userChoice = "pedra";
        jokenpo = new Jokenpo(userChoice);
        jokenpoService = new JokenpoService(jokenpo);
    
        String machineChoice = "pedra";
        String actual = jokenpoService.winner(machineChoice);
        String expectedMessage = "Empate!";
        assertEquals(actual, expectedMessage);
    }

    @Test
    void testuserWinner_WhenPaperChoisedOnRock_ShouldReturnMachineWins(){
        String userChoice = "papel";
        jokenpo = new Jokenpo(userChoice);
        jokenpoService = new JokenpoService(jokenpo);
    
        String machineChoice = "pedra";
        String actual = jokenpoService.winner(machineChoice);
        String expectedMessage = "Você ganhou!";
        assertEquals(actual, expectedMessage);
    }
    
    @Test
    void testuserWinner_WhenScissersChoisedOnPaper_ShouldReturnMachineWins(){
        String userChoice = "tesoura";
        jokenpo = new Jokenpo(userChoice);
        jokenpoService = new JokenpoService(jokenpo);
    
        String machineChoice = "papel";
        String actual = jokenpoService.winner(machineChoice);
        String expectedMessage = "Você ganhou!";
        assertEquals(actual, expectedMessage);
    }
    
    @Test
    void testuserWinner_WhenRockChoisedOnScissers_ShouldReturnMachineWins(){
        String userChoice = "pedra";
        jokenpo = new Jokenpo(userChoice);
        jokenpoService = new JokenpoService(jokenpo);
    
        String machineChoice = "tesoura";
        String actual = jokenpoService.winner(machineChoice);
        String expectedMessage = "Você ganhou!";
        assertEquals(actual, expectedMessage);
    }
}
