package opgave5;

import java.util.ArrayList;
import java.util.Observer;

public class BogTitel implements Subject {
    private String titel;

    private int antal;

    private ArrayList <Kunde> kunder;

    private ArrayList <opgave5.Observer> obs;


    public BogTitel(String titel, int antal) {
        this.titel = titel;
        this.antal = antal;
        obs = new ArrayList<>();
        kunder = new ArrayList<>();
    }

    public String getTitel() {
        return titel;
    }

    public int getAntal() {
        return antal;
    }

    private void notifyObservers(){
        for (opgave5.Observer o : obs){
            o.update(this);
        }
    }

    public ArrayList<Kunde> getKunder() {
        return kunder;
    }

    @Override
    public void addObserver(Observer o) {
        obs.add((opgave5.Observer) o);

    }

    @Override
    public void removeObserver(Observer o) {
        obs.remove((opgave5.Observer) o);
    }

    public void addKunde(Kunde k){
        if (!kunder.contains(k)){
            kunder.add(k);
            k.addBogtitler(this);
        }
    }

    public void etKoeb(Kunde k){
        antal--;
        addKunde(k);
        notifyObservers();

    }

    public ArrayList<opgave5.Observer> getObs() {
        return obs;
    }
}



