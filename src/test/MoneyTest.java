import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class MoneyTest {

    @Test
    public void testEquality() {
        assertTrue(Money.Dollar(5).equals(Money.Dollar(5)));
        assertFalse(Money.Dollar(5).equals(Money.Dollar(6)));
        assertFalse(Money.Franc(5).equals(Money.Dollar(5)));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.Dollar(1).currency);
        assertEquals("CHF", Money.Franc(1).currency);
    }


    @Test
    public void testFrancMultiplication() {
        Money five = Money.Franc(5);
        assertEquals(Money.Franc(10), five.times(2));
        assertEquals(Money.Franc(15), five.times(3));
    }

    @Test
    public void testDollarMultiplication() {
        Money five= Money.Dollar(5);
        assertEquals(Money.Dollar(10), five.times(2));
        assertEquals(Money.Dollar(15), five.times(3));
    }


}
