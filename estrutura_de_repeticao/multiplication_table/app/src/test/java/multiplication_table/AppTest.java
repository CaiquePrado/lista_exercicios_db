package multiplication_table;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import multiplication_table.models.MultiplicationTable;
import multiplication_table.services.MultiplicationTableService;

class AppTest {

    private MultiplicationTable multiplicationTable;
    private MultiplicationTableService multiplicationTableService;

    @BeforeEach
    void setUp() {
      int userNumber = 2;
      multiplicationTable = new MultiplicationTable(userNumber);
      multiplicationTableService = new MultiplicationTableService(multiplicationTable);
    }

    @Test
    void testMultiplicationTable(){
      multiplicationTableService.multiplicationTable();
    }
}
