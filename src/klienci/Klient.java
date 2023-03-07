package klienci;

import java.util.ArrayList;
import java.util.List;

public class Klient {
    private String imie;
    private String nazwisko;
    private double rozmiarPenisa;

    private List<Produkt> produkty = new ArrayList<>();

    public Klient(String imie, String nazwisko, double rozmiarPenisa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rozmiarPenisa = rozmiarPenisa;
    }

    public void dodajProdukt(Produkt produkt) {
        if (produkt.getKlient() != null) {
            throw new IllegalArgumentException("produkt juz zostal kupiony");
        }
        produkty.add(produkt);
        produkt.setKlient(this);
    }

    // 1) Napisz mrtode ktota znajduje klienta ktory wydal najwiecej.
    public double ileWydalKlient() {
        double suma = 0;
        for (Produkt produkt : produkty) {
            suma += produkt.getCena();
        }
        return suma;
    }

    public static Klient klientKtoryWydalNajwiecej(List<Klient> klienci) {
        if (klienci == null || klienci.isEmpty()) {
            throw new IllegalArgumentException("lista klientow jest pusta");
        }
        Klient klient = klienci.get(0);

        for (Klient k : klienci) {
            if (k.ileWydalKlient() > klient.ileWydalKlient()) {
                klient = k;
            }
        }
        return klient;
    }

    //2) napisz metode ktora zwroci liste klientow ktorzy kupili kondoma
    public boolean czyKupilKondoma() {
        for (Produkt produkt : produkty) {
            if (produkt instanceof Kondom) {
               return true;
            }
        }
        return false;
    }
    public static List<Klient> klienciKtorzyKupilKondoma(List<Klient> klienci){
        if(klienci == null){
            throw new IllegalArgumentException("lista nie jest nullem");
        }
        List<Klient> result = new ArrayList<>();
        for (Klient klient : klienci) {
            if(klient.czyKupilKondoma()){
                result.add(klient);
            }
        }
        return result;
    }

   // 3) napisz metode ktora zwroci liste klientow ktorzy kupili kondoma ale nie na swoj rozmiar :D
    public boolean czyKupilZlyRozmiar(){
        for (Produkt produkt : produkty) {
            if(produkt instanceof Kondom && ((Kondom) produkt).getWymiar() != rozmiarPenisa){
                return true;
            }
        }
        return false;
    }
    public static List<Klient> klienciKtorzyKupilKondomaOZlymRozmiarze(List<Klient>klienci){
        if(klienci==null){
            throw new IllegalArgumentException("Lista jest nullem");
        }
        List<Klient> result = new ArrayList<>();
        for (Klient klient : klienci) {
            if(klient.czyKupilZlyRozmiar()){
                result.add(klient);
            }
        }
        return result;
    }


    public List<Produkt> getProdukty() {
        return produkty;
    }

    public void setProdukty(List<Produkt> produkty) {
        this.produkty = produkty;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getRozmiarPenisa() {
        return rozmiarPenisa;
    }

    public void setRozmiarPenisa(double rozmiarPenisa) {
        this.rozmiarPenisa = rozmiarPenisa;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", rozmiarPenisa=" + rozmiarPenisa +
                '}';
    }
}
