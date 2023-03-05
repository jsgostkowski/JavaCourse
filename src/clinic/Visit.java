package clinic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Visit {
    private LocalDate visitDate;

    private List<Exemption> exemptions = new ArrayList<>();


    public Visit(LocalDate visitDate) {
        this.visitDate = visitDate;

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


}
