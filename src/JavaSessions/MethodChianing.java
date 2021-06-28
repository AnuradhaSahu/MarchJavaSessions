package JavaSessions;

public class MethodChianing {
/*
 * Method chaining means with in teh methods they can access each other no need to create object for that
 */
	//Infinite loop
	String name="chrome";
	public void launchbrowser() {
		System.out.println("Launch Browser"+name);
	}
	public void checkversion() {
		System.out.println("checkversion");
		checkoscompatible();
	}
	public void checkoscompatible() {
		System.out.println("checkoscompatible");
		checkRAMspace();
	}
	public void checkRAMspace() {
		System.out.println("checkRAMspace");
		checkversion();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodChianing m=new MethodChianing();
		m.checkversion();
		
	}

}
