package opgave3;

public class Navn extends Person<String>{
    private String fornavn;
    private String efternavn;

    public Navn(String fornavn, String efternavn) {
        super(fornavn + " " + efternavn);
        this.fornavn = fornavn;
        this.efternavn = efternavn;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }
}
