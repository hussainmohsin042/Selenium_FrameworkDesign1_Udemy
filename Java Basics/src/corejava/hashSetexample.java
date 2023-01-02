package corejava;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashSet, TreeSet, LinkedHashSet implements Set interface.

		HashSet<String> hs = new HashSet<String>();

		hs.add("Hussain");
		hs.add("Ilhan");
		hs.add("INDIA");
		hs.add("INDIA");
		hs.add("He");
		hs.add("She");

		System.out.println(hs);
		System.out.println(hs.remove("Hussain"));
		// hs.remove("Hussain");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());

		// Iterator:
		Iterator<String> i = hs.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
			System.out.println(i.next());
		}

	}

}
