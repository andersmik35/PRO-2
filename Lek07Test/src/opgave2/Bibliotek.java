package opgave2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Bibliotek {

    public double beregnGebyr(LocalDate beregnetDato, LocalDate faktiskDato, boolean voksen) {


        if (!beregnetDato.isBefore(faktiskDato)) {
            throw new RuntimeException("Beregnet dato skal være før faktisk dato");
        }
        int dageimellem = (int) beregnetDato.until(faktiskDato, ChronoUnit.DAYS);
        int bøde;

        if (dageimellem >= 1 && dageimellem <= 7) {
            bøde = 10;
        } else if (dageimellem >= 8 && dageimellem <= 14) {
            bøde = 30;
        } else {
            bøde = 45;
        }
        if (voksen) {
            bøde *= 2;
        }
        return bøde;
    }
}
