package pracownicy;

import example.one.uml.Osoba;

import java.util.ArrayList;
import java.util.List;

//* Stwórz klasę Pracownik (imie,nazwisko, adres, pensja i Klient (imie,nazwisko, ulubiony produkt). Klient kupuje produkty (nazwa, cena).
//Pracownik uzywa samochod (model, marka)
//
//1) Znajdz klienta który wydal najwiecej
//
//2) Wyswietl dla kazdego klienta jego ulubiony produkt (of cuz ulubiony produkt to ma byc atrybut wyliczalny na podstawie listy zakupow - czy tutaj klasa pomiedzy klientem-produktem ListaZakupow)
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
       // k1.dodajProdukt(p1);
        //k1.dodajProdukt(p1); wywala exceptiona bo produkt juz zostal kupiony
        k2.dodajProdukt(p2);
        k3.dodajProdukt(p3);
        //k2.dodajProdukt(p3);
        //k2.dodajProdukt(p3);
       // k2.dodajProdukt(p3);
        for (Klient klient : klienci) {
            System.out.println("ulubiony produkt klienta: " +klient.getImie() +" " +klient.ulubionyProdukt());
        }

        System.out.println(Klient.klientKtoryWydalNajwiecej(List.of(k1,k2,k3)));
        System.out.println();
      //  System.out.println(Klient.ulubionyProdukt(List.of(k1,k2,k3)));


        Pracownik pracownik1 = new Pracownik("pracownik 1" ,"pracownik 1", 1);
        Pracownik pracownik2 = new Pracownik("pracownik 2" ,"pracownik 2", 8);
        Pracownik pracownik3 = new Pracownik("pracownik 3" ,"pracownik 3", 3);
        Pracownik pracownik4 = new Pracownik("pracownik 4" ,"pracownik 4", 4);
        Pracownik pracownik5 = new Pracownik("pracownik 5" ,"pracownik 5", 5);
        Pracownik pracownik6 = new Pracownik("pracownik 6" ,"pracownik 6", 6);

        List<Pracownik> pracownicy =new ArrayList<>();
        pracownicy.add(pracownik1);
        pracownicy.add(pracownik2);
        pracownicy.add(pracownik3);
        pracownicy.add(pracownik4);
        pracownicy.add(pracownik5);
        pracownicy.add(pracownik6);

       // List<Pracownik> najlepiejZarabiajacyPracownicy =
        System.out.println(pracownicy);

        System.out.println(Pracownik.topTrzechNajlepiejZarabiajacychPracownikow(pracownicy));
        Samochod samochod1 = new Samochod("ford", "escort");
        Samochod samochod2 = new Samochod("ford", "fiesta");
        Samochod samochod3 = new Samochod("ford", "focus");

        WynajemSamochodu wynajem = new WynajemSamochodu(pracownik1,samochod1);
        WynajemSamochodu wynajem2 = new WynajemSamochodu(pracownik1, samochod1);

        pracownik1.wpozyczSamochod(samochod1);
        pracownik1.wpozyczSamochod(samochod2);

        System.out.println("WYNAJEM SAMOCHODOW: ");
        System.out.println(wynajem);
        System.out.println(pracownik1.getWynajem());
        System.out.println(samochod1.getWynajem());
        System.out.println("samochod 2: " + samochod2.getWynajem());


    }
}
