package opgave5;

import java.util.ArrayList;

public class BogTitel {
    private String titel;

    private int antal;


    private ArrayList <Kunde> kunder = new ArrayList<>();

    public BogTitel(String titel, int antal) {
        this.titel = titel;
        this.antal = antal;
    }

    public String getTitel() {
        return titel;
    }

    public int getAntal() {
        return antal;
    }

    private void notifyObservers(){
        //TODO
    }

    public ArrayList<Kunde> getKunder() {
        return kunder;
    }
}
