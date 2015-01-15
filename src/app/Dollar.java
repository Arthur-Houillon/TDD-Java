/**
 * Created by arthurhouillon on 15/01/2015.
 */
public class Dollar {
    int amount;

    public Dollar(int value) {
        amount=value;
    }

    public void times(int multiplier) {
        amount *= multiplier;

    }
}
