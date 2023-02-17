package opgave2_1;

import opgave2.Studerende;

import java.util.HashSet;
import java.util.Set;

public class Skole {
    private String navn;

    public Set<opgave2_1.Studerende> studerende = new HashSet<>();

    public String getNavn() {
        return navn;
    }

    public Skole(String navn) {
        this.navn = navn;
    }

    public Set<opgave2_1.Studerende> getS() {
        return studerende;
    }

    public void addStuderende(opgave2_1.Studerende studerender) {
        if (!studerende.contains(studerender)) {
            studerende.add(studerender);
        }
    }

    public void removeStuderende(opgave2_1.Studerende studerender) {
        if (studerende.contains(studerender)) {
            studerende.remove(studerender);
        }
    }


    public double gennemsnit() {
        int counter = 0;
        double sum = 0;
        for (opgave2_1.Studerende studerende1 : studerende) {
            for (Integer list : studerende1.getKaraktere()) {
                counter++;
                sum += list;

            }
        }
        return sum / counter;
    }

    /*public Studerende found(int studieNr) {
        int result = -1;
        Studerende studerende1 = null;
        int i = 0;
        while (result == -1 && i < studerende.size()) {
            if (studerende.get(i).getStudieNr() == studieNr) {
                result = i;
                studerende1 = studerende.(i);
            } else {
                i++;
            }
        }
        return studerende1;
    }*/


    @Override
    public String toString() {
        return "Skole{" +
                "navn='" + navn + '\'' +
                ", s=" + studerende +
                '}';
    }
}

