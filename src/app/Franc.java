/**
 * Created by arthurhouillon on 15/01/2015.
 */
public class Franc extends Money{

    public Franc(int value) {
        amount=value;
    }

    public Money times(int multiplier) {
        return new Franc (amount * multiplier);
    }
}
