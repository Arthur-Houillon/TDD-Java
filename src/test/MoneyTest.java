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

    @Test
    public void testSimpleAddition() {
        Money five= new Money(5,"USD");
        Expression sum= five.plus(five);
        Bank bank= new Bank();
        Money reduced= bank.reduce(sum, "USD");
        assertEquals(new Money(10,"USD"), reduced);
    }

    @Test
    public void testPlusReturnsSum() {
        Money five= new Money(5,"USD");
        Expression result= five.plus(five);
        Sum sum= (Sum) result;
        assertEquals(five, sum.augend);
        assertEquals(five, sum.addend);
    }

    @Test
    public void testReduceSum() {
        Expression sum= new Sum(Money.Dollar(3), Money.Dollar(4));
        Bank bank= new Bank();
        Money result= bank.reduce(sum, "USD");
        assertEquals(Money.Dollar(7), result);
    }

    @Test
    public void testReduceMoney() {
        Bank bank= new Bank();
        Money result= bank.reduce(Money.Dollar(1), "USD");
        assertEquals(Money.Dollar(1), result);
    }

    @Test
    public void testReduceMoneyDifferentCurrency() {
        Bank bank= new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result= bank.reduce(Money.Franc(2), "USD"); assertEquals(Money.Dollar(1), result);
    }

    @Test
    public void testArrayEquals() {
        assertEquals(new Object[] {"abc"}, new Object[] {"abc"});
    }

    @Test
    public void testIdentityRate() {
        assertEquals(1, new Bank().rate("USD", "USD"));
    }

    @Test
    public void testMixedAddition() {
        Expression fiveBucks= Money.Dollar(5);
        Expression tenFrancs= Money.Franc(10);
        Bank bank= new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result= bank.reduce(fiveBucks.plus(tenFrancs), "USD"); assertEquals(Money.Dollar(10), result);
    }




}
