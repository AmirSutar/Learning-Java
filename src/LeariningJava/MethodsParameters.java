package LeariningJava;

public class MethodsParameters {

	public static void main(String[] args) {

		MethodsParameters cal = new MethodsParameters();
		System.out.println("Addition is " + cal.calulate(3,5));

	}

	public int calulate(int x, int y) 

	{

		return(x+y);
		//System.out.println("Addition is " +(x+y));

	}

}
