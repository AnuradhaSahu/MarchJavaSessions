package StringManipulation;

public class StringManipulation {
	/*String is a class used to store data in ""
	 * it is a collection of different characters
	 * it internally maintains an array
	 * 
	 */

	public static void main(String[]args) {
	String str="This is my java code and i am so happy";
	//length of the string
	System.out.println(str.length());
	
	//last index of the string
	System.out.println("li="+0);
	
	//highest index of the string
	System.out.println("hi="+(str.length()-1));
		
	//character at specific index of the string
	System.out.println(str.charAt(8));
	
	//index of at specific character of the string from 0
	System.out.println(str.indexOf('j'));
	//index of at specific character of the string from specific index
	System.out.println(str.indexOf('m', 12));
	
	//this is hardcoded so generic formula for this is
	System.out.println(str.indexOf('i', str.indexOf('i')+1));
}
}
