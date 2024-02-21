package fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fibonacci.models.FibonacciModel;
import fibonacci.services.FibonacciService;

class AppTest {

    FibonacciModel fibonacciModel;
    FibonacciService fibonacciService;
    
    @Test
    void testFibonacciFuntion_WhenGivenNumberNine_ShouldReturnFibonacciSequence(){
        int fibonacciSize = 9;
        fibonacciModel = new FibonacciModel(fibonacciSize);
        fibonacciService = new FibonacciService(fibonacciModel);
    
        String expectedSequence = "0 1 1 2 3 5 8 13 21 34 ";
        var actual = fibonacciService.fibonacciFunction();
    
        assertEquals(expectedSequence, actual);
    }
}
