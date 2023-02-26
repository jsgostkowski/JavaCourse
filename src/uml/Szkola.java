package uml;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Szkola {
    private String nazwa;
    private final int rokPowstania;

    //atrybut powtarzalny
    private List<String> profile = new ArrayList<>();

    private String wyroznienie;
    private int numer;
    private static List<Szkola> ekstensja = new ArrayList<>();

    private static int MIN_LICZBA_UCZNIOW = 100;

    public Szkola(String nazwa, int rokPowstania, int numer) {
        this.nazwa = nazwa;
        this.rokPowstania = rokPowstania;
        setNumer(numer);
        ekstensja.add(this);

    }

    public Szkola(String nazwa, int rokPowstania, int numer, String wyroznienie) {
        this.nazwa = nazwa;
        this.rokPowstania = rokPowstania;
        this.wyroznienie = wyroznienie;
        setNumer(numer);
        ekstensja.add(this);
    }

    public int obliczWiekSzkoly() {
        return LocalDate.now().getYear() - rokPowstania;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        for (Szkola szkola : ekstensja) {
            if (szkola.getNumer() == numer) {
                throw new IllegalArgumentException("Szkola o danym numerze juz istnieje");
            }
        }
        this.numer = numer;
    }

    public List<String> getProfile() {
        return profile;
    }

    public void dodajProfil(String profil) {
        profile.add(profil);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getDataPowstania() {
        return rokPowstania;
    }

    @Override
    public String toString() {
        return nazwa;
    }

}
