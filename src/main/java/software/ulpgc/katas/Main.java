package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person person = new Person("Juan Carlos", LocalDate.of(1967,11,12));
        System.out.println(person.name() + " is " + person.age() + " years old.");
    }
}
