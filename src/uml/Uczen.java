package uml;

public class Uczen extends Osoba{

    private String numerIndeksu;

    public Uczen(String imie, String nazwisko, String adres, String numerIndeksu) {
        super(imie, nazwisko, adres);
        this.numerIndeksu = numerIndeksu;
    }


    @Override
    public double obliczDochod() {
        return 350;
    }

    public String getNumerIndeksu() {
        return numerIndeksu;
    }
}
