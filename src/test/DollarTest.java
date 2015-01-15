import org.junit.Test;

import static org.junit.Assert.*;

public class DollarTest {

    @Test
    public void testMultiplication() {
        Money five= Money.Dollar(5);
        assertEquals(Money.Dollar(10), five.times(2));
        assertEquals(Money.Dollar(15), five.times(3));
    }


}