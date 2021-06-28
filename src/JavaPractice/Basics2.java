package JavaPractice;

import java.util.Scanner;

public class Basics2 {

	public static void main(String[] args) {

		//WAP to print an integer(entered by user)
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int number=sc.nextInt();
//		System.out.println("Entered number is "+number);
//		
//		//WAJP to add 2 integers
//		System.out.println("Enter 1st number");
//		int n1=sc.nextInt();
//		System.out.println("Enter 2nd number");
//		int n2=sc.nextInt();
//		int add=n1+n2;
//		System.out.println("The addition of 2 integers is "+add);
//		
		//WAJP to multiply  2 floating point numbers
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter 1st number");
//		float f1=s.nextFloat();
//		System.out.println("Enter 2nd number");
//		float f2=s.nextFloat();
//		float multiply=f1*f2;
//		System.out.println("The multiplication of 2 floating numbers is "+multiply);
//		

		//WAJP to find teh ASCII value of a character
//		char c='a';
//		int ascii=(int)c;// type casting
//		System.out.println("The ascii value of charcter a is"+ascii);
//		
//		char s='*';
//		int asc=(int)s;
//		System.out.println(asc);
		
		
		//WAJP to compute quotient and remiander
//		int a=10;
//		int b=2;
//		int quotient=a/b;
//		int Remiander=a%b;
//		System.out.println("The quotient is "+quotient);
//		System.out.println("The remiander is "+Remiander);
//		
//		//WAJP 	to swap 2 numbers
//		int a=10;
//		int b=20;
//		int c=0;
//		c=a;
//		a=b;
//		b=c;
//		System.out.println("n1 ="+a);
//		System.out.println("n2 ="+b);
		
		//WAJP to check if teh even or odd
//		int number=100;
//	
//		if(number%2==0) {
//			System.out.println("even");
//		}else {
//			System.out.println("odd");
//		}

		//WAJP to find if an alphabet is vowel or consonent
//		char c='p';
//		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
//			System.out.println("Vowels");
//		}else {
//			System.out.println("consonents");
//		}
//		
		//WAJP to find the largest among 3 numbers
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the 1st number");
//		int n1=sc.nextInt();
//		System.out.println("Enter the 2nd number");
//		int n2=sc.nextInt();
//		System.out.println("Enter the 3rd number");
//		int n3=sc.nextInt();
//		
//		if(n3>n1&&n3>n2) {
//			System.out.println("n3 "+n3+" is greatest among 3");
//		}else if(n2>n1 && n2>n3) {
//			System.out.println("n2 "+ n2 +" is greatest");
//		}else {
//			System.out.println("n1 "+n1+ " is greatest");
//		}
		
		//WAJP to find sq roots of a quadratic equation-Quadratic Equation: ax^2 + bx + c = 0
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a");
//		int a=sc.nextInt();
//		System.out.println("Enter b");
//		int b=sc.nextInt();
//		System.out.println("Enter c");
//		int c=sc.nextInt();
//		System.out.println("Enter x");
//		int x=sc.nextInt();
//		int equation=((a*x)^2+(b*x)+c);
//		System.out.println("The quadratic equation is "+equation);
//		int SQRTequation=((a*x)^2+(b*x)+c)^2;
//		System.out.println("The square root of quadratic equation is "+SQRTequation);
		
		/*WAJP to find all roots of Quadratic Equation: formula-[x =( -b + or - (square root (b^2 -4ac))/2a]
		 * 1. b2 −4ac < 0 There are no real roots.
		 * 2. b2 −4ac = 0 There is one real root.
		 * 3. b2 −4ac > 0 There are two real roots.
		 * We call the term b2 −4ac the discriminant. The discriminant is important because it tells you how many roots a quadratic function has.
		 */

		double a=12;
		double b=3.9;
		double c=6;
		double discriminant=((b*b)-(4*a*c));
		if (discriminant<0) {
			System.out.println(" b2 −4ac < 0 There are no real roots.");
		}else if(discriminant==0) {
			System.out.println(" b2 −4ac = 0 There is one real root.");
		}else {
			System.out.println(" b2 −4ac > 0 There are two real roots");
		}
		
		//WAJava Program to Find the Frequency of Character in a String
		String str="Writing Java code";
		char ch='i';
		int frequency=0;
		for(int i=0;i<str.length();i++) {
			if(ch==str.charAt(i)) {
				++frequency;
			}
		}
		System.out.println("frequency is "+frequency);
		
		//remove all white spaces from a string
		String s="learning Java ";
		System.out.println("orginal sentence:"+s);
		
		s=s.replaceAll("\\s", "");
		System.out.println("after replacement "+s);
		
		//Check if a string is empty or not
		String st="ok Test";
		String s1=" ";
		String s2="";
		if(st.isBlank()) {
			System.out.println("String is not empty");
		}else {
			System.out.println("String is empty");
		}
		
			
		
	}

}
