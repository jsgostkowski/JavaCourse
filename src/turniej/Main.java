package turniej;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gracz g1 = new Gracz("JAKUB" , "Wygrany");
        Gracz g2 = new Gracz("KUBA" , "PRZEGRANY");
        Gracz g3 = new Gracz("MARCIN" , "PRZEGRANY");
        Gracz g4 = new Gracz("Seba" , "Wygrany");
        Turniej t1 = new Turniej("turniej 1", LocalDate.of(2023,11,22));
        Wynik wynik = new Wynik(1, g1, t1, 699);
        Wynik wynik2 = new Wynik(3, g2, t1, 2);
        Wynik wynik3 = new Wynik(3, g3, t1, 1000);
        Wynik wynik4 = new Wynik(4, g4, t1, 199);

        System.out.println(Gracz.najlepszyGraczTurnieju(List.of(wynik,wynik2,wynik3, wynik4),"turniej 1"));
    }


}
