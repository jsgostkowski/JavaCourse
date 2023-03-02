package example.one.uml;

public class Pracownik extends Osoba {
    private String stanowisko;
    private double pensja;

    public Pracownik(String imie, String nazwisko, String pesel, String stanowisko, double pensja) {
        super(imie, nazwisko, pesel);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }
    @Override
    public String getSex() {
        String pesel = getPesel();
        int l = Integer.parseInt(pesel.substring(9,10));
        if(l%2==0){
            return "K";
        }else {
            return "M";
        }
    }
    @Override
    public double getDochod() {
        return pensja;
    }

    @Override
    public String toString() {
        return  stanowisko + '\'' +
              pensja;

    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }
}
