package clinic;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private String name;
    private String adress;

    //kompozycja do gabinetu
    private List<Office> office = new ArrayList<>();

    public Clinic(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    //getter dla naszej kompozycji (klinika zawiera gabinet)
    public List<Office> getOffice() {
        return office;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Clinic{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
