/**
 * Created by arthurhouillon on 15/01/2015.
 */
public abstract class Money {
    abstract Money times(int multiplier);

    protected int amount;



    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }


    public static Money Dollar(int amount) {
        return new Dollar(amount);
    }
    public static Money Franc(int amount) {
        return new Franc(amount);
    }
}
