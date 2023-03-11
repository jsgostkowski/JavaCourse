package pracownicy;

import java.util.ArrayList;
import java.util.List;

public class Klient extends Czlowiek {
    private String ulubionyProdukt;

    private List<Produkt> produkty = new ArrayList<>();

    private List<ListaZakupow> listaZakupow = new ArrayList<>();



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

    public int ileRazyKlientKupilProdukt(Produkt produkt) {
        int licznik = 0;
        for (Produkt p : produkty) {
            if (p.getNazwa().equals(produkt.getNazwa())) {
                licznik++;
            }
        }
        return licznik;
    }

    public String ulubionyProdukt() {
        if (produkty.isEmpty()) {
            return "";
        }
        String ulubionyProdukt = produkty.get(0).getNazwa();
        int maxLiczba = 0;
        for (Produkt produkt : produkty) {
            int liczba = 0;
            for (Produkt produkt1 : produkty) {
                if(produkt1.getNazwa().equals(produkt.getNazwa())){
                    liczba++;
                }
            }
            if(liczba>maxLiczba){
                maxLiczba=liczba;
                ulubionyProdukt=produkt.getNazwa();
            }
        }
        return ulubionyProdukt;
    }

    public List<ListaZakupow> getListaZakupow() {
        return listaZakupow;
    }


    public String getUlubionyProdukt() {
        return ulubionyProdukt;
    }

    public List<Produkt> getProdukty() {
        return produkty;
    }

    public void setUlubionyProdukt(String ulubionyProdukt) {
        this.ulubionyProdukt = ulubionyProdukt;
    }

    @Override
    public String toString() {
        return "Imie klienta: " + getImie() + " " +
                "Nazwisko klienta: " + " " + getNazwisko() + " " + getUlubionyProdukt();
    }
}
