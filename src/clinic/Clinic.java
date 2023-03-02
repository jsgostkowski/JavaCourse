package clinic;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private String name;
    private String adress;

    //kompozycja do gabinetu
    private List<Office> office = new ArrayList<>();

    //1 - *
    private List<Doctor> doctors = new ArrayList<>();

    //1 - *
    private List<Patient> patients = new ArrayList<>();

    public Clinic(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    //powiazanie dla relacji 1-* klinika pacjent
    public void addPatient(Patient patient) {
        if (patient.getClinic() != null) throw new IllegalArgumentException("Patient already have a private clinic");
        patients.add(patient);
        patient.setClinic(this);
    }


    public void deletePatient(Patient patient) {
        patients.remove(patient);
        patient.setClinic(null);
    }

    //powizanie dla relacji 1-* klinika lekarz
    public void addDoctor(Doctor doctor) {
        if (doctor.getClinic() != null) throw new IllegalArgumentException("Doctor already have a private clinic");
        doctors.add(doctor);
        doctor.setClinic(this);
    }

    public void deleteDoctor(Doctor doctor) {
        doctors.remove(doctor);
        doctor.setClinic(null);
    }

    public List<Doctor> getDoctors() {
        return doctors;
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

    public List<Patient> getPatients() {
        return patients;
    }

    @Override
    public String toString() {
        return "Clinic: " + getName();
    }
}
