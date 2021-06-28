package InterviewKit1;

import java.util.Scanner;

public class JavaBasics {

	public static void main(String[] args) {

		//wap to print an integer(enetered by user)
//		Scanner sc=new Scanner(System.in);
//		System.out.println("please enetr a number");
//		int num=sc.nextInt();
//		System.out.println("eneterd num is "+num);
		
		//wap to add numbers
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		//wap to multiply 2 floating numbers
		float n1=12.90f;
		float n2=123.8f;
		float n3=n1*n2;
		System.out.println(n3);
		
		//wap to print ascii value of 'a'
		char c1='a';
		int acsii=c1;
		System.out.println(acsii);
		//or
		int asciinum=(int)c1;
		System.out.println(asciinum);
		
		//wap to compute quoteient n remainder
		int dividend=30;
		int divisor=6;
		int quotient=dividend/divisor;
		int remiander=dividend%divisor;
		System.out.println("quotient is "+ quotient);
		System.out.println("remiander is "+ remiander);
		
		//swap 2 numbers- with 3rd variable
		int num1=12;
		int num2=34;
		int temp=num2;
		num2=num1;
		num1=temp;
		System.out.println("num1 = "+num1 );
		System.out.println("num2 = "+num2 );
		
		//swap 2 numbers- without 3rd variable
		int n=10;
		int m=20;
		n=n-m;
		m=n+m;
		n=m-n;
		System.out.println("n" + n);
		System.out.println("m" + m);
		
		//even or odd number
//		Scanner sc=new Scanner(System.in);
//		System.out.println("please enter a number");
//		int number=sc.nextInt();
//		
//		if(number%2==0) {
//			System.out.println("number is even");
//		}else {
//			System.out.println("number is odd");
//		}
		
		//Vowels and consonents
		//a,e,i,o,u
		
		char ch='k';
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("vowel ");
		}
		else {
			System.out.println("consonent ");
		}
		
		//Vowels and consonents using switch case
		
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowels");
			break;
		default:
			System.out.println("consonent");
			break;
		}
		
		//largest among 3 numbers
		int x=100;
		int y=700;
		int z=300;
		
		if(x>y && x>z) {
			System.out.println("x is largest");
		}else if(y>x && y>z) {
			System.out.println("y is largest");
		}else {
			System.out.println("Z is largest");
		}
		//largest among 3 numbers if 2 numbers are same
		
		int a1=1100;
		int a2=1200;
		int a3=1100;
		
		if(a1>=a2) {
			if(a1>=a3) {
				System.out.println(a1+" is largest");
			}
		}else {
			if(a2>=a1) {
				System.out.println(a2+" is largest");
			}else {
				System.out.println(a3+" is largest");
			}
		}
		
		//leapyear or not
/*
 * divisible by 4 entury years ending with 00;
 * centuy yr is a leap year divisible by 400
 * 1900  not a leap year
 * 2012 lp
 * 		
 */

		int year=2020;
		boolean leap=false;
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					leap=true;
				}else {
					leap=false;
				}
			}else {
				leap=true;
			}
		}else {
			leap=false;
		}
		
		if(leap) {
			System.out.println("leap year");
		}else {
			System.out.println(" not a leap year");
		}
		

		
	//sum of all natural numbers
		int numbers=5;
		int sum=0;
		int sum1=0;
		
		for(int i=1;i<=numbers;i++) {
			sum=sum+i;
		}
		System.out.println(sum);

		//while loop
		int k=1;
		while(k<=sum) {
			sum1=sum1+k;
			k++;
		}
		System.out.println("sum is "+sum);
		
//factorial of a number
		/*
		 * factorial -!5=5*4*3*2*1
		 */
//		int nu=5;
//		int fact=1;
//		for(int i=1;i<=nu;i++) {
//			fact=fact*i;
//		}
//		System.out.println("factorial of "+ nu +" is "+fact);

		getFactorial(2);
		
//generate multiplication table
		int mulnum=2;
		
		for(int i=1;i<=10;i++) {
			System.out.println(mulnum + " x "+ i +"="+(mulnum*i));
		}
//fibonacci sries- sum of 1 n 2nd number=0,1,1,2,3,5,8,13,...
		int fib=10;
		int t1=0;
		int t2=1;
		
		for(int i=1;i<=fib;i++) {
			System.out.println(t1);
			int add=t1+t2;
			t1=t2;
			t2=add;
			
		}
		
//print characters from a-z
		for(char ch1 ='A';ch1<='Z';ch1++) {
			System.out.println(ch1+" ");
		}
		
		
//number of digits
		int numbr=1234589;
		int count=0;
		while(numbr!=0) {
			numbr=numbr/10;
			++count;
		}
		System.out.println("number of digits is"+count);
		
//reverse a number
		
		int numbrr=12345;
		int rev=0;
		while(numbrr!=0) {
			int q=numbrr%10;
			rev=rev*10+q;
			numbrr=numbrr/10;
		}
		System.out.println("reverse number is "+ rev);
		
		
//power of a number
		int base=2;
		int expo=3;
		
		long result=1;
		while(expo!=0) {
			result=result*base;
			--expo;
		}
		System.out.println(result);
		
//pallindrone-reverse is same

		int numb=1221;
		int revs=0;
		
		int actualnum=numb;
		while(numb!=0) {
			int p=numb%10;
			revs=revs*10 + p;
			numb=numb/10;
			}
		System.out.println(actualnum);
		
		if(actualnum==revs) {
			System.out.println("Pallindorme");
		}else {
			System.out.println("Not a Pallindorme");
		}
		
		
		
	}
	public static void getFactorial(int num) {
       int fact=1;
		//factorial of 0 is 1
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of "+ num +" is "+fact);

	}

}
