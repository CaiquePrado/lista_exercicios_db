package average;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import average.models.Grade;
import average.services.GradeService;

class AppTest {

    private Grade grade;
    private GradeService gradeService;

    @Test
    void testGetAverage(){
        double[] alumnGrade = {2,4,6};
        grade = new Grade(alumnGrade);
        gradeService = new GradeService(grade);

        var actual = gradeService.average();
        var expectedAverage = 4.0;

        assertEquals(expectedAverage, actual);
    }

    @Test
    void testGetAverage_WhenAverageIsAboveFour_ShouldReturnDisapproved(){
        double[] alumnGrade = {2,4,5};
        grade = new Grade(alumnGrade);
        gradeService = new GradeService(grade);

        var average = gradeService.average();
        var actual = gradeService.status(average);
        var expectedMessage = "Reprovado";

        assertEquals(expectedMessage, actual);
    }

    @Test
    void testGetAverage_WhenAverageIsBetweenFourToSix_ShouldReturnDisapproved(){
        double[] alumnGrade = {2,4,6};
        grade = new Grade(alumnGrade);
        gradeService = new GradeService(grade);

        var average = gradeService.average();
        var actual = gradeService.status(average);
        var expectedMessage = "Verificação Suplementar";

        assertEquals(expectedMessage, actual);
    }

    @Test
    void testGetAverage_WhenAverageIsOverSix_ShouldReturnDisapproved(){
        double[] alumnGrade = {6,6,7};
        grade = new Grade(alumnGrade);
        gradeService = new GradeService(grade);

        var average = gradeService.average();
        var actual = gradeService.status(average);
        var expectedMessage = "Aprovado";

        assertEquals(expectedMessage, actual);
    }
}
