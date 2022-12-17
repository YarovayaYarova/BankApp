import HW8.DaysOfTheWeek;
import StaticClassesEnumsException.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Calendar;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class DaysOfTheWeekTest {

//    @Test
//    public void sundayTest() {
//        int dayNumber = 1;
//        String expectedResult = "Sunday";
//        String actualResult = DaysOfTheWeek.getDay(dayNumber);
//        assertEquals(expectedResult, actualResult, "Incorrect information");
//    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(1, "Sunday"),
                Arguments.of(2, "Monday"),
                Arguments.of(3, "Tuesday"),
                Arguments.of(4, "Wednesday"),
                Arguments.of(5, "Thursday"),
                Arguments.of(6, "Friday"),
                Arguments.of(7, "Saturday")
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void positiveTest(int dayNumber, String expectedResult) {
        String actualResult = DaysOfTheWeek.getDay(dayNumber);
        assertEquals(expectedResult, actualResult, "Incorrect information");
        assertTrue(dayNumber>=1 && dayNumber <=7);
        assertNotNull(actualResult, "Null was returned");

    }
    @Test
    @DisplayName("Null pointer exception test")
    public void errorTest() {
        Integer dayNumber = null;
        assertThrows(NullPointerException.class, () -> {
            DaysOfTheWeek.getDay(dayNumber);
        });
    }
    @ParameterizedTest
    @ValueSource(ints = {-10, 0, -3, -357, -34567896})
    public void negativeTest1(int dayNumber) {
        String expectedResult = "The number should be equal or larger than 1";
        String actualResult = DaysOfTheWeek.getDay(dayNumber);
        assertEquals(expectedResult, actualResult, "Incorrect information" );
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 9, 43, 357, 34567896})
    public void negativeTest2(int dayNumber) {
        String expectedResult = "The number should be equal or smaller than 7";
        String actualResult = DaysOfTheWeek.getDay(dayNumber);
        assertEquals(expectedResult, actualResult, "Incorrect information" );
    }


}