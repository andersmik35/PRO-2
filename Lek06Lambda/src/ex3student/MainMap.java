package ex3student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(2,4);
        map.put(3,9);
        map.put(4,16);
        map.put(5,25);
        map.put(6,36);

        Iterator <Integer> iterator = map.keySet().iterator();

        while (iterator.hasNext()){
            int next = iterator.next();
            System.out.println(map.get(next) + " " + next);
        }
        //(2,4), (3,9), (4, 16), (5, 25) og (6,36)
    }
}
