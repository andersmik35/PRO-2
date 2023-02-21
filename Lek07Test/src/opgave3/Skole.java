package opgave3;


import java.util.*;

public class Skole {
    private String navn;

    public List<Studerende> studerende = new ArrayList<>();

    public String getNavn() {
        return navn;
    }

    public Skole(String navn) {
        this.navn = navn;
    }

    public List<Studerende> getS() {
        return studerende;
    }

    public void addStuderende(Studerende studerender) {
        if (!studerende.contains(studerender)) {
            studerende.add(studerender);
        }
    }

    public void removeStuderende(Studerende studerender) {
        if (studerende.contains(studerender)) {
            studerende.remove(studerender);
        }
    }


    public double gennemsnit() {
        int counter = 0;
        double sum = 0;
        for (Studerende studerende1 : studerende) {
            for (Integer list : studerende1.getKaraktere()) {
                counter++;
                sum += list;

            }
        }
        return sum / counter;
    }

    public Studerende found(int studieNr) {
        Studerende found = null;
        int i = 0;
        Iterator<Studerende> studerendeIterator = studerende.iterator();
        while (found == null && studerendeIterator.hasNext()) {
            Studerende studerende1 = studerendeIterator.next();
            if (studerende1.getStudieNr() == studieNr){
                found = studerende1;
            }

        }
        return found;
    }


    @Override
    public String toString() {
        return "Skole{" +
                "navn='" + navn + '\'' +
                ", s=" + studerende +
                '}';
    }
}

