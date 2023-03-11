package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Samochod s1 = new Samochod("Ford", 1200);
        Samochod s2 = new Samochod("Honda", 1700);
        Samochod s3 = new Samochod("Fiat", 2000);
        Samochod s4 = new Samochod("Opel", 5000);
        Samochod s5 = new Samochod("Mazda", 7000);
        Samochod s6 = new Samochod("Audi", 1200);
        Samochod s7 = new Samochod("Audi", 200);
        Samochod s8 = new Samochod("Fiat",500.20);

        List<Samochod> listaSamochodw = new ArrayList<>();
        listaSamochodw.add(s1);
        listaSamochodw.add(s2);
        listaSamochodw.add(s3);
        listaSamochodw.add(s4);
        listaSamochodw.add(s5);
        listaSamochodw.add(s6);
        listaSamochodw.add(s7);
        listaSamochodw.add(s8);

        System.out.println(listaSamochodw);
        System.out.println("Lista posortowana: ");
        Collections.sort(listaSamochodw);
        System.out.println(listaSamochodw);

        System.out.println("Sortujemy TYLKO po cenie double: ");

        //wskazujemy mu tyko jakie pole mamy posortowac czyli w naszym samochodzie ma wziac cene
        Collections.sort(listaSamochodw, Comparator.comparingDouble(Samochod::getCena));
        System.out.println(listaSamochodw);
        Collections.sort(listaSamochodw, Comparator.comparingDouble(Samochod::getCena).reversed());
        System.out.println("Odwrocimy kolejnosc: ");
        System.out.println(listaSamochodw);
    }

}
