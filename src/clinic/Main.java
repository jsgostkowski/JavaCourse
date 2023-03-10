package clinic;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Clinic clinicOne = new Clinic("Klinika pierwsza", "adres pierwszy");
        Clinic clinicTwo = new Clinic("Klinika druga", "adres drugi");
        Office officeOne = new Office(123, clinicOne);

        Office officeTwo = new Office(124, clinicOne);


        Doctor doctorOne = new Doctor("DoctorOne", "DoctorOneSurname", "DocAdressOne", "DocOneSpec");
        Doctor doctorTwo = new Doctor("DoctorTwo", "DoctorTwoSurname", "DocAdressTwo", "DocOneSpec");
        Doctor doctorThree = new Doctor("DoctorThree", "DoctorThreeSurname", "DocAdressThree", "DocThreeSpec");
        System.out.println("ekstensja doktorow: " + Doctor.getDoctor());
        System.out.println(Doctor.getDoctorBySpecialization(Doctor.getDoctor(), "DocOneSpec"));
        System.out.println(doctorOne);

        System.out.println(clinicOne.getOffice());
        System.out.println(officeOne.getClinic());

        clinicOne.addDoctor(doctorOne);
        clinicOne.addDoctor(doctorThree);

        System.out.println(clinicOne.getDoctors());
        System.out.println("W jakiej klinice jest doktor: " + doctorOne.getClinic());
        System.out.println(doctorTwo.getClinic());

        Patient patientOne = new Patient("Pacjent 1", "Pacjent 1", "Adres Pacjent 1", LocalDate.of(2022, 02, 11));
        Patient patientTwo = new Patient("Pacjent 2", "Pacjent 2", "Adres Pacjent 2", LocalDate.of(2023, 03, 1));
        Patient patientThree = new Patient("Pacjent 3", "Pacjent 3", "Adres Pacjent 3", LocalDate.of(2021, 11, 15));
        clinicOne.addPatient(patientOne);
        clinicTwo.addPatient(patientTwo);
        System.out.println(clinicOne.getPatients());
        System.out.println(patientOne.getClinic());
        Visit visitOne = new Visit(LocalDate.of(2922, 9, 22));

        Exemption exemptionOne = new Exemption(LocalDate.of(2022, 02, 03), patientOne, visitOne);
        Exemption exemptionTwo = new Exemption(LocalDate.of(2022, 02, 03), patientOne, visitOne);

        System.out.println("visit one: " + visitOne);
        System.out.println(patientOne.getExemptions());
        System.out.println(exemptionOne.getPatient());
        System.out.println(exemptionOne.getVisit());

        Training training = new Training("TrainingOne");
        training.addDoctor(doctorThree);
        training.addDoctor(doctorOne);
        System.out.println("Doctor trainings: " + doctorThree.getTrainings());
        System.out.println("Get trainings: " + training.getDoctors());


        System.out.println("Badania medyczne: ");
        MedicalExamination me1 = new MedicalExamination("Kolanoskopia", patientOne,doctorThree);
        MedicalExamination me2 = new MedicalExamination("Badanie krwi", patientOne,doctorThree);
        System.out.println(patientOne.getMediacalExaminations());
        System.out.println(doctorThree.getMedicalExaminations());



    }
}
