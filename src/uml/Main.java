package uml;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Szkola s1 = new Szkola("szkola jeden", 1995, 1, "T");
        Szkola s2 = new Szkola("szkola dwa", 2000, 2);
        s1.dodajProfil("Fizyczny");
        s1.dodajProfil("Matematyczny");
        s2.dodajProfil("Informatyczny");

        Uczen u1 = new Uczen("test 1", "test1", "test3", "s123");
        Uczen u2 = new Uczen("test 2", "test2", "test3", "s123");
        Uczen u3 = new Uczen("test 3", "test3", "test3", "s123");

        s1.dodajUcznia(u1);
        s1.dodajUcznia(u2);
        s1.dodajUcznia(u3);

        System.out.println(s1.getUczniowie());

        System.out.println(u1.getSzkola());

        //  s2.dodajUcznia(u1);

        Nauczyciel n1 = new Nauczyciel("test 1", "test 1", "adres 1", "Java");
        Nauczyciel n2 = new Nauczyciel("test 2", "test 2", "adres 2", "C++");
        Szkolenie szkolenie = new Szkolenie("Szkolenie z programowania");
        szkolenie.dodajNauczyciela(n1);
        szkolenie.dodajNauczyciela(n2);

        System.out.println(n1.getSzkolenia());
        System.out.println(szkolenie.getNauczyciele());

        Sprawdzian sprawdzian = new Sprawdzian("Matematyka");
        Ocena ocena = new Ocena(3, LocalDate.now(), u1, sprawdzian);

        System.out.println(ocena);
        System.out.println(u1.getOceny());
        System.out.println(sprawdzian.getOceny());

        Sala sala = new Sala("Matematyczno-przyrodnicza", s1);
        System.out.println(sala.getSzkola());
        System.out.println(s1.getSale());


    }
}
