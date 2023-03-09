package opgave3;

public class ElVare extends Vare {
    private double moms = 30;

    public ElVare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        double sum;
        sum = getPris() * (moms / 100);
        return sum;
    }


}
