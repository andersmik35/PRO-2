package opgave4_1;

import java.util.Comparator;

public class NummerCompare implements Comparator <Kunde> {
    @Override
    public int compare(Kunde o1, Kunde o2) {
        return o1.getNummer() - o2.getNummer();
    }
}
