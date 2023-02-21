package opgave2;

import java.time.LocalDate;
import java.util.Locale;

public class Bibliotek {
    private double gebyr;


    public double getGebyr() {
        return gebyr;
    }

    public void setGebyr(double grundGebyr) {
        if (grundGebyr > 0) {
            throw new RuntimeException("Gebyr skal starte på 0");
        }
        gebyr = grundGebyr;
    }


    public double beregnGebyr(LocalDate faktiskDato, LocalDate beregnetDato, boolean voksen) {
        double praemie = gebyr;
        if (gebyr > 0) {
            throw new RuntimeException("Grundpraeme skal starte på 0");
        }
        if (faktiskDato.isBefore(beregnetDato) || faktiskDato.isEqual(beregnetDato)) {
            praemie = 0;
        }

        if (voksen == true) {
            praemie = praemie * 2;
        }
        if (faktiskDato.isAfter(beregnetDato.plusDays(7))) {
            praemie = 10;
        }
        if (faktiskDato.isAfter(beregnetDato.plusDays(14))) {
            praemie = 30;
        }
        else {
            praemie = 45;
        }


        return praemie;
    }
}
