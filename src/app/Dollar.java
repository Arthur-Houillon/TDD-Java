/**
 * Created by arthurhouillon on 15/01/2015.
 */
public class Dollar {
    int amount;

    public Dollar(int value) {
        amount=value;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}
