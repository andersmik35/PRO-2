package Opgave;

import javax.swing.text.DefaultStyledDocument;
import java.util.ArrayList;

public class Opgave {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(10);
        list.add(17);
        list.add(4);
        list.add(8);
        list.add(45);
        list.add(29);


        System.out.println(palindrom("ABBBA"));


        System.out.println(findesTallet(list, 29));


    }

    public static int ligetal(ArrayList<Integer> list, int index) {
        return ligetal(list, 0);
    }


    private static int ligeTal(ArrayList<Integer> list, int index) {
        if (index == list.size()) {
            return 0;
        } else if (index % 2 == 1) {
            return ligeTal(list, index + 1);

        } else {

            return 1 + ligeTal(list, index + 1);

        }

    }


    public static boolean palindrom(String tekst) {
        return palindrom(tekst, 0, tekst.length() - 1);
    }


    private static boolean palindrom(String tekst, int left, int right) {
        if (left > right) {
            return true;
        }

        if (tekst.charAt(left) == tekst.charAt(right)) {
            return palindrom(tekst, left + 1, right - 1);

        } else {
            return false;
        }
    }

    public static boolean findesTallet(ArrayList<Integer> list, int target) {
        return findesTallet(target, list, list.size() - 1, 0);

    }


    private static boolean findesTallet(int target, ArrayList<Integer> list, int right, int left) {


        if (left > right) {
            return false;
        }
        if (target == list.get(left) || target == list.get(right)) {
            return true;

        } else {
            return findesTallet(target, list, right - 1, left + 1);
        }
    }


    private static boolean talFindes(int target, int[] listArray, int right, int left, int middle) {
        middle = -1;
        left = 0;
        right = listArray.length;
        if (left > right) {
            return false;
        }
        middle = (left + right) / 2;


        return false; // TODO;
    }


    public static int ackermann(int x, int y) {
        if (x == 0) {
            return y + 1;
        } else if (y == 0) {
            return ackermann(x - 1, 1);
        } else {
            return ackermann(x - 1, ackermann(x, y - 1));
        }
    }





    //Opgave 7


    public static int talrække(int n) {
        if (n == 0) return 2;
        if (n == 1) return 1;
        if (n == 2) return 5;

        if (n > 2) {
            if (n % 2 == 0) {
                return 2 * talrække(n - 3) - talrække(n - 1);
            } else {
                return talrække(n - 1) + talrække(n - 2) + 3 * talrække(n - 3);
            }
        }

        return 0;


    }

}







  /*  public static int ligetal(ArrayList<Integer> list) {
        int result;
        ArrayList<Integer> a1 = list;
        if (a1.isEmpty()) {
            return 0;
        }
        else if (a1.get(0) % 2 == 0){
            a1.remove(0);





        }
        return 0;*/












