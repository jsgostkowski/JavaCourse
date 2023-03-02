package uml;

import java.util.ArrayList;
import java.util.List;

public class Nauczyciel extends Osoba{
    private String przedmiot;
    private List<Szkolenie> szkolenia = new ArrayList<>();

    public Nauczyciel(String imie, String nazwisko, String adres, String przedmiot) {
        super(imie, nazwisko, adres);
        this.przedmiot = przedmiot;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public List<Szkolenie> getSzkolenia() {
        return szkolenia;
    }

    @Override
    public double obliczDochod() {
        return 500;
    }
}
