package pracownicy;

import java.util.*;

public class Pracownik extends Czlowiek implements Comparable<Pracownik>{
    private double pensja;

    private List<WynajemSamochodu> wynajem = new ArrayList<>();

    public Pracownik(String imie, String nazwisko, double pensja) {
        super(imie, nazwisko);
        this.pensja = pensja;
    }

    public static List<Pracownik> topTrzechNajlepiejZarabiajacychPracownikow(List<Pracownik> pracownik){
        if(pracownik == null){
            throw new IllegalArgumentException("lista pracownikow jest nullem");
        }
        Comparator<Pracownik> sortowaniePoPensji = Comparator.comparingDouble(Pracownik::getPensja); // :: w metodzie compraingDouble oznacza   referencja do metody getPensja w klasie Pracownik
        Collections.sort(pracownik, sortowaniePoPensji.reversed());

        return pracownik.subList(0, Math.min(3,pracownik.size()));
    }

    public void wpozyczSamochod(Samochod samochod){
        for (WynajemSamochodu wynajemSamochodu : wynajem) {
            if(wynajemSamochodu.getSamochod().equals(samochod)){
                wynajemSamochodu.dodajWynajem();
                return;
            }
        }
        wynajem.add(new WynajemSamochodu(this,samochod));
    }

    public List<WynajemSamochodu> getWynajem() {
        return wynajem;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }
    @Override
    public int compareTo(Pracownik pracownik) {
        if(this.pensja < pracownik.pensja){
            return -1;
        }else if(pracownik.pensja < this.pensja){
            return 1;
        }
        return 0;
    }
    @Override
    public String toString() {
        return "Pracownik{" +
                "pensja=" + pensja +
                '}';
    }


}
