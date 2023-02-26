package uml;

public class Nauczyciel extends Osoba{
    private String przedmiot;

    public Nauczyciel(String imie, String nazwisko, String adres, String przedmiot) {
        super(imie, nazwisko, adres);
        this.przedmiot = przedmiot;
    }

    @Override
    public double obliczDochod() {
        return 500;
    }
}
