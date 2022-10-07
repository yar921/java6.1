
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRangeOfNimbers {
    @ParameterizedTest
//    @CsvSource({})
    @CsvFileSource(files="src/test/resources/Range.csv")
    void checkingTheRangeOfNumbers(int expected, int from, int before) {
        RangeOfNumbers service = new RangeOfNumbers();

        //int from = 200;
        //int before = 300;
        //int expected = 3;

        int actual = service.calculate(from, before);

        assertEquals(expected, actual);



    }
}
