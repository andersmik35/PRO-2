package opgave1;

import java.util.HashSet;
import java.util.Set;

public class Opgave1 {
    public static void main(String[] args) {

        Set<Integer> tal = new HashSet<>();
        tal.add(34);
        tal.add(12);
        tal.add(23);
        tal.add(45);
        tal.add(67);
        tal.add(34);
        tal.add(98);
        //34,12,23,45,67,34,98

        System.out.println(tal);

        tal.add(23);
        System.out.println(tal);

        tal.remove(67);
        System.out.println(tal);

        System.out.println(found(tal, 23));

        System.out.println(tal.size());

        for (Integer t1 : tal){
            System.out.println(t1);
        }


    }


    public static boolean found(Set<Integer> tal, int found) {
       boolean isHere = false;
       for (Integer tekst : tal){
           if (tal.contains(found)){
               isHere = true;
           }
       }


        return isHere;
    }




}
