package clinic;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private int number;
    private final Clinic clinic;

    //ekstencja
    private static List<Office> office = new ArrayList<>();


    public Office(int number, Clinic clinic) {
        if(clinic == null) throw new IllegalArgumentException();
        setNumber(number);
        this.clinic = clinic;
        office.add(this);
        clinic.getOffice().add(this);
    }

    public Clinic getClinic() {
        return clinic;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        for(Office o : office){
            if(o.getNumber() == number) {
                throw new IllegalArgumentException("Office number already exist in this office");
            }
        }
        this.number = number;
    }
    public List<Office> getOffice() {
        return office;
    }


    @Override
    public String toString() {
        return "Office{" +
                "number=" + number +
                '}';
    }
}
