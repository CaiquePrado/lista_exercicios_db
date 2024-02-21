
package fibonacci_two;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fibonacci_two.models.FibonacciModel;
import fibonacci_two.services.FibonacciService;

class AppTest {

    FibonacciModel fibonacciModel;
    FibonacciService fibonacciService;
    
    @Test
    void testFibonacciFuntion_WhenGivenNumberNine_ShouldReturnFibonacciSequence(){
        int maxFibonacciSequence = 25;
        fibonacciModel = new FibonacciModel(maxFibonacciSequence);
        fibonacciService = new FibonacciService(fibonacciModel);
    
        String expectedSequence = "0 1 1 2 3 5 8 13 21 ";
        var actual = fibonacciService.fibonacciFunction();
    
        assertEquals(expectedSequence, actual);
    }
}
