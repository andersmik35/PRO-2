package stack;

public class StackDemo {
    public static void main(String[] args) {
        //  StackI s = new NodeStack();
        StackI s = new ArrayStack(5);
        s.push("Tom");
        s.push("Diana");
        s.push("Harry");
        s.push("Thomas");
        s.push("Bob");
        s.push("Brian");
        System.out.println(s.peek());
        System.out.println(s.isEmpty() + " " + s.size());
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
        System.out.println();
        System.out.println(s.isEmpty() + " " + s.size());
        System.out.println();

        // -------- test af reverse --------

//        Integer[] tal = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        reverse(tal);
//        for (int i = 0; i < tal.length; i++) {
//            System.out.print(tal[i] + " ");
//        }

        StackI a = new ArrayListStack();
        a.push("Tom");
        a.push("Diana");
        a.push("Harry");
        a.push("Thomas");
        a.push("Bob");
        System.out.println(a.peek());
        System.out.println(a.isEmpty() + " " + a.size());
        while (!a.isEmpty()) {
            System.out.println(a.pop());
        }
        System.out.println();
        System.out.println(a.isEmpty() + " " + a.size());


        System.out.println(checkParantes("(3+{5{99{*}}[23[{67}67]]})"));
        System.out.println(checkParantes("(}){"));
    }


    public static void reverse(Object[] tabel) {
        StackI stack = new ArrayStack(tabel.length);
        // StackI stack = new NodeStack();
        for (int i = 0; i < tabel.length; i++) {
            stack.push(tabel[i]);
        }
        int i = 0;
        while (!stack.isEmpty()) {
            tabel[i] = stack.pop();
            i++;
        }

    }

    public static boolean checkParantes(String s) {
        StackI stackI = new NodeStack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                stackI.push(s.charAt(i));
            } else if (s.charAt(i) == ']') {
                if (stackI.isEmpty()) {
                    return false;
                }
                stackI.pop();
            }
            if (s.charAt(i) == '(') {
                stackI.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (stackI.isEmpty()) {
                    return false;
                }
                stackI.pop();
            }
            if (s.charAt(i) == '{') {
                stackI.push(s.charAt(i));
            } else if (s.charAt(i) == '}') {
                if (stackI.isEmpty()) {
                    return false;
                }
                stackI.pop();
            }

        }
        return true;
    }


}
