package coreJavaBrushUp;

import java.util.Arrays;

public class stringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String is an object //String Literals

		String s = "This is Mohsin Hussain";
		String s1 = "This is Mohsin Hussain";

		System.out.println(s);
		System.out.println(s1);

		// New

		String s2 = new String("Hussain");
		String s3 = new String("Hussain");

		String s4 = "My Name Is Mohsin Hussain";
		String[] splittedString = s4.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		System.out.println(splittedString[3]);
		System.out.println(splittedString[4]);

		for (int i = s4.length() - 1; i > 0; i--) {
			System.out.println(s4.charAt(i));

		}

	}

}
