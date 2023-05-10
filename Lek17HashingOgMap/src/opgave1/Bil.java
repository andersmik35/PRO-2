package opgave1;

import java.util.Objects;

public class Bil {
    private String regNr;
    private String maerke;
    private String model;
    private String farve;

    public Bil(String regNr, String maerke, String model, String farve) {
        this.regNr = regNr;
        this.maerke = maerke;
        this.model = model;
        this.farve = farve;
    }

    public String getRegNr() {
        return regNr;
    }

    public String getMaerke() {
        return maerke;
    }

    public String getModel() {
        return model;
    }

    public String getFarve() {
        return farve;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "regNr='" + regNr + '\'' +
                ", maerke='" + maerke + '\'' +
                ", model='" + model + '\'' +
                ", farve='" + farve + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bil bil = (Bil) o;
        return Objects.equals(regNr, bil.regNr) && Objects.equals(maerke, bil.maerke);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNr, maerke);
    }
}
