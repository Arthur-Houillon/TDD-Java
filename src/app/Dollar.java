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
}
