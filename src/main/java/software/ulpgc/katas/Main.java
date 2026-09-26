package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person person = new Person("Ismael", LocalDate.of(2006, 5,11));
        System.out.println(person.name() + " is " + person.age() + " years old.");
    }
}
