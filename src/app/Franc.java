/**
 * Created by arthurhouillon on 15/01/2015.
 */
public class Franc {
    private int amount;

    public Franc(int value) {
        amount=value;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }
}
