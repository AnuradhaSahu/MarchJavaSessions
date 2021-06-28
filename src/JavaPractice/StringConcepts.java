package JavaPractice;

public class StringConcepts {

	public static void main(String[] args) {

		String s1="java";
		String s2="java";
		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1==s2);
		System.out.println(s2);
		
		System.out.println("=======================================");
		//string to int conversion-using parser

		String x="100";
		System.out.println(x+20);//10020
		int  i=Integer.parseInt(x);//Integer is a Integer wrapper class
		System.out.println(i);
		System.out.println(i+20);//120
		
		//String to double conversion
		
		String a="12.34";
		System.out.println(a+10);
		double d=Double.parseDouble(a);
		System.out.println(d+10);
		
		//String to boolean-reading data from properties file in headless mode
		
		String headless="true";
		boolean b=Boolean.parseBoolean(headless);
		if(b)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		//String to char
		String ch="P";
		char c1=ch.charAt(0);
		System.out.println(c1);
		
		//int to string
		int total=200;
		System.out.println(total+20);
		String st=String.valueOf(total);
		System.out.println(st+90);
		
		//int to double
		int doubl=12;
		double d1=doubl;
		System.out.println(d1);
		
		//int to boolean
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
