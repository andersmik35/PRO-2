package opgave5;

import java.util.HashMap;
import java.util.Map;

public class Bag implements InterfaceBag {

    private static Map<String, Integer> indhold = new HashMap<>();


    public void add(String s) {
        int amount = 1;
        if (indhold.containsKey(s)) {
            amount = indhold.get(s);
            amount++;
        }
        indhold.put(s, amount);
    }


    public void remove(String s) {
        if (indhold.containsKey(s)) {
            int amount = indhold.get(s);
            amount--;
            if (amount < 1) {
                indhold.remove(s);
            } else {
                indhold.put(s, amount);
            }
        }
    }

    public int getCount(String s) {
        return indhold.get(s);
    }

}
