package pracownicy;

import java.util.ArrayList;
import java.util.List;

public class Klient extends Czlowiek {
    private String ulubionyProdukt;

    private List<Produkt> produkty = new ArrayList<>();

    public Klient(String imie, String nazwisko, String ulubionyProdukt) {
        super(imie, nazwisko);
        this.ulubionyProdukt = ulubionyProdukt;
    }

    public void dodajProdukt(Produkt produkt) {
        if (produkt.getKlient() != null) {
            throw new IllegalArgumentException("produkt juz zostal kupiony");
        }
        produkty.add(produkt);
        produkt.setKlient(this);
    }

    public double ileWydalKlient() {
        double suma = 0;
        for (Produkt produkt : produkty) {
            suma = produkt.getCena();
        }
        return suma;
    }

    public static Klient klientKtoryWydalNajwiecej(List<Klient> klienci) {
        if (klienci == null || klienci.isEmpty()) {
            throw new IllegalArgumentException("lista klientow jest nullem lub jest pusta");
        }
        Klient klient = klienci.get(0);
        for (Klient k : klienci) {
            if (k.ileWydalKlient() > klient.ileWydalKlient()) {
                klient = k;
            }
        }
        return klient;
    }

    public String getUlubionyProdukt() {
        return ulubionyProdukt;
    }

    public void setUlubionyProdukt(String ulubionyProdukt) {
        this.ulubionyProdukt = ulubionyProdukt;
    }

    @Override
    public String toString() {
        return "Imie klienta: " + getImie() +" "+
                "Nazwisko klienta: "+" "+ getNazwisko() +" "+ getUlubionyProdukt();
    }
}
