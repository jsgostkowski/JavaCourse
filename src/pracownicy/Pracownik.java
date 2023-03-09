package pracownicy;

public class Pracownik extends Czlowiek{
    private double pensja;

    public Pracownik(String imie, String nazwisko, double pensja) {
        super(imie, nazwisko);
        this.pensja = pensja;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "pensja=" + pensja +
                '}';
    }
}
