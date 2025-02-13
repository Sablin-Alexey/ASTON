import org.testng.annotations.Test;

import static org.example.Factorial.getFactorial;
import static org.testng.Assert.assertEquals;

public class TestClass {

    @Test
    public void testFactorial() {
        assertEquals(getFactorial(10), 3628800);
    }

}
