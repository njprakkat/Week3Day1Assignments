package week3.day1;

public class Calculator {

	public void add(int a, int b)
	{
	int sum = a+b;
	System.out.println("SUM OF 2 INTEGER NUMBERS: " +a+ " & " +b + " IS: " +sum);
	}
	public void add(int a, int b, int c)
	{
	int sum = a+b;
	System.out.println("SUM OF 3 INTEGER NUMBERS: " +a+ " & " +b + " IS: " +sum);	
	}
	public void multiply(int a, int b)
	{
	int prod = a*b;
	System.out.println("PRODUCT OF 2 INTEGER NUMBERS: " +a+ " &" +b + " IS: " +prod);	
	}
	public void multiply(int a, double b)
	{
	double prod = a*b;
	System.out.println("PRODUCT OF INTEGER & DOUBLE NUMBER: " +a+ " & " +b + " IS: " +prod);	
	}
	public void subtract(int a, int b)
	{
	int diff = a-b;
	System.out.println("DIFFERENCE OF 2 INTEGER NUMBERS: " +a+ " & " +b + " IS: " +diff);	
	}
	public void subtract(double a, double b)
	{
	double diff = a-b;
	System.out.println("DIFFERENCE OF 2 DOUBLE NUMBERS: " +a+ " & " +b + " IS: " +diff);		
	}
	public void divide(int a, int b)
	{
	int div = a/b;
	System.out.println("DIVISION OF 2 INTEGER NUMBERS: " +a+ " & " +b + " IS: " +div);		
	}
	public void divide(double a, int b)
	{
	double div = a/b;
	System.out.println("DIVISION OF DOUBLE & INTEGER NUMBER: " +a+ " & " +b + " IS: " +div);			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Calculator obj = new Calculator();
	obj.add(5, 10);
	obj.add(5, 10, 15);
	obj.multiply(5, 10);
	obj.multiply(5, 2500);
	obj.subtract(10, 5);
	obj.subtract(5000, 2000);
	obj.divide(10, 5);
	obj.divide(2500, 5);
	}

}
