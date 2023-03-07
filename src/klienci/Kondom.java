package klienci;

public class Kondom extends Produkt{
    private double wymiar;

    public Kondom(String nazwa, double cena, double wymiar) {
        super(nazwa, cena);
        this.wymiar = wymiar;
    }

    public double getWymiar() {
        return wymiar;
    }

    public void setWymiar(double wymiar) {
        this.wymiar = wymiar;
    }

    @Override
    public String toString() {
        return "Kondom{" +
                "wymiar=" + wymiar +
                '}';
    }
}
