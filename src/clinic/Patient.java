package clinic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
    private LocalDate visitDate;

    private Clinic clinic;

    //assojacja z atrybutem
    private List<Exemption> exemptions = new ArrayList<>();

    private List<MedicalExamination> mediacalExaminations = new ArrayList<>();


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

    public List<Exemption> getExemptions() {
        return exemptions;
    }

    public List<MedicalExamination> getMediacalExaminations() {
        return mediacalExaminations;
    }
}
