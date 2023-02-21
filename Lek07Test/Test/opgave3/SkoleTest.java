package opgave3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkoleTest {



    private Skole skole;

    private Studerende studerende;
    @BeforeEach
    void setUp(){
        skole = new Skole("Datamagiker");
        studerende = new Studerende(123,"Gostav");
        studerende.addKarakter(2);
        studerende.addKarakter(4);
        studerende.addKarakter(7);
        studerende.addKarakter(10);
        studerende.addKarakter(12);



        skole.addStuderende(studerende);
    }

    @Test
    void gennemsnit() {
        double karakter = skole.gennemsnit();
        assertEquals(7,karakter);

    }

    @Test
    void found() {
        Studerende s1 = skole.found(123);
         assertEquals(studerende,s1);
    }
}