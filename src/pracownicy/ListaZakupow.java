package pracownicy;

public class ListaZakupow {
    private int ilosc;
    private final Klient klient;
    private final Produkt produkt;

    public ListaZakupow(int ilosc, Klient klient, Produkt produkt) {
        if(klient == null || produkt == null){
            throw new IllegalArgumentException("nie ma klienta ani produktu - nara");
        }
        this.ilosc = ilosc;
        this.klient = klient;
        this.produkt = produkt;

        klient.getListaZakupow().add(this);
        produkt.getListaZakupow().add(this);
    }


    public int getIlosc() {
        return ilosc;
    }

    public Klient getKlient() {
        return klient;
    }

    public Produkt getProdukt() {
        return produkt;
    }
}
