package opgave4_1;

import java.util.Comparator;

public class Kunde implements Comparable<Kunde> {

    private String navn;

    private int nummer;

    private Comparator<Kunde> comparator;


    public Kunde(String navn, int nummer) {
        this.navn = navn;
        this.nummer = nummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "navn='" + navn + '\'' +
                ", nummer=" + nummer +
                '}';
    }

    @Override
    public int compareTo(Kunde otherKunde) {
        return comparator.compare(this,otherKunde);
    }
}





