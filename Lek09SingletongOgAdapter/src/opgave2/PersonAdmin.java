package opgave2;

import java.util.*;
import java.util.function.Consumer;

public class PersonAdmin {

    private static PersonAdmin uniqueInstance;

    private static Set<Person> persons = new HashSet<>();

    private PersonAdmin() {

    }

    public static PersonAdmin getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new PersonAdmin();
        }
        return uniqueInstance;
    }


    public void add(Person p) {
        if (!persons.contains(p)) {
            persons.add(p);

        }
    }


    public Set<Person> getPersons() {
        return persons;
    }



}
