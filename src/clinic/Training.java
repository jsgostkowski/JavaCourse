package clinic;

import java.util.ArrayList;
import java.util.List;

public class Training {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();

    public Training(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        doctor.getTrainings().add(this);
    }

    public String getNama() {
        return name;
    }


    public List<Doctor> getDoctors() {
        return doctors;
    }

    @Override
    public String toString() {
        return "Training{" +
                "name='" + name + '\'' +
                '}';
    }
}
