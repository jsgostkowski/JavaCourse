package uml;

import java.util.ArrayList;
import java.util.List;

public class Uczen extends Osoba{

    private String numerIndeksu;

    // ascocjacja licznosci 1
    private Szkola szkola;

    // asocjacja z atrybutem
    private List<Ocena> oceny = new ArrayList<>();

    public Uczen(String imie, String nazwisko, String adres, String numerIndeksu) {
        super(imie, nazwisko, adres);
        this.numerIndeksu = numerIndeksu;
    }

    public Szkola getSzkola() {
        return szkola;
    }

    public List<Ocena> getOceny() {
        return oceny;
    }

    public void setSzkola(Szkola szkola) {
        this.szkola = szkola;
    }

    @Override
    public double obliczDochod() {
        return 350;
    }

    public String getNumerIndeksu() {
        return numerIndeksu;
    }
}
