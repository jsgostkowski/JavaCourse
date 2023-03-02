package uml;

import java.util.ArrayList;
import java.util.List;

public class Sprawdzian {
    private String przedmiot;

    // asocjacja z atrybutem
    private List<Ocena> oceny = new ArrayList<>();

    public Sprawdzian(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public List<Ocena> getOceny() {
        return oceny;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }
}
