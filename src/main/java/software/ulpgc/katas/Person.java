package software.ulpgc.katas;

import java.time.LocalDate;

public record Person(String name, LocalDate birthday) {

    private static final int DAYS_PER_YEAR = 365;

    public int age(){
        return calculateYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    private int calculateYears(long days){
        return (int) (days/DAYS_PER_YEAR);
    }

}
