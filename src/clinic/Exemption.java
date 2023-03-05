package clinic;

import java.time.LocalDate;

public class Exemption {
    private final LocalDate exemptionDate;
    private final Patient patient;
    private final Visit visit;

    public Exemption(LocalDate exemptionDate, Patient patient, Visit visit) {
        //if(patient == null || visit == null) throw new IllegalArgumentException("visit or patient doesn't exist");
        this.exemptionDate = exemptionDate;
        this.patient = patient;
        this.visit = visit;


        //return info
        patient.getExemptions().add(this);
        visit.getExemptions().add(this);
    }

    public LocalDate getExemptionDate() {
        return exemptionDate;
    }

    public Patient getPatient() {
        return patient;
    }

    public Visit getVisit() {
        return visit;
    }

    @Override
    public String toString() {
        return "Exemption{" +
                "exemptionDate=" + exemptionDate +
                ", patient=" + patient +
                ", visit=" + visit +
                '}';
    }
}
