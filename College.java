package week3.day1;

public class College extends University {

	public void ug()
	{
	System.out.println("UG");	
	}
	
	public static void main(String args[])
	{
		College obj = new College();
		obj.pg();
		obj.ug();
		
	}
}
