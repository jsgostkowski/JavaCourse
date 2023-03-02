package clinic;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person{
    private String specialization;
    private Clinic clinic;

    //extension
    private static List<Doctor> doctor = new ArrayList<>();



    public Doctor(String name, String surname, String adres, String specialization) {
        super(name, surname, adres);
        this.specialization = specialization;
        doctor.add(this);
    }
    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public static List<Doctor> getDoctor() {
        return doctor;
    }

    public static List<Doctor> getDoctorBySpecialization(List<Doctor> list, String specialization){
        if(list == null) throw new IllegalArgumentException("List cannot be empty");
        List<Doctor> result = new ArrayList<>();
        for (Doctor doctor : list) {
            if(doctor.getSpecialization().equals(specialization)){
                result.add(doctor);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Doctor: " + getName() + ", " +getSurname()+ ", " + specialization;
    }
}
