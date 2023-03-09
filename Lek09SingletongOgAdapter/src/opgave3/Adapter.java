package opgave3;

public class Adapter extends Vare {

    private Spiritus spiritus;

    public Adapter(int pris, String navn, Spiritus spiritus) {
        super(pris, navn);
        this.spiritus = spiritus;
    }

    @Override
    public double beregnMoms() {


        return spiritus.hentMoms();
    }
}
