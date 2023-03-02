package uml;

import java.util.ArrayList;
import java.util.List;

public class Szkolenie {
    private String nazwa;
    private List<Nauczyciel> nauczyciele = new ArrayList<>();

    public Szkolenie(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dodajNauczyciela(Nauczyciel n){
        nauczyciele.add(n);
        // info zwrotne
        n.getSzkolenia().add(this);
    }

    public String getNazwa() {
        return nazwa;
    }

    public List<Nauczyciel> getNauczyciele() {
        return nauczyciele;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
