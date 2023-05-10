package opgave1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Bil> bilHashSet = new HashSet<>();
        Bil bil1 = new Bil("AB12345", "Ford", "Focus", "Rød");
        Bil bil2 = new Bil("AB12345", "Ford", "Focus", "Rød");
        Bil bil3 = new Bil("CE48431", "Chevy", "Chevelle", "Blå");

        bilHashSet.add(bil1);
        bilHashSet.add(bil2);
        bilHashSet.add(bil3);

        System.out.println(bilHashSet);
        System.out.println(bilHashSet.size());

        System.out.println(bil1.equals(bil2));
        System.out.println(bil1.equals(bil3));



    }
}
