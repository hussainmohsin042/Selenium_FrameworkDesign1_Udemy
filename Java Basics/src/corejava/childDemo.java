package corejava;

public class childDemo extends parentDemo {
	
	String name="QA Click Academy";
	
	
	public childDemo()
	{
		super();//This should be the first line
		System.out.println("I am child class constructor");
	}
	
	public void getstringdata()
	{
		System.out.println(name);
		System.out.println(super.name);
		
	}
	
	public void getData()
	{
		
		super.getData();
		System.out.println("I am child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childDemo cd=new childDemo();
		cd.getData();
		cd.getstringdata();
		
		
	}

}
