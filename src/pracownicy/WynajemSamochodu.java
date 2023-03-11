package pracownicy;

public class WynajemSamochodu {
    private int ileRazy;
    private final Pracownik pracownik;
    private final Samochod samochod;

    public WynajemSamochodu(Pracownik pracownik, Samochod samochod) {
        if(pracownik== null || samochod == null){
            throw new IllegalArgumentException("pracownik lub samochod jest nullem - nara");
        }
        this.ileRazy = 1;
        this.pracownik = pracownik;
        this.samochod = samochod;

        //info zwrotne
        pracownik.getWynajem().add(this);
        samochod.getWynajem().add(this);
    }

    public int getIleRazy() {
        return ileRazy;
    }
    public void dodajWynajem(){
        ileRazy++;
    }

    public Pracownik getPracownik() {
        return pracownik;
    }

    public Samochod getSamochod() {
        return samochod;
    }

    @Override
    public String toString() {
        return "WynajemSamochodu{" +
                "ileRazy=" + ileRazy +
                ", pracownik=" + pracownik +
                ", samochod=" + samochod +
                '}';
    }
}
