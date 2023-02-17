package opgave1;

import java.util.ArrayList;

public class Opgave1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(4);
        list.add(11);
        list.add(17);
        list.add(21);
        list.add(25);

        System.out.println(list);

        System.out.println(sum(list));

        System.out.println(antal0(list));

    }

    public static int sum(ArrayList<Integer> list) {
        return sum(list, 0, list.size() - 1);
    }


    private static int sum(ArrayList<Integer> list, int l, int h) {
        int row1;
        int row2;
        if (l == h) {
            return list.get(l);
        } else {
            int m = (l + h) / 2;
            row1 = sum(list, l, m);
            row2 = sum(list, m + 1, h);
        }
        return row1 + row2;
    }


    public static int antal0(ArrayList<Integer> list) {
        return antal0(list, 0, list.size() - 1);
    }


    private static int antal0(ArrayList<Integer> list, int l, int h) {
        int i = 0;

        if (l == h) {
            if (list.get(l) == 0) {
                i++;
            }
            return i;

        } else {
            int m = (l + h) / 2;
            int count1 = antal0(list, l, m);
            int count2 = antal0(list, m + 1, h);
            i = count1 + count2; {
            }
            return i;
        }
    }
}
