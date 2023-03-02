package uml;

import java.time.LocalDate;
import java.util.Date;

public class Ocena {
    private final int wartosc;
    private final LocalDate dataWystawienia;
    private final Uczen uczen;
    private final Sprawdzian sprawdzian;

    public Ocena(int wartosc, LocalDate dataWystawienia, Uczen uczen, Sprawdzian sprawdzian) {
        if (uczen == null || sprawdzian == null) throw new IllegalArgumentException("uczen lub sprawdzian sa nulalmi");

        this.wartosc = wartosc;
        this.dataWystawienia = dataWystawienia;
        this.uczen = uczen;
        this.sprawdzian = sprawdzian;

        // info zwrotne
        uczen.getOceny().add(this);
        sprawdzian.getOceny().add(this);
    }

    public Uczen getUczen() {
        return uczen;
    }

    public Sprawdzian getSprawdzian() {
        return sprawdzian;
    }

    public int getWartosc() {
        return wartosc;
    }


    public LocalDate getDataWystawienia() {
        return dataWystawienia;
    }

    @Override
    public String toString() {
        return "Ocena{" +
                "wartosc=" + wartosc +
                ", dataWystawienia=" + dataWystawienia +
                ", uczen=" + uczen +
                ", sprawdzian=" + sprawdzian +
                '}';
    }
}
