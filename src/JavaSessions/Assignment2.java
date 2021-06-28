package JavaSessions;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * WAP to print following output:
         I am Batman

         I am Batman

         I am Batman

         I am Batman

         I am Batman
	 */
		for(int i=0;i<10;i++) {
			System.out.println("I am Batman");
			i++;
			}
		System.out.println("-------------");
/*
 * WAP to print following output:
I am Batman 1

I am Batman 2

I am Batman 3

I am Batman 4

I am Batman 5

I am Batman 6

I am Batman 7

I am Batman 8

I am Batman 9
 */
		for(int m=1;m<10;m++) {
			System.out.println("I am Batman "+m);
		}
		
		System.out.println("-------------");
	//	WAP to print 10 to 1 using for, while and do-while loop
		
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		System.out.println("------------------");
		int j=10;
		while(j>=1){
			System.out.println(j);
			j--;
		}
		System.out.println("------------------");
		int k=10;
		do {
			System.out.println(k);
			k--;
		}while(k>=1);
	
	//WAP in Java to print "Hello World" ten times using while loop
		for(int n=1;n<=10;n++) {
			System.out.println("Hello world");
		}
		System.out.println("------------------");
	
 //wap in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		int a=1;
		while(a<=10) {
			System.out.println(a);
			a++;
			if(a%7==0) {
				break;
				}
		}
		System.out.println("------------------");
//Data Types
/*
 * Write a Java program to print 'Hello' on screen and then print your name on a separate line.
Expected Output :
Hello 
Naveen K	
 */
		System.out.println("Hello\nAnu");
		System.out.println("------------------");
/*
 *  Write a Java program to print the sum of two numbers. 
Test Data: 
74 + 36 
Expected Output :
110
 */
		int q=74;
		int w=36;
		int e=q+w;
		System.out.println(e);
		System.out.println("------------------");
/*Write a Java program to divide two numbers and print on the screen. 
 * Test Data : 
50/3
Expected Output :
16
 */
		int r=50;
		int t=3;
		int y=r/t;
		System.out.println(y);
		System.out.println("-------------------");
/*
 * Write a Java program to print the result of the following operations. Change your test data accordingly.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9 
c. 20 + -3*5 / 8 
d. 5 + 15 / 3 * 2 - 8 % 3 
Expected Output :
43 
1 
19 
13
 */
		System.out.println(-5 + 8 * 6);
		System.out.println((55+9) % 9);
		System.out.println(20 + -3*5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		System.out.println("---------------------");
/*
 * Write a Java program to compute the specified expressions and print the output. Go to the editor
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
Expected Output
2.138888888888889
 */
	System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) );
	System.out.println("---------------------");

/*
 * Try to concat "Hello Selenium" with a character 't'.
 */
	System.out.println("hello"+"t"+"Selenium");
	System.out.println("---------------------");
/*
 *  Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
"Your Toal amount is. 3700".
 */
	int u=100;
	int o=200;
	int p=3400;
	int s=u+o+p;
	System.out.println("Your Total amount is "+s);
	System.out.println("---------------------");
/*
 * What should be the output for :

byte b3 = 065; 

System.out.println(b3);
 */byte b3 = 053; 

System.out.println(b3);

//Conditional Operators:
/*
 * Take three numbers from the user and print the greatest number. 

Test Data
Input the 1st number: 25 
Input the 2nd number: 78 
Input the 3rd number: 87
Expected Output :
The greatest: 87
 */
Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
System.out.print("Enter first number- ");
int num1= sc.nextInt();
System.out.print("Enter second number- ");
int num2= sc.nextInt();
System.out.println("Enter 3rd number- ");
int num3=sc.nextInt();
if(num3>num2) {
	System.out.println("The greatest is "+num3);
	}else{
	System.out.println("num2 is greatest"+num2);
}
System.out.println("--------------------");
/*
 * Write a Java program to test a number is positive or negative.
Test Data
Input number: 35 -- positive number
Input number: -11 -- negative number
 */
int number1=35;
int number2=-11;
if (number2>0){
	System.out.println("positive number");	
}else {
	System.out.println("negative number");
}
}
}
