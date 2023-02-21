package opgave4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Opgave4 {
    public static void main(String[] args) {
        //Make a method which returns how much the String "Jens" appears
        ArrayList<String> names = new ArrayList<>();
        names.add("Jensine Larsen");
        names.add("Hans Jensen");
        names.add("Jan Jensen");
        names.add("Leo Hansen");
        names.add("Jens Jensen");

       // System.out.println(countDelStreng(names, "Jens"));


        System.out.println(countStreng(names,"Jens"));


    }


    /*public static int countDelStreng(List<String> list, String sub) {
        int count = 0;
        for (String str : list) {
            if (str.contains(sub)) {
                count++;
            }
        }
        return count;
    }*/

    public static int countStreng(List<String> list, String sub) {
        int count = 0;
        int split = Integer.MAX_VALUE;

        String p;
        String p1;
        String p2;
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            p = itr.next();
            split = p.indexOf(" ");
            if (split != -1) {
                p1 = p.substring(0, split);
                p2 = p.substring(split + 1, p.length());
                if (p1.contains(sub)) {
                    count++;
                }
                if (p2.contains(sub)) {
                    count++;
                }
            } else if (p.contains(sub)) {
                count++;

            }
        }
        return count;
    }
}

