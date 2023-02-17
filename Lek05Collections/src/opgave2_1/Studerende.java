package opgave2_1;

import opgave2.Skole;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Studerende {
    private int studieNr;
    private String navn;

    private Set<Integer> karaktere = new HashSet<>();

    private opgave2.Skole skole;


    public Studerende(int studieNr, String navn) {
        this.studieNr = studieNr;
        this.navn = navn;
    }

    public int getStudieNr() {
        return studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public Set<Integer> getKaraktere() {
        return karaktere;
    }

    public Skole getSkole() {
        return skole;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void addKarakter(Integer karakter){
        if (!karaktere.contains(karakter)){
            karaktere.add(karakter);
        }
    }


    @Override
    public String toString() {
        return "Studerende{" +
                "studieNr=" + studieNr +
                ", navn='" + navn + '\'' +
                ", skole=" + skole +
                '}';
    }
}
