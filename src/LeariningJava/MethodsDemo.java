package LeariningJava;

public class MethodsDemo {

	public static void main(String[] args) {

		MethodsDemo log = new MethodsDemo();
		log.doLogin();
		log.doLogout();

	}

	public  void doLogin() {

		System.out.println("Login Successfull");

	}

	public void doLogout() {
		doLogin();
		System.out.println("Logout Successfull");
	}

}
