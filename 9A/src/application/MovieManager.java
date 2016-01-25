package application;

import java.util.ArrayList;


public class MovieManager {

	public static void main(String[] args) {

		Person a1 = new Person();
		a1.setFirstName("Leonardo");
		a1.setLastName("Dicaprio");
		a1.setGender(Gender.MALE);
		a1.setHasOscar(false);
		a1.setHasGoldenGlobe(true);

		Person a2 = new Person();
		a2.setFirstName("Kate");
		a2.setLastName("Winslet");
		a2.setGender(Gender.FEMALE);
		a2.setHasOscar(true);
		a2.setHasGoldenGlobe(true);

		Movie m1 = new Movie();
		m1.setTitle("Titanic");
		m1.setGenre(Genre.DRAMA);
		m1.setDuration((long) 180);
		m1.setRate(5.0);
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(a1);
		persons.add(a2);
		m1.setCast(persons);

		System.out.println(m1.toXMLString(a1.toXMLString(), a2.toXMLString()));
		// System.out.println(m1.toXMLString());
		
		//System.out.println(Tools.countMoviesPerPerson(movies)));

	}
}
