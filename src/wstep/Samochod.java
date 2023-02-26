package wstep;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Samochod {

    // pola
    private final String marka;
    private final String model;
    private final int rokProdukcji;
    private String kolor;
    private int przebieg;
    //dopisac pole cena

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    private double cena;

    // ekstensja
    private static List<Samochod> ekstensja = new ArrayList<>();


    public Samochod(String marka, String model, int rokProdukcji, String kolor, int przebieg, double cena) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.kolor = kolor;
        this.przebieg = przebieg;
        this.cena = cena;

        ekstensja.add(this);
    }

    // metoda obiektowa (niestatyczna) musi byc wywołana na konkretnym obiekcie
    public int obliczWiek() {
        return LocalDate.now().getYear() - rokProdukcji;
    }

    // metoda klasowa (statyczna) nie potrzebuje obiektu zeby sie wywoalac, wywolujemy ja na klasie
    // w tego typu metodach nigdy nie dzialamy na ekstensji
    public static Samochod najstarszeAuto(List<Samochod> lista) {

        if (lista == null || lista.isEmpty())
            throw new IllegalArgumentException("lista nie moze byc nullem ani byc pusta");

        Samochod max = lista.get(0);

        for (Samochod s : lista) {
            if (s.obliczWiek() > max.obliczWiek()) {
                max = s;
            }
        }
        return max;
    }

    // napisz metode ktora znajduje wszystkie auta marki bmw
    public static List<Samochod> autaDanejMarki(List<Samochod> lista, String marka) {

        if (lista == null)
            throw new IllegalArgumentException("lista nie moze byc nullem ani byc pusta");

        List<Samochod> rezultat = new ArrayList<>();
        for (Samochod samochod : lista) {
            if (samochod.getMarka().equals(marka)) {
                rezultat.add(samochod);
            }
        }
        return rezultat;
    }

    // napisz metode ktora sumuje ceny wszystkich aut
    public static double sumaCenAut(List<Samochod> lista) {
        if (lista == null)
            throw new IllegalArgumentException("lista nie moze byc nullem");

        double suma = 0;

        for (Samochod s : lista) {
            suma += s.getCena();
        }

        return suma;

    }

    // napisz metode ktora zwraca nazwy wszystkich marek (unikalnych!)
    public static Set<String> wszystkieMarkiSamochodow(List<Samochod> lista) {
        Set<String> rezultat = new HashSet<>();
        for (Samochod s : lista) {
            rezultat.add(s.getMarka());
        }
        return rezultat;
    }

    // napisz metode ktora znajduje auto o najnizszym przebiegu
    public static Samochod zwrocAutoZNajnizszymPrzebiegiem(List<Samochod> lista) {
        if (lista == null || lista.isEmpty())
            throw new IllegalArgumentException("lista nie moze byc pusta ani nie moze byc nullem");
        Samochod min = lista.get(0);

        for (Samochod s : lista) {
            if (s.getPrzebieg() < min.getPrzebieg()) {
                min = s;
            }

        }
        return min;
    }

    // napisz metode ktora znajduje wszystkie auta o kolorze niebieskim starsze niz 15 lat
    public static List<Samochod> zwrocNiebieskieAutaStarszeNizPietnascieLat(List<Samochod> list, String kolor, int wiek) {
        if (list == null)
            throw new IllegalArgumentException("lista nie moze byc nullem");
        List<Samochod> rezultat = new ArrayList<>();
        for (Samochod s : list) {
            if (s.getKolor().equals(kolor) && s.obliczWiek() > wiek) {
                rezultat.add(s);
            }
        }
        return rezultat;
    }

    // napisz metode ktora znajduje najdrozsze auto ale z aut z przebiegiem mniejszym nzi 30k
    public static List<Samochod> zwrocAutaZPrzebiegiemMniejszymNiz(List<Samochod> lista, double przebieg) {
        if (lista == null)
            throw new IllegalArgumentException("lista nie moze byc nullem");
        List<Samochod> auta = new ArrayList<>();
        for (Samochod s : lista) {
            if (s.getPrzebieg() < przebieg) {
                auta.add(s);
            }
        }
        return auta;
    }

    public static Samochod najdrozszySamochodZPrzebiegiem(List<Samochod> lista, double przebieg) {

        List<Samochod> przebiegi = new ArrayList<>(zwrocAutaZPrzebiegiemMniejszymNiz(lista, przebieg));

        if (przebiegi.isEmpty())
            throw new IllegalArgumentException("lista nie moze byc nullem");

        Samochod max = przebiegi.get(0);
        for (Samochod s : przebiegi) {
            if (s.getCena() > max.getCena()) {
                max = s;

            }
        }
        return max;
    }

    // znajdz najtansze auto marki bmw
    public static Samochod najtanszySamochodmarki(List<Samochod> lista, String marka) {

        List<Samochod> resultat = new ArrayList<>(autaDanejMarki(lista, marka));

        if (resultat.isEmpty())
            throw new IllegalArgumentException("lista nie moze byc pusta ani nie moze byc nullem");
        Samochod s = resultat.get(0);
        for (Samochod samochod : resultat) {
            if (samochod.getCena() < s.getCena()) {
                s = samochod;
            }
        }
        return s;
    }


//
//        Samochod s = lista.get(0);
//      //honda 100zl
//        for (Samochod samochod : lista) {//bmw 200
//            if (samochod.getMarka().equals(marka) && samochod.getCena() < s.getCena()) {
//                s = samochod;
//            }
//        }


    // znajsz wszystkie auta ktore w marce maja literke a
    public static List<Samochod> markiSamochodowZLiteraA(List<Samochod> lista, String param) {
        if (lista == null)
            throw new IllegalArgumentException("lista nie moze byc nullem");
        List<Samochod> result = new ArrayList<>();

        for (Samochod s : lista) {
            if (s.getMarka().contains(param)) {
                result.add(s);
            }
        }
        return result;
    }

    // znajdz najdrozsze auto ktorego marka ma dlugosc wieksza niz 4
    public static List<Samochod> listaAutDluzszychNizParametr(List<Samochod> lista, int param) {
        if (lista == null)
            throw new IllegalArgumentException("lista nie moze byc nullem");
        List<Samochod> rezultat = new ArrayList<>();
        for (Samochod samochod : lista) {
            if (samochod.getMarka().length() > param) {
                rezultat.add(samochod);
            }
        }
        return rezultat;
    }

    public static Samochod nadrozszeAutoDlugoscMarkiWiekszeNizCztery(List<Samochod> list, int param) {
        List<Samochod> rezultat = new ArrayList<>(listaAutDluzszychNizParametr(list, param));
        if (rezultat.isEmpty())
            throw new IllegalArgumentException("lista nie moze byc pusta ani nie moze byc nullem");
        Samochod s = rezultat.get(0);
        for (Samochod samochod : rezultat) {
            if (samochod.getCena() > s.getCena()) {
                s = samochod;
            }
        }
        return s;

    }

    public static List<Samochod> getEkstensja() {
        return ekstensja;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    @Override
    public String toString() {
        return marka + " " + model;
    }
}
