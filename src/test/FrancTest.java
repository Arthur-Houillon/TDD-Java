import org.junit.Test;

import static org.junit.Assert.*;

public class FrancTest {

    @Test
    public void testMultiplication() {
        Money five= Money.Franc(5);
        assertEquals(Money.Franc(10), five.times(2));
        assertEquals(Money.Franc(15), five.times(3));
    }


}