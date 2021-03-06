/**
 * Created by arthurhouillon on 15/01/2015.
 */
public class Money implements Expression {


    public String toString() {
        return amount + " " + currency;
    }



    protected int amount;
    protected String currency;

    public Money(int value, String currency){
        amount=value;
        this.currency=currency;
    }


    public Expression times(int multiplier){
        return new Money(amount*multiplier, currency);
    }


    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && currency==money.currency;
    }


    public static Money Dollar(int amount) {
        return new Money(amount,"USD");
    }
    public static Money Franc(int amount) {
        return new Money(amount, "CHF");
    }


    public Expression plus(Expression addend) {
        return new Sum(this,addend);
    }

    public Money reduce(Bank bank, String to){
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }

}
