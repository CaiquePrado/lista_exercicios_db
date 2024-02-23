
package time;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import time.models.TimeModel;
import time.services.TimeService;

class AppTest {

    TimeModel timeModel;
    TimeService timeService;
    
    @Test
    void testGetHours_WhenUserTypeSeconds_ShouldReturnInHours(){
        long userSeconds = 7023; 

        timeModel = new TimeModel(userSeconds);
        timeService = new TimeService(timeModel);

        long expectedHour = 1;

        var actual = timeService.getHouras();

        assertEquals(expectedHour, actual);
    }

    @Test
    void testGetMinutes_WhenUserTypeSeconds_ShouldReturnInMinutes(){
        long userSeconds = 7023; 

        timeModel = new TimeModel(userSeconds);
        timeService = new TimeService(timeModel);

        long expectedMinutes = 57;

        var actual = timeService.getMiutes();

        assertEquals(expectedMinutes, actual);
    }

    @Test
    void testGetSeconds_WhenUserTypeSeconds_ShouldReturnRemaingSeconds(){
        long userSeconds = 7023; 

        timeModel = new TimeModel(userSeconds);
        timeService = new TimeService(timeModel);

        long expectedMinutes = 3;

        var actual = timeService.getRemaingSeconds();

        assertEquals(expectedMinutes, actual);
    }
}
