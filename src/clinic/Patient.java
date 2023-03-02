package clinic;

import java.time.LocalDate;

public class Patient extends Person{
    private LocalDate visitDate;

    private Clinic clinic;



    public Patient(String name, String surname, String adres, LocalDate visitDate) {
        super(name, surname, adres);
        this.visitDate = visitDate;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    @Override
    public String toString() {
        return "Patient: " + getName() + ", " + getSurname() + ", " + getClinic() + ", " +getVisitDate();
    }
}
