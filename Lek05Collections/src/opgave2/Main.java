package opgave2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Skole skole = new Skole("Ervhers");



        Studerende s1 = new Studerende(1,"Gostav");
        Studerende s2 = new Studerende(2,"Lars");
        Studerende s3 = new Studerende(3,"Emil");
        Studerende s4 = new Studerende(4,"Lasse");

        System.out.println(skole);

        skole.addStuderende(s1);
        skole.addStuderende(s2);
        skole.addStuderende(s3);
        skole.addStuderende(s4);

        s1.addKarakter(12);
        s1.addKarakter(10);
        s2.addKarakter(10);
        s3.addKarakter(7);
        s4.addKarakter(4);

        System.out.println(skole.gennemsnit());

        System.out.println(skole.found(1));








    }
}
