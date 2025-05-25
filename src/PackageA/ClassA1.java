package PackageA;

//import PackageC.ClassC1; //---------> Reverse Number series method called
//import PackageC.ClassC2; //---------> Can not be called due to Static void of method

//import PackageB.ClassB1; //---------> 1 to 5  series method called
//import PackageB.ClassB2; //---------> Even Number series method called

public class ClassA1 {

	public static void main(String[] args) {

		//ClassA2 FiboSeries = new ClassA2(); //---------> Fibonacci series method called
		//FiboSeries.Fibo();                  //---------> Fibonacci series method called
		
		//ClassB1 NumSeries = new ClassB1();  //---------> 1 to 5  series method called
		//NumSeries.OneToTen();               //---------> 1 to 5  series method called
		
		//ClassB2 EvenNum = new ClassB2();    //---------> Even Number series method called
		//EvenNum.DivisibleBy2();             //---------> Even Number series method called 
		
		//ClassC1 rev = new ClassC1();        //---------> Reverse Number series method called
		//rev.reversenumber();                //---------> Reverse Number series method called
		
		//ClassC2.isPrime(0);                 //---------> Can not be called due to Static void of method
		
		
	}

}
