package JavaSessions;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1.Incremental operator-post,pre
		 * post-incremental-i++
		 * pre incremental= ++i
		 *2.decremental operator-post,pre
		 * post-Decremental-i--
		 * pre decremental= --i
		 */
		int a=1;
		int b=a++;
		System.out.println(a);
		System.out.println(b);
		int c=-98;
		int d=c++;
		System.out.println(c);
		System.out.println(d);
		
		int m=1;
		int n=++m;
		System.out.println(m);
		System.out.println(n);
		
		int x=2;
		int y=x--;
		System.out.println(x);
		System.out.println(y);
		
		double g=2.1;
		double h=--g;
		System.out.println(g);
		System.out.println(h);
		System.out.println("--------------------------------");
		/*
		 * Conditional Operators-<,>,<=,>=,==,!=,if-else
		 */
		int q=10;
		int w=20;
		if(q==w) {
		System.out.println("equal");
		}else {
			System.out.println("Not equal");
		}
		if(q<=w) {
			System.out.println("less than equal");
		}else {
				System.out.println("Not equal");
		}
		if(q>=w) {
			System.out.println("greater than equal");
		}else {
				System.out.println("Not equal");
		}
		if(q<w) {
			System.out.println("less than ");
			}else {
				System.out.println("Not equal");
		}
		if(q>w) {
			System.out.println("Greater");
			}else {
				System.out.println("Not equal");
			}
		if(q!=w) {
			System.out.println("Not equal");
			}else {
				System.out.println("equal");
			}
		String browser="chrome";
		if(browser.equals("chrome"))
		System.out.println("launch chrome");
		String browser1="chrome";
		if(browser1.equals("chrome"))
		System.out.println("launch chrome");
		else if(browser1.equals("IE"))
			System.out.println("launch IE");
		System.out.println("--------------------------------");
		
		String browzr="Chrome";
		switch (browzr) {
		case "Chrome": {
			System.out.println("launch chrome");
			break;
		}
		case "FF": {
			System.out.println("launch FF");
			break;
		}			
		default:
			System.out.println("Unexpected value: " + browzr);
		}
		
	}
}
