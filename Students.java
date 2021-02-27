package week3.day1;

public class Students {

	int id;
	String studname="Nimmy";
	String studemail ="nj@test.com";
	String studphnumber = "9832344561";
			
	public void getStudentInfo(int id)
	{
	System.out.println("Student Info with Student ID " +id );
	System.out.println("Student Name: " +studname);
	System.out.println("Student Email: " +studemail);
	System.out.println("Student Phone: " +studphnumber);
	
	}
	public void getStudentInfo(int id, String name) {
	
		System.out.println("Student Info with ID: " +id+ " & Student Name: " +name);
	System.out.println("Student Email: " +studemail);
	System.out.println("Student Phone: " +studphnumber);
	}
	
	
	public void getStudentInfo(String email, String phoneNumber)
    {
	System.out.println("Student Info with Email: " +email+ " & Phone Number: " +phoneNumber);	
	System.out.println("Student Name: " +studname);
	System.out.println("Student Email: " +studemail);
		
	}
	
	public static void main(String args[])
	{
		Students obj = new Students();
		obj.getStudentInfo(5);
		obj.getStudentInfo(5, "Nimmy");
	    obj.getStudentInfo("nj@test.com", "9832344561");
	}
}
