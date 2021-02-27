package week3.day1;

public class Desktop implements Hardware, Software {

	public void desktopModel()
	{
		System.out.println("Desktop Model");
	}
	
	
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Software Resources");
	}
	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("HArdware resources");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Desktop obj = new Desktop();
	obj.softwareResources();
	obj.hardwareResources();
			
	}
}
