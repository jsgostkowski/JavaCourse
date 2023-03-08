package turniej;

import java.time.LocalDate;
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
        Wynik wynik = new Wynik(1, g2, t1, 6999);
        Wynik wynik2 = new Wynik(3, g2, t1, 2);
        Wynik wynik3 = new Wynik(1, g2, t1, 1000);
        Wynik wynik4 = new Wynik(1, g4, t2, 199);
        Wynik wynik5 = new Wynik(1, g4, t3, 199);
        Wynik wynik6 = new Wynik(1, g4, t4, 199);

        System.out.println(Gracz.najlepszyGraczTurnieju(List.of(wynik,wynik2,wynik3, wynik4),"turniej 1"));
        System.out.println("lista graczy z pierwszym miejscem: "+Gracz.listaGraczyKtorzyZajeliPierwszeMiejsca(List.of(wynik,wynik2,wynik3,wynik4,wynik5,wynik6)));
        System.out.println("Gracz z najwieksza iloscia pierwszych miesjc: " + Gracz.graczZNajwiekszaIlosciaPierwszychMiejsc(List.of(wynik,wynik2,wynik3,wynik4,wynik5,wynik6)));
    }


}
