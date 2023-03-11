package pracownicy;

import java.util.ArrayList;
import java.util.List;

public class Samochod {
    private String marka;
    private String model;

    private List<WynajemSamochodu> wynajem = new ArrayList<>();

    public Samochod(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public List<WynajemSamochodu> getWynajem() {
        return wynajem;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
