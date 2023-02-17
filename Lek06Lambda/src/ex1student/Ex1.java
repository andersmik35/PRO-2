package ex1student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

	public static void main(String[] args) {
		List<Person> list = List.of(
				new Person("Bent", 25), new Person("Susan", 34),
				new Person("Mikael", 60), new Person("Klaus", 44),
				new Person("Birgitte", 17), new Person("Liselotte", 9));
		ArrayList <Person> persons = new ArrayList<Person>(list);
		System.out.println(persons);
		System.out.println();



//		Den første person der hedder Klaus
//		System.out.println(findFirst(persons, p -> p.getName().equals("Klaus")));
//		Den første person der har et navn med længden 4
//		System.out.println(findFirst(persons, p -> p.getName().length() ==4 ));

//		Indsæt kode herunder der kalder metoderne findFirst og findAll som beskrevet i opgave 1


		System.out.println(findFirst(persons,person -> person.getAge() == 44));

		System.out.println(findFirst(persons,person -> person.getName().contains("S")));

		System.out.println(findFirst(persons,person -> person.getName().split("i").length > 2));

		System.out.println(findFirst(persons,person -> person.getName().length() == person.getAge()));

		System.out.println(findAll(persons,person -> person.getName().contains("i")));

		System.out.println(findAll(persons,person -> person.getName().contains("S")));

		System.out.println(findAll(persons,person -> person.getName().length() > 5));

		System.out.println(findAll(persons,person -> person.getName().length() >= 6 && person.getName().length() > 40));





	}

	/**
	 * Returns from the list the first person
	 * that satisfies the predicate.
	 * Returns null, if no person satisfies the predicate.
	 */
	public static Person findFirst(List<Person> list, Predicate<Person> filter) {
		for (Person p : list) {
			if (filter.test(p))
				return p;
		}
		return null;
	}

	public static List<Person> findAll(List<Person> list, Predicate <Person> filter){
		List<Person> p1 = new ArrayList<>();
		for (Person p : list){
			if (filter.test(p))
				p1.add(p);
		}
		return p1;
	}



}
