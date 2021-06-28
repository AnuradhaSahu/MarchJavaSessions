package JavaPractice;

import java.util.Scanner;

public class JavaBasicsI {

	public static void main(String[] args) {
/*
 * Write a Java program to display the following pattern. Go to the editor
Sample Pattern :

   J    a   v     v  a                                                  
   J   a a   v   v  a a                                                 
J  J  aaaaa   V V  aaaaa                                                
 JJ  a     a   V  a     a
 */
		
		System.out.println("  J    a   v     v  a ");
		System.out.println("  J   a a   v   v  a a ");
		System.out.println("J J  aaaaa   V V  aaaaa");
		System.out.println("JJ  a     a   V  a     a");

/*
 * Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output
2.138888888888889
 */
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
		
/*
 * Test Data:
Radius
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */
		double Radius=7.5;
		final double pi=3.14;
		double perimeter=(2*pi*Radius);
		System.out.println("Area of a circle with given radius is"+ (pi*Radius*Radius));
		System.out.println("The perimeter of a circle is "+perimeter);
		
/*
 * Write a Java program that takes three numbers as input to calculate and print the average of the numbers. Go to the editor
Click me to see the solution
//*/
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter 1st number");
//		int n1=sc.nextInt();
//		System.out.println("enter 2nd number");
//		int n2=sc.nextInt();
//		System.out.println("enter 3rd number");
//		int n3=sc.nextInt();
//		
//		double average=(n1+n2+n3)/3;
//		System.out.println(average);
		

/* Write a Java program to print the area and perimeter of a rectangle. Go to the editor
Test Data:
Width = 5.5 Height = 8.5
 */
		double Width = 5.5 ;
		double Height = 8.5;
		double areaofRectange=(Width*Height);
		double perimeterofrectange=2*(Height+Width);
		System.out.println(areaofRectange);
		System.out.println(perimeterofrectange);

/*
* Java program to print an American flag on the screen. Go to the editor
Expected Output

* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================
 */
		
		String p1="* * * * * * ==================================\n * * * * *  ==================================";
		String p2="==============================================";
		for(int i=0;i<10;i++) {
			System.out.println(p1);
		}
		for(int j=0;j<7;j++) {
			System.out.println(p2);
		}
		
/*
 * Write a Java program to swap two variables.	
 */
		int a=10;
		int b=20;
		int c=b;
		b=a;
		System.out.println("the value of a"+ c);
		System.out.println("the value of b"+ b);

/*
 * Write a Java program to print a face. Go to the editor
Expected Output

 +"""""+                                                 
[| o o |]                                                
 |  ^  |                                                 
 | '-' |                                                 
 +-----+	
 */
		System.out.println(" +\"\"\"\"\"+");
		System.out.println("[| o o |]");
		System.out.println(" |  ^  |");
		System.out.println(" | '-' |");
		System.out.println(" +-----+");

		//Using Array
		String[] array=new String[5];
		
		array[0]="  +\"\"\"\"\"+";
		array[1]=" [| o o |]";
		array[2]="  |  ^  |";
		array[3]="  | '-' |";
		array[4]="  +-----+";
		
		for(int i=0;i<5;i++) {
			System.out.println(array[i]);
		}
/*
 *  Write a Java program to reverse a string. Go to the editor
 * Input a string: The quick brown fox
 */
//		String input="The quick brown fox";
//		Scanner sc1=new Scanner(System.in);
//		System.out.println("Enter the string");
//		char[] letters=sc1.nextLine().toCharArray();
//		System.out.println("Reverse string is ");
//		for(int i=letters.length-1;i>=0;i--) {
//			System.out.print(letters[i]);
//		}
//		System.out.print("\n");
		
/*
 * Write a Java program to count the letters, spaces, numbers and other characters of an input string.
 *Expected Output

The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23                                               
space: 9                                                 
number: 10                                               
other: 6
 */
		String s=" Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		count(s);		
		
		
	}
	
	public static void count(String x) {
		char[] ch=x.toCharArray();
		int letter=0;
		int space=0;
		int number=0;
		int other=0;
		
		for(int i=0;i<x.length();i++) {
			if(Character.isDigit(ch[i])) {
				letter++;
			}
			else if(Character.isDigit(ch[i])) {
				number++;
			}else if(Character.isDigit(ch[i])) {
				space++;
			}else {
				other++;
			}
		}
		
		System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
		System.out.println("letters "+letter);
		System.out.println("space "+space);
		System.out.println("numbers "+number);
		System.out.println("others "+other);

	}

}
