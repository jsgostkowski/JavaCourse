package clinic;

public class MedicalExamination {
    private final String name;
    private final Patient patient;
    private final Doctor doctor;

    public MedicalExamination(String name, Patient patient, Doctor doctor) {
        this.name = name;
        this.patient = patient;
        this.doctor = doctor;

        patient.getMediacalExaminations().add(this);
        doctor.getMedicalExaminations().add(this);
    }

    public String getName() {
        return name;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    @Override
    public String toString() {
        return "MedicalExamination{" +
                "name='" + name + '\'' +
                ", patient=" + patient.getName() +
                ", doctor=" + doctor.getName() +
                '}';
    }
}
