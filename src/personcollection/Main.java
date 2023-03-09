package personcollection;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        PersonCollection persons = new PersonCollection(16);

        Person p1 = new Person("Børge");
        Person p2 = new Person("Jens");
        Person p3 = new Person("Ok");
        Person p4 = new Person("Hej");

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        Iterator<Person> personIterator = persons.iterator();
        while (personIterator.hasNext()){
            persons.add(p4);
            System.out.println(personIterator.next());
        }
    }
}
