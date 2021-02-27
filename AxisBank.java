package week3.day1;

public class AxisBank extends BankInfo{
	
	
	public void deposit(int dep)
	{
	System.out.println(" Deposit Info for Axis Bank: " +dep);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AxisBank obj = new AxisBank();
		obj.deposit(2000);
		
	}

}
