package JavaSessions;

public class StaticBlock {
	/*
	 * Static block gets executed before main method
	 * we can have multiple sttic blcoks
	 */

	static {
		System.out.println("Static block 1");
	}
	static {
		System.out.println("Static block 2");
	}
	static {
		System.out.println("Static block 3");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method");
		
	}

}
