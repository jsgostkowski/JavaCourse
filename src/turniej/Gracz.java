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
