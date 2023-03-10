package pracownicy;

import example.one.uml.Osoba;

import java.util.ArrayList;
import java.util.List;

//* Stwórz klasę Pracownik (imie,nazwisko, adres, pensja i Klient (imie,nazwisko, ulubiony produkt). Klient kupuje produkty (nazwa, cena).
//Pracownik uzywa samochod (model, marka)
//
//1) Znajdz klienta który wydal najwiecej
//
//2) Wyswietl dla kazdego klienta jego ulubiony produkt (of cuz ulubiony produkt to ma byc atrybut wyliczalny na podstawie listy zakupow)
//
//3) Wyswietl 3 top pracownikow z najwieksza pensja (compartor + sortowanie) DODATKOWE
//
//4) Pracownicy auta moga uzywac wielkorotnie, chcemy przechowywac informacje (i moc ja wyswietlic) ile jaki pracownik uzywal jakiego auta
//*/
public class Main {
    public static void main(String[] args) {
        Klient k1 = new Klient("klientPierwszy","klientPierwszy","popcorn");
        Klient k2 = new Klient("kleintDwa","klientdwa","cos2");
        Klient k3 = new Klient("klientTrzy","klienttrzy","cos3");
        Produkt p1 = new Produkt("czekolada",12.2);
        Produkt p2 = new Produkt("piwo",15);
        Produkt p3 = new Produkt("koks",600);
        List<Klient> klienci = new ArrayList<>();
        klienci.add(k1);
        klienci.add(k2);
        klienci.add(k3);

        k1.dodajProdukt(p1);
        k1.dodajProdukt(p1);
        //k1.dodajProdukt(p1); wywala exceptiona bo produkt juz zostal kupiony
        k2.dodajProdukt(p2);
        k3.dodajProdukt(p3);
        k2.dodajProdukt(p3);
        k2.dodajProdukt(p3);
        k2.dodajProdukt(p3);
        for (Klient klient : klienci) {
            System.out.println("ulubiony produkt klienta: " +klient.getImie() +" " +klient.ulubionyProdukt());
        }

        System.out.println(Klient.klientKtoryWydalNajwiecej(List.of(k1,k2,k3)));
        System.out.println();
      //  System.out.println(Klient.ulubionyProdukt(List.of(k1,k2,k3)));
    }
}
