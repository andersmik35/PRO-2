package opgave5;

import java.util.ArrayList;


public class Kunde {

    private ArrayList<BogTitel> bogtitler;

    private String navn;


    public Kunde(String navn) {
        this.navn = navn;
        bogtitler = new ArrayList<>();
    }

    public String getNavn() {
        return navn;
    }

    public void addBogtitler(BogTitel bt){
        if (!bogtitler.contains(bt)){
            bogtitler.add(bt);
            bt.addKunde(this);
        }
    }


}
