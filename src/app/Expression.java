/**
 * Created by arthurhouillon on 15/01/2015.
 */
public interface Expression {


    Money reduce(Bank bank,String to);

    Expression plus(Expression tenFrancs);

    Expression times(int multiplier);
}
