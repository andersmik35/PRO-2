package opgave2;

public class Main {

    public static void main(String[] args) {
        PersonAdmin personAdmin = PersonAdmin.getUniqueInstance();

        Person person = new Person("Anders",12);
        Person person1 = new Person("Emil",14);
        Person person2 = new Person("Lasse",16);
        Person person3 = new Person("Gostav",18);

        personAdmin.add(person);
        personAdmin.add(person1);
        personAdmin.add(person2);
        personAdmin.add(person3);

        System.out.println(personAdmin.getPersons());




    }



}
