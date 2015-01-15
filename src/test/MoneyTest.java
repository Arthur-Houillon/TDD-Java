import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class MoneyTest {

    @Test
    public void testEquality() {
        assertTrue(Money.Dollar(5).equals(Money.Dollar(5)));
        assertFalse(Money.Dollar(5).equals(Money.Dollar(6)));
        assertTrue(Money.Franc(5).equals(Money.Franc(5)));
        assertFalse(Money.Franc(5).equals(Money.Franc(6)));
        assertFalse(Money.Franc(5).equals(Money.Dollar(5)));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.Dollar(1).currency);
        assertEquals("CHF", Money.Franc(1).currency);
    }

    @Test
    public void testDifferentClassEquality() {
        assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
    }
}
