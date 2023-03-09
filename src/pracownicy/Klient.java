package pracownicy;

public class Klient extends Czlowiek{
    private String ulubionyProdukt;

    public Klient(String imie, String nazwisko, String ulubionyProdukt) {
        super(imie, nazwisko);
        this.ulubionyProdukt = ulubionyProdukt;
    }

    public String getUlubionyProdukt() {
        return ulubionyProdukt;
    }

    public void setUlubionyProdukt(String ulubionyProdukt) {
        this.ulubionyProdukt = ulubionyProdukt;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "ulubionyProdukt='" + ulubionyProdukt + '\'' +
                '}';
    }
}
