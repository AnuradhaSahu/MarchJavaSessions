package Abstraction;

public class LoginPage extends Page {
	
	//default constrcutor
	//child class constructor
	public LoginPage() {
		System.out.println("LP constuctor");
	}

	@Override
	public void title() {
System.out.println("LP-Title");		
	}

	@Override
	public void header() {
		System.out.println("LP-Header");		
		
	}
	public void doLogin() {
		System.out.println("Login Done");
	}
  }
