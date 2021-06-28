package Abstraction;

public class TestLogin {

	public static void main(String[] args) {

		//creating obj of child class->it creates both parent and child class constructor 
		LoginPage lp=new LoginPage();
			lp.header();//inherited method
			lp.timeout();//inherited method
			lp.title();//inherited method
			lp.logo();//inherited method
			lp.doLogin();// individual method
			
			//Top casting
			Page p=new LoginPage();
			p.title();
			p.logo();
			p.header();
			p.timeout();
	}

}
