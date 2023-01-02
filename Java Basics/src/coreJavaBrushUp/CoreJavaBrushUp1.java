package coreJavaBrushUp;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum = 5;

		String myStr = "Mohsin Hussain";

		float myflt = (float) 95.2;

		double mydbl = 99.25860;

		char mychr = 'B';

		// boolean bolt = true;

		// boolean bolf = false;

		System.out.println(myNum);
		System.out.println(myStr);
		System.out.println(myflt);
		System.out.println(mydbl);
		System.out.println(mychr);

		// Arrays:

		int a1[] = new int[5]; // Array Declaration, 1 Dimensional Array

		a1[0] = 1;
		a1[1] = 2;
		a1[2] = 3;
		a1[3] = 4;
		a1[4] = 5;

		System.out.println(a1[4]);

		System.out.println(a1[0]);

		int[] a2 = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < a2.length; i++) {
			System.out.println(a2[i]);
		}

		String[] str = { "Mohsin", "Ansar", "Ilhan" };

		for (int j = 0; j < str.length; j++) {

			System.out.println(str[j]);
		}

		for (String s : str) // Enhanced For Loop
		{
			System.out.println(s);

		}

	}

}
