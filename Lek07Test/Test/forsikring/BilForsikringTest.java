package forsikring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilForsikringTest {

    private BilForsikring bilForsikring = new BilForsikring();

    @BeforeEach
    void setUp(){
        bilForsikring.setGrundpaemie(1000);
    }

    @Test
    void getGrundpraemie() {
    }

    @Test
    void beregnPraemie1() {
        double praemie1 = bilForsikring.beregnPraemie(24,true,0);
        assertEquals(1187.5,praemie1);
    }
    @Test
    void beregnPraemie2() {
        double praemie2 = bilForsikring.beregnPraemie(25,true,0);
        assertEquals(950,praemie2);
    }
    @Test
    void beregnPraemie3() {
        double praemie3 = bilForsikring.beregnPraemie(24,true,3);
        assertEquals(1009.375,praemie3);
    }
    @Test
    void beregnPraemie4() {
        double praemie = bilForsikring.beregnPraemie(25,true,3);
        assertEquals(807.5,praemie);
    }
    @Test
    void beregnPraemie5() {
        double praemie = bilForsikring.beregnPraemie(24,true,6);
        assertEquals(890.625,praemie);
    }

    @Test
    void beregnPraemie6() {
        double praemie = bilForsikring.beregnPraemie(25,true,6);
        assertEquals(712.5,praemie);
    }
    @Test
    void beregnPraemie7() {
        double praemie = bilForsikring.beregnPraemie(27,true,9);
        assertEquals(617.5,praemie);
    }

    @Test
    void beregnPraemie8() {
        double praemie = bilForsikring.beregnPraemie(24,false,0);
        assertEquals(1250,praemie);
    }

    @Test
    void beregnPraemie9() {
        double praemie = bilForsikring.beregnPraemie(25,false,0);
        assertEquals(1000,praemie);
    }

    @Test
    void beregnPraemie10() {
        double praemie = bilForsikring.beregnPraemie(24,false,3);
        assertEquals(1062.5,praemie);
    }

    @Test
    void beregnPraemie11() {
        double praemie = bilForsikring.beregnPraemie(25,false,3);
        assertEquals(850,praemie);
    }

    @Test
    void beregnPraemie12() {
        double praemie = bilForsikring.beregnPraemie(24,false,6);
        assertEquals(937.5,praemie);
    }

    @Test
    void beregnPraemie13() {
        double praemie = bilForsikring.beregnPraemie(25,false,6);
        assertEquals(750,praemie);
    }


    @Test
    void beregnPraemie14() {
        double praemie = bilForsikring.beregnPraemie(27,false,9);
        assertEquals(650,praemie);
    }


    @Test
    void beregnPraemie15() {
        Exception exception = assertThrows(RuntimeException.class, () ->{
            bilForsikring.beregnPraemie(18,true,3);
        });
        assertEquals(exception.getMessage(), "Du kan ikke have kaert skadefri saelaenge");
    }


    @Test
    void beregnPraemie16(){
        Exception exception = assertThrows(RuntimeException.class,() ->{
            bilForsikring.beregnPraemie(15,true,0);
        });
        assertEquals(exception.getMessage(),"Du er for ung til at tegne en forsikring");
    }


    @Test
    void beregnPraemie17(){
        Exception exception = assertThrows(RuntimeException.class,() ->{
            bilForsikring.beregnPraemie(25,true,-2);
        });
        assertEquals(exception.getMessage(),"Antal skade frie aer skal vaere positiv");
    }








    @Test
    void setGrundpaemie() {
    }

}