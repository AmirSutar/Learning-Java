package Inheritance;

public class Truck extends Car{

	public static void main(String[] args)
	{
		Truck key = new Truck();
		key.start();
		key.speedLock();
		key.sensor();
		key.Stoped();
	}
	public void LoadCapacity()
	{
	System.out.println("Set to Load carring Mode");	
	}
	

}
