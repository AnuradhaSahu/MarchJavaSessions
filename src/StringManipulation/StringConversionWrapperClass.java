package StringManipulation;

public class StringConversionWrapperClass {
	/*
	 * On top of prmitive data types we have Integer,Boolean,String,Double these are wrapper classes
	 * starts with capital letter
	 * In arraylist generics we have to use wrapper class
	 * ArrayList<Integer> ar= new ArrayList<Integer>();
	 */

	public static void main(String[] args) {

		String s1="Java";
		String s2="Java";
		System.out.println(s1);
		System.out.println(s2);
		s2="Java selenium";
		System.out.println(s2);
		
		String x="100";
		System.out.println(x+20);//10020
		//String to int parser
		int i=Integer.parseInt(x);
		System.out.println(i+20);//120
		
		String y="100A";
		//int j=Integer.parseInt(y);// number format exception as it cannot convert- A
		System.out.println(y+10);
		
		//String to double
		String v="12.33";
		System.out.println(v+20);
		double d= Double.parseDouble(v);
		System.out.println(d+20);
		
		//String to boolean
		String headless="true";
		if(Boolean.parseBoolean(headless)) {
			System.out.println("Pass");
		}
		
		//int to string
		int total=200;
		System.out.println(total+20);
		String str=String.valueOf(total);
		System.out.println(str+20);
	}

}
