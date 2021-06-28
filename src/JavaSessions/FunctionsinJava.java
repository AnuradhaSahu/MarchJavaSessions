package JavaSessions;

public class FunctionsinJava {
	/*
	 * Functions is used to write reusable code
	 * 1.we cannot create function insisde function
	 * 2.duplicate functions are not allowed
	 * 3.can be created inside class anywhere
	 * 4.cannot call a function implicitly
	 * 5.to call a function we need to create object of the class .
	 * 6.Types of function-
	 * a.no i/p no o/p
	 * b.no i/p some o/p
	 * c.some i/p some o/p
	 * d.some i/p no o/p
	 * 7.difference between parameter and argument-
	 * a.parameter -written inside function
	 * b.argument-passed ,when we create object to call funtcion inside class
	 * 8.we are calling funtcionby using CALL BY VALUE by passing the argument
	 * 9.functions are totally independent of each other
	 * 10.funtions are parallel to each other
	 * 
	 */

	public void test(){
		System.out.println("Test Method");
	}
	public String getname() {
		System.out.println("get name method");
		return "ANU";
	}
	public int add(int a,int b) {
		System.out.println("add method");
		int c=a+b;
		return c;
	}
	public void printinfo(String empname) {
	System.out.println("print info for emp name :"+empname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.No input  no return funtcion
		FunctionsinJava obj=new FunctionsinJava();
		obj.test();
//2.no i/p some o/p
		String name=obj.getname();
		System.out.println(name);
//3.some i/p n some o/p
		int s=obj.add(300, 400);
		System.out.println(s);
//4.some i/p no o/p
		obj.printinfo("HARRY");

	}
	

}
