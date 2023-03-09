package opgave5;

import java.util.*;

public class ObservableBag implements Iterable<String>, InterfaceBag{

    private Map<String, Integer> indhold = new HashMap<>();

    private Set<Observer> observers = new HashSet<>();

    @Override
    public Iterator<String> iterator() {
        return indhold.keySet().iterator();

    }

    @Override
    public void add(String s) {
        int amount = 1;
        if (indhold.containsKey(s)) {
            amount = indhold.get(s);
            amount++;
        }
        indhold.put(s, amount);
    }

    @Override
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

    @Override
    public int getCount(String s) {
        return indhold.get(s);
    }

    @Override
    public void RegisterObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        observers.add(o);
    }

    private void notifyObservers(String s, int i){
        for (Observer o : observers){
            o.update(s, i);
        }
    }

}
