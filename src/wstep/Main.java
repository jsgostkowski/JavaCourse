//package wstep;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        Samochod s1 = new Samochod("opel", "astra", 1999, "black", 10000,12982818218813.99);
//        Samochod s2 = new Samochod("volkswagen", "golf", 1992, "black", 1292,12444.21);
//        Samochod s3 = new Samochod("teAst3", "t3", 2000, "white", 12923,123.42);
//        Samochod s4 = new Samochod("test4", "golf", 1991, "black", 1292,9283.22);
//
//        System.out.println(Samochod.getEkstensja());
//
//        Samochod s5 = new Samochod("test5", "t5", 2912, "white", 21737, 9999888.23);
//
//        System.out.println(Samochod.getEkstensja());
//
//        // wywolanie metody obiektwoej
//        System.out.println(s1.obliczWiek());
//        System.out.println(s2.obliczWiek());
//
//        // wywolanie metody statycznej
//        System.out.println(Samochod.najstarszeAuto(Samochod.getEkstensja()));
//        System.out.println(Samochod.najstarszeAuto(List.of(s3, s5, s1)));
//        System.out.println("Metoda z litera a " + Samochod.markiSamochodowZLiteraA(List.of(s1,s2,s3,s4,s5)));
//        System.out.println("Metoda z marka > 4 " + Samochod.nadrozszeAutoDlugoscMarkiWiekszeNizCztery(List.of(s1,s2,s3,s4,s5)));
//    }
//}
