package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import calculator.models.Calculator;
import calculator.services.CalculatorService;

class AppTest {

    Calculator calculator;
    CalculatorService calculatorService;
    
    @Test 
    void testSum_WhenTwoDotZeroIsAddedByTwoDotZero_ShouldReturnFourDotZero() {
        Double n1 = 2.0;
        Double n2 = 2.0;

        calculatorService = new CalculatorService(calculator);

        Double expectedResult = 4.0;
        var actual = calculatorService.sum(n1, n2);

        assertEquals(expectedResult, actual);
    }

    @Test 
    void testSum_WhenTwoDotZeroIsSubtractedByTwoDotZero_ShouldReturnZeroDotZero() {
        Double n1 = 2.0;
        Double n2 = 2.0;

        calculatorService = new CalculatorService(calculator);

        Double expectedResult = 0.0;
        var actual = calculatorService.subtraction(n1, n2);

        assertEquals(expectedResult, actual);
    }

    @Test 
    void testSum_WhenTwoDotZeroIsMultipliedByTwoDotZero_ShouldReturnFourDotZero() {
        Double n1 = 2.0;
        Double n2 = 2.0;

        calculatorService = new CalculatorService(calculator);

        Double expectedResult = 4.0;
        var actual = calculatorService.multiplication(n1, n2);

        assertEquals(expectedResult, actual);
    }

    @Test 
    void testSum_WhenTwoDotZeroIsPoweredByTwoDotZero_ShouldReturnFourDotZero() {
        Double n1 = 2.0;
        Double n2 = 2.0;

        calculatorService = new CalculatorService(calculator);

        Double expectedResult = 4.0;
        var actual = calculatorService.power(n1, n2);

        assertEquals(expectedResult, actual);
    }

    @Test
    void testWrongOperator_WhenUserChoseWrogOperator_ShouldReturnTypeValidOperator(){
        Double n1 = 2.0;
        Double n2 = 2.0;
        String operator = "k";
        
        calculator = new Calculator(n1, n2, operator);
        calculatorService = new CalculatorService(calculator);

        String expectedMessage = "Digite um operador válido";
        var actual = calculatorService.calc();

        assertEquals(expectedMessage, actual);
    }

    @Test
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmeticException() {
        Double n1 = 2.0;
        Double n2 = 0.0;

        calculatorService = new CalculatorService(calculator);
        var expectedMessage = "Impossible to divide by zero!";

        ArithmeticException actual = assertThrows(
            ArithmeticException.class, () -> {
                calculatorService.division(n1, n2);
            });
        assertEquals(expectedMessage, actual.getMessage());
    }
}
