import java.util.Hashtable;

/**
 * Created by arthurhouillon on 15/01/2015.
 */
public class Bank {

    private Hashtable rates= new Hashtable();

    int rate(String from, String to){
        if (from.equals(to)) return 1;
        Integer rate= (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }

    public Money reduce(Expression source, String to) {
        return source.reduce(this,to);
    }

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer(rate));
    }


}
