package turniej;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Gracz g1 = new Gracz("JAKUB" , "Wygrany");
        Gracz g2 = new Gracz("KUBA" , "PRZEGRANY");
        Gracz g3 = new Gracz("MARCIN" , "PRZEGRANY");
        Gracz g4 = new Gracz("Seba" , "Wygrany");
        Turniej t1 = new Turniej("turniej 1", LocalDate.of(2023,11,22));
        Turniej t2 = new Turniej("turniej 1", LocalDate.of(2023,11,22));
        Turniej t3 = new Turniej("turniej 1", LocalDate.of(2023,11,22));
        Turniej t4 = new Turniej("turniej 1", LocalDate.of(2023,11,22));
        Wynik wynik = new Wynik(2, g1, t1, 6923199);
        Wynik wynik2 = new Wynik(2, g2, t1, 2);
        Wynik wynik3 = new Wynik(2, g2, t1, 1000);
        Wynik wynik4 = new Wynik(4, g4, t2, 199);
        Wynik wynik5 = new Wynik(13, g2, t3, 199);
        Wynik wynik6 = new Wynik(1, g4, t4, 199);

        List<Gracz> gracze = new ArrayList<>();
        gracze.add(g1);
        gracze.add(g2);
        gracze.add(g3);
        gracze.add(g4);
        List<Wynik> wyniki = new ArrayList<>();
        wyniki.add(wynik);
        wyniki.add(wynik2);
        wyniki.add(wynik3);
        wyniki.add(wynik4);
        wyniki.add(wynik6);
        wyniki.add(wynik5);

        System.out.println("Lista graczy bez pierwszego miejsca: " + Gracz.listaGraczyKtorzyNieZajeliPierwszeMiejsca(List.of(wynik,wynik2,wynik3,wynik4,wynik5,wynik6)));
        System.out.println("Gracz z najlepszymi punktami: " + Gracz.najlepszyGraczBezPierwszegoMiejsca(wyniki));
        System.out.println("Punkty gracza: " + Gracz.obliczPunktyGraczaKtoryNieZajalPierwszegoMiejsca(g2, wyniki));

        System.out.println(Gracz.najlepszyGraczTurnieju(List.of(wynik,wynik2,wynik3, wynik4),"turniej 1"));
        System.out.println("lista graczy z pierwszym miejscem: "+Gracz.listaGraczyKtorzyZajeliPierwszeMiejsca(List.of(wynik,wynik2,wynik3,wynik4,wynik5,wynik6)));
        System.out.println("Gracz z najwieksza iloscia pierwszych miesjc: " + Gracz.graczZNajwiekszaIlosciaPierwszychMiejsc(List.of(wynik,wynik2,wynik3,wynik4,wynik5,wynik6)));
    }


}
