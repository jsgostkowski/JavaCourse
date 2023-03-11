package comparable;

import clinic.Doctor;

//w pierwszym kroku musimy rozszerzyc nasza klase samochod o interfejs Comparable<typ> i otypowac ją jako Samochod
public class Samochod implements Comparable<Samochod> {
    private String marka;
    private double cena;

    public Samochod(String marka, double cena) {
        this.marka = marka;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", cena=" + cena +
                '}';
    }


    //metoda compareTo zwraca 1 jesli this>0 zwraca -1 jestli this <0 zwraca 0 jesli this = 0
    @Override
    public int compareTo(Samochod o) {
        int result = this.marka.compareTo(o.marka);

        //zalozmy ze mamy dwie takie same marki samochodu wiec musimy je posrotowac uzywajac kolejnej wartosci np ceny
        if(result == 0 ){
            return Double.compare(this.cena, o.cena);
        }
        return result;
    }
}
