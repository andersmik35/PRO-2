package ex3student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> tal = new LinkedList<>();
        tal.add(2);
        tal.add(5);
        tal.add(6);
        tal.add(2);
        tal.add(8);
        tal.add(34);
        tal.add(9);
        tal.add(2);

        Iterator<Integer> iterator = tal.iterator();


        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }


}
