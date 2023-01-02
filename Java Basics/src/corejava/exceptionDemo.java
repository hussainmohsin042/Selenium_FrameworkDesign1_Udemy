package corejava;

public class exceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int b = 7;

		// int c = 0;

		try {

			// int k = b / c;

			// int arr[] = new int[5];
			// System.out.println(arr[6]);
		}

		catch (ArithmeticException et) {
			System.out.println("I cathced the ArithmeticException/error");
		}

		catch (IndexOutOfBoundsException eob) {
			System.out.println("I cathced the Index out of bound exception/error");
		}

		catch (Exception e) {
			System.out.println("I cathced the exception/error");
		}

		finally

		{
			// This block is executed irrespective of the exception thrown or not
			System.out.println("Deleting the cookies");

		}

	}

}
