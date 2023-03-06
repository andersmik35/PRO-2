package opgave5;

import java.util.ArrayList;

public class Sælger implements Observer {
    private String navn;

    public Sælger(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public void update(Subject s) {
    }
}
