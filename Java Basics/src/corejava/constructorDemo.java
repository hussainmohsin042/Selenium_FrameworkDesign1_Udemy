package corejava;

public class constructorDemo {
	
	
	 public constructorDemo()
	 {
	//	 
		 System.out.println("I am in the method Constructor!!!!!!!!!!!");
		 System.out.println("I am in the method Constructor Lecture 1!!!!!!!!!!!");
	 }
	 
	 public void getData()
	 {
		 
		 System.out.println("I am the method!!!!!!!!!!!");
	 }

	 public constructorDemo(int a, int b)
	 {
	//	 
		 System.out.println("I am in the Parameterized Constructor!!!!!!!!!!!");
		 int c=a+b;
		 System.out.println(c);
		 
	 }
	 
	 public constructorDemo(String str)
	 {
	//	 
		 System.out.println(str);
		 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Constructor
		
		constructorDemo cd=new constructorDemo();
		//constructorDemo pcd=new constructorDemo(2,6);
		//constructorDemo pcds=new constructorDemo("Hello");
		cd.getData();
		
		
	}

}

