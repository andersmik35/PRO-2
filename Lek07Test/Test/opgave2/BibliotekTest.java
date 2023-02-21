package opgave2;

import forsikring.BilForsikring;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BibliotekTest {


    private Bibliotek bibliotek = new Bibliotek();

    private LocalDate forventet;
    @BeforeEach
    void setUp(){
        forventet = LocalDate.of(2023,4,3);
    }

    @Test
    void getGebyr() {
    }

    @Test
    void setGebyr() {
    }

    @Test
    void beregnGebyr() {
        double praemie = bibliotek.beregnGebyr(forventet, forventet.plusDays(5),false);
        assertEquals(10,praemie);
    }

    @Test
    void beregnGebyr1() {
        double praemie = bibliotek.beregnGebyr(forventet, forventet.plusDays(5),true);
        assertEquals(20,praemie);
    }
    @Test
    void beregnGebyr2() {
        double praemie = bibliotek.beregnGebyr(forventet, forventet.plusDays(10),false);
        assertEquals(30,praemie);
    }

    @Test
    void beregnGebyr3() {
        double praemie = bibliotek.beregnGebyr(forventet, forventet.plusDays(10),true);
        assertEquals(60,praemie);
    }
    @Test
    void beregnGebyr4() {
        double praemie = bibliotek.beregnGebyr(forventet, forventet.plusDays(16),false);
        assertEquals(45,praemie);
    }

    @Test
    void beregnGebyr5() {
        double praemie = bibliotek.beregnGebyr(forventet, forventet.plusDays(16),true);
        assertEquals(90,praemie);
    }


}