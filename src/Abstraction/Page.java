package Abstraction;

public abstract class Page {
		/*abs class can have abs methods as well as non abstract methods
	we cannot create object of abstract methods
	1.partial abstraction
	2.100%abstraction
	3.0% abtraction
	
	 */
	 
	
	public abstract void title();
	public abstract void header();
	public  void timeout() {
		System.out.println("page timeout is 20 sec");
	}
	public final void logo() {
		System.out.println("App logo");
	}
	//we can create constrcutor of abstract class-we cannot create object but we can create const
	//abs class constrcutor will be called when we create object of child class
	public Page() {
		System.out.println("Page constrcutor");
	}


}
