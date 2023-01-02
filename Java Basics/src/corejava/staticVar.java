package corejava;

public class staticVar {

	String name; //Instance Variables

	String address;

	static String city;
	
	static int i;
	
	static
	{
		city="Srinagar";
		i=0;
	}

	public staticVar(String name, String address) {

		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
			}

	public void getaddress() {
		System.out.println(name+" "+city);
		// return address;
	}
	
	public static void getcity()
	{
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staticVar obj = new staticVar("Mohsin", "Jammu and Kashmir");

		staticVar obj1 = new staticVar("Sam", "Jammu and Kashmir");
		
		staticVar obj2 = new staticVar("Ansar", "Jammu and Kashmir");

		obj.getaddress();
		obj1.getaddress();
		obj2.getaddress();
		staticVar.getcity();
		staticVar.i=4;
		obj.address="Delhi";

	}

}
