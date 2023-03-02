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

    // asocjacja licznosci *
    private List<Uczen> uczniowie = new ArrayList<>();

    // kompozyucja do sal
    private List<Sala> sale = new ArrayList<>();

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

    // tworzenie powiazania dla relacji 1-* szkola uczen
    public void dodajUcznia(Uczen u){
        // sprawdzimy czy uczen nei ma juz przypisanej szkoly
        if(u.getSzkola() != null) throw new IllegalArgumentException("uczen ma juz szkole");

        // dodajemy ucznia na liste uczniow szkoly
        uczniowie.add(u);
        // WAZNE informacja zwrotna, musimy poinformowac ucznia ze przypisujemy mu szkole
        u.setSzkola(this);
    }

    public void usunUcznia(Uczen u){
        uczniowie.remove(u);
        u.setSzkola(null);
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

    public int getRokPowstania() {
        return rokPowstania;
    }

    public List<Sala> getSale() {
        return sale;
    }

    public String getWyroznienie() {
        return wyroznienie;
    }

    public static List<Szkola> getEkstensja() {
        return ekstensja;
    }

    public static int getMinLiczbaUczniow() {
        return MIN_LICZBA_UCZNIOW;
    }

    public List<Uczen> getUczniowie() {
        return uczniowie;
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
