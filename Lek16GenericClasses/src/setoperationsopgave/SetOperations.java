package setoperationsopgave;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
		Set<T> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}

	public static <T> Set<T> differens(Set<T> s1, Set<T> s2) {
		Set<T> result = new HashSet<>(s1);
		result.removeAll(s2);
		return result;

	}

	public static <T> Set<T> intesection(Set<T> s1, Set<T> s2) {
		Set<T> result = new HashSet<>(s1);
		result.retainAll(s2);
		return result;

	}

}
