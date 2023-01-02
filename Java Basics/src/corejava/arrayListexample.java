package corejava;

import java.util.ArrayList;

public class arrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList<Integer> a = new ArrayList();

		ArrayList<String> b = new ArrayList();

		b.add("Mohsin");
		b.add("Mohsin");
		b.add("Ansar");
		// System.out.println(b);

		b.add(0, "Abeeha");

		System.out.println(b);

		// b.remove(1);

		// System.out.println(b);

		// b.remove("Ansar");

		// System.out.println(b);

		// b.removeAll(b);

		// System.out.println(b);

		b.get(1);
		System.out.println(b.get(1));

		System.out.println(b.contains("testing"));

		System.out.println(b.contains("Mohsin"));

		System.out.println(b.indexOf("Mohsin"));

		System.out.println(b.isEmpty());

		System.out.println(b.size());

	}

}
