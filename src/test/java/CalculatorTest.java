import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void shouldReturnAddtionWhenTwoAreAdded() {
        Calculator calculator = new Calculator();
        int expectedValue = 5;

        int actualValue = calculator.add(2,3);

        assertEquals(expectedValue, actualValue );
    }
}
