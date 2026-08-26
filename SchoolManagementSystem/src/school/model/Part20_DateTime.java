package school.model;

import java.time.LocalDate;
import java.time.Period;

public class Part20_DateTime {
    private LocalDate birthDate;

    public Part20_DateTime(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}