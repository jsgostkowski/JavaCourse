package turniej;

public class Wynik {
    private final int pozycja;
    private final Gracz gracz;
    private final Turniej turniej;
    private final int punkty;

    public Wynik(int pozycja, Gracz gracz, Turniej turniej, int punkty) {
        if(gracz == null || turniej==null){
            throw new IllegalArgumentException("lipa nie ma gracza ani turnieju");
        }
        this.pozycja = pozycja;
        this.gracz = gracz;
        this.turniej = turniej;
        this.punkty = punkty;

        gracz.getWyniki().add(this);
        turniej.getWyniki().add(this);
    }

    public int getPunkty() {
        return punkty;
    }

    public int getPozycja() {
        return pozycja;
    }

    public Gracz getGracz() {
        return gracz;
    }

    public Turniej getTurniej() {
        return turniej;
    }
}
