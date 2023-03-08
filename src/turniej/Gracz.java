package turniej;

import java.util.ArrayList;
import java.util.List;

public class Gracz {
    private String imie;
    private String nazwisko;

    private List<Wynik> wyniki = new ArrayList<>();

    public Gracz(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;

    }
    //3) znajdz gracsa ktory byl najlepeszt w turniejach o danej nazwie, jesli nie ma to rzuc wyjatkiem
    public int obliczLiczbePunktowWTurnieju(String nazwaTurnieju){
        int suma = 0;
        for (Wynik wynik : wyniki) {
            if(wynik.getTurniej().getNazwa().equals(nazwaTurnieju)){
                suma += wynik.getPunkty();
            }
        }
        return suma;
    }

    public static Gracz najlepszyGraczTurnieju(List<Wynik> wyniki, String nazwaTurnieju){
        if(wyniki == null){
            throw new IllegalArgumentException("lista wynikow jest nullem");
        }

        Gracz najlepszyGracz = wyniki.get(0).getGracz();
        int najlepszyWynik = wyniki.get(0).getPunkty();

        for (Wynik wynik : wyniki) {
            if(wynik.getTurniej().getNazwa().equals(nazwaTurnieju)){
                Gracz gracz = wynik.getGracz();
                int liczbaPunktow = gracz.obliczLiczbePunktowWTurnieju(nazwaTurnieju);

                if(liczbaPunktow > najlepszyWynik){
                    najlepszyGracz = gracz;
                }

            }
        }

        return najlepszyGracz;
    }
    //4) znajdz gracza ktory zodbyl najwiecej 1 miejsc ze wszystkich turniejow
            //Metoda generujaca liste graczy ktorzy zdobyli pierwsze miejsca
    public static List<Gracz> listaGraczyKtorzyZajeliPierwszeMiejsca (List<Wynik> wyniki){
        if(wyniki == null){
            throw new IllegalArgumentException("lista wynikow jest nullem");
        }
        List<Gracz> graczeZPierwszymMiejscem = new ArrayList<>();
        int counter =0;
        for (Wynik wynik : wyniki) {
            if(wynik.getPozycja() == 1){
                graczeZPierwszymMiejscem.add(wynik.getGracz());
                counter++;
            }
        }
        System.out.println(counter);
        return graczeZPierwszymMiejscem ;
    }
    //Sprawdzenie ile pierwszych miejscZajalGracz
    public static int iloscPierwszchMiejscDanegoGraczaj(Gracz gracz, List<Wynik> wyniki){
        int ileRazyZdobylPierwszeMiejsce = 0;
        for (Wynik wynik : wyniki) {
            if(wynik.getGracz().equals(gracz) && wynik.getPozycja()==1){
                ileRazyZdobylPierwszeMiejsce++;
            }
        }
        return ileRazyZdobylPierwszeMiejsce;
    }
    //zwrocenie gracza, ktory ma najwiecej pierwszysch miejsc
    public static Gracz graczZNajwiekszaIlosciaPierwszychMiejsc(List<Wynik> wyniki){
        List<Gracz> graczeZPierwszymMiejscem = listaGraczyKtorzyZajeliPierwszeMiejsca(wyniki);
        if(graczeZPierwszymMiejscem.isEmpty()){
            throw new IllegalArgumentException("Nie ma gracza ktory zajal pierwsze miesjce");
        }
        Gracz najlepszyGracz = graczeZPierwszymMiejscem.get(0);

        for (Gracz gracz : graczeZPierwszymMiejscem) {
            int ilosc = 0;
            for (Wynik wynik : wyniki) {
                if(wynik.getGracz().equals(gracz) && wynik.getPozycja() == 1){
                    ilosc++;
                }
            }
            if(ilosc>iloscPierwszchMiejscDanegoGraczaj(najlepszyGracz,wyniki)){
                najlepszyGracz = gracz;
            }
        }

        return najlepszyGracz;
    }
   // 5) znajdz gracza ktory ma najwyzsyz ranking z turrniejow ale nigdycnie mial 1 miejsca
   public static List<Gracz> listaGraczyKtorzyNieZajeliPierwszeMiejsca (List<Wynik> wyniki){
       if(wyniki == null){
           throw new IllegalArgumentException("lista wynikow jest nullem");
       }
       List<Gracz> graczeBezPierwszegoMiejsca = new ArrayList<>();
       int counter =0;
       for (Wynik wynik : wyniki) {
           if(wynik.getPozycja() != 1){
               graczeBezPierwszegoMiejsca.add(wynik.getGracz());
               counter++;
           }
       }
       System.out.println(counter);
       return graczeBezPierwszegoMiejsca;
   }
   //metoda ktora policzy punkty dla gracza, który nie zajął pierwszego miesjca
    public static int obliczPunktyGraczaKtoryNieZajalPierwszegoMiejsca(Gracz gracz, List<Wynik> wyniki){
        int punktyDanegoGracza = 0;
        for (Wynik wynik : wyniki) {
            if(wynik.getGracz().equals(gracz) && wynik.getPozycja() != 1){
                punktyDanegoGracza += wynik.getPunkty();
            }
        }
        return punktyDanegoGracza;
    }
    public static Gracz najlepszyGraczBezPierwszegoMiejsca(List<Wynik> wyniki){
        Gracz najlepszyGracz = wyniki.get(0).getGracz();
        List<Gracz> graczeBezPierwszegoMiejsca = listaGraczyKtorzyNieZajeliPierwszeMiejsca(wyniki);

        int maxPunkty = Integer.MIN_VALUE;

        for (Gracz gracz : graczeBezPierwszegoMiejsca) {
            int punktyGracza = obliczPunktyGraczaKtoryNieZajalPierwszegoMiejsca(najlepszyGracz,wyniki);
            if(maxPunkty > punktyGracza){
                najlepszyGracz = gracz;
            }
        }
        return najlepszyGracz;

    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public List<Wynik> getWyniki() {
        return wyniki;
    }

    public void setWyniki(List<Wynik> wyniki) {
        this.wyniki = wyniki;
    }

    @Override
    public String toString() {
        return "Gracz{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", turnieje=" + wyniki +
                '}';
    }
}
