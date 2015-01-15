/**
 * Created by arthurhouillon on 15/01/2015.
 */
public class Dollar extends Money {

    public Dollar(int value) {
        amount=value;
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
