package opgave3;

public class Foedevarer extends Vare {

    private double moms = 5;

    public Foedevarer(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        double sum;
        sum = getPris() * (moms / 100);
        return sum;
    }


}
