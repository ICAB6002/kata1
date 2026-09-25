package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ismael", LocalDate.of(2006,5,11));
        System.out.println(person.name() + " is " + person.age() + " years old.");
    }
}
