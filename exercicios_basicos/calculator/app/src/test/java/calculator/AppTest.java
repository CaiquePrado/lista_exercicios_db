package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calculator.models.Calculator;
import calculator.services.CalculatorService;

class AppTest {

    private Calculator calculator;
    private CalculatorService calculatorService;


    @Test
    void testSum_WhenTwoIsAddedByTwo_ShouldReturnFourDotZero(){
        calculator = new Calculator(2, "+", 2);
        calculatorService = new CalculatorService(calculator);

        String expectedSum = "4.00";
        var actual = calculatorService.calc();

        assertEquals(expectedSum, actual);
    }

    @Test
    void testSubtraction_WhenTwoIsSubtractedByTwo_ShouldReturnZeroDotZero(){
        calculator = new Calculator(2, "-", 2);
        calculatorService = new CalculatorService(calculator);

        String expectedSum = "0.00";
        var actual = calculatorService.calc();

        assertEquals(expectedSum, actual);
    }

    @Test
    void testMultiplication_WhenTwoIsMultipliedByTwo_ShouldReturnFourDotZero(){
        calculator = new Calculator(2, "*", 2);
        calculatorService = new CalculatorService(calculator);

        String expectedSum = "4.00";
        var actual = calculatorService.calc();

        assertEquals(expectedSum, actual);
    }

    @Test
    void testDivisionn_WhenTwoIsDividedByTwo_ShouldReturnOneDotZero(){
        calculator = new Calculator(2, "/", 2);
        calculatorService = new CalculatorService(calculator);

        String expectedSum = "1.00";
        var actual = calculatorService.calc();

        assertEquals(expectedSum, actual);
    }

    @Test
    void testWrongOperator_WhenGivenWrongOperator_ShouldReturnTypeAValidOperator(){
        calculator = new Calculator(2, "k", 2);
        calculatorService = new CalculatorService(calculator);

        String expectedMessage = "Digite um operador válido";
        var actual = calculatorService.calc();

        assertEquals(expectedMessage, actual);
    }
}
