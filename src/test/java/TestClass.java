import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Factorial.getFactorial;

public class TestClass {
    @Test
    public void testFactorial() {
        Assertions.assertEquals(getFactorial(10), 3628800);
    }

}
