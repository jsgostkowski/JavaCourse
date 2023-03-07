package turniej;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Turniej {
    private String nazwa;
    private LocalDate miesiac;


    private List<Wynik> wyniki = new ArrayList<>();

    public Turniej(String nazwa, LocalDate miesiac) {
        this.nazwa = nazwa;
        this.miesiac = miesiac;

    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public LocalDate getMiesiac() {
        return miesiac;
    }

    public void setMiesiac(LocalDate miesiac) {
        this.miesiac = miesiac;
    }

    public List<Wynik> getWyniki() {
        return wyniki;
    }

    public void setWyniki(List<Wynik> wyniki) {
        this.wyniki = wyniki;
    }

    @Override
    public String toString() {
        return "Turniej{" +
                "nazwa='" + nazwa + '\'' +
                ", miesiac=" + miesiac +
                ", gracze=" + wyniki +
                '}';
    }
}
