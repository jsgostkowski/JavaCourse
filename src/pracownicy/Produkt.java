package pracownicy;

import java.util.ArrayList;
import java.util.List;

public class Produkt {
    private String nazwa;
    private double cena;
    private Klient klient;

    private List<ListaZakupow> listaZakupow = new ArrayList<>();



    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    public List<ListaZakupow> getListaZakupow() {
        return listaZakupow;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}
