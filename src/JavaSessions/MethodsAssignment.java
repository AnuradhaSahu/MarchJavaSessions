package JavaSessions;

import java.util.Scanner;

public class MethodsAssignment {
	
 final double pi=3.14;
	public int sum(int a,int b) {
		int c=a+b;
		return c;
	}
	public int product(int d,int e) {
		int pro=d*e;
		return pro;
	}
	public double AreaOfCircle(double radius,double Area) {
		Area=pi*(radius)*(radius);	
		return Area;
	}
	public double CircumferenceOfCircle(double rad,double Circumference) {
		Circumference=2*pi*rad;
		return Circumference;
	}
	public void MaxMin(int a1,int b1,int c1) {
		if(b1>(c1&a1)) {
			System.out.println("b1 is maximum");
		}else if(a1>(b1&c1)){
			System.out.println("a1 is max");
		}else
			System.out.println("Min value ");
		}
	public int EligibletoVote(int eligibleage) {
		if(eligibleage>18) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("not eligible");
		}
		return eligibleage;
	}
	public int prime(int number) {
		if(number%number==0 && number/1==0)
			System.out.println("Prime Number");
		else
			System.out.println("Not a prime number");
		return number;
	}
//	public String grades(int marks) {
//		if(marks>=91 ||marks<=100) {
//			return AA;
//		}else if(marks>=81 ||marks<91) {
//			System.out.println("AB");
//		}else if(marks>=71 ||marks<81) {
//			System.out.println("BB");
//		}else if(marks>=61 ||marks<71) {
//			System.out.println("BC");
//		}else if(marks>=51 ||marks<61) {
//			System.out.println("CD");
//		}else if(marks>=41 ||marks<51) {
//			System.out.println("DD");
//		}else {
//			System.out.println("Fail");
//		}
//		return marks;
//	}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.Write a program to print the sum of two numbers entered by user by defining your own method.
		
		MethodsAssignment a= new MethodsAssignment();
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter first number- ");
		int num1= sc.nextInt();
		System.out.println("enter 2nd number-");
		int num2=sc.nextInt();
		System.out.println("Sum of 2 numbers "+a.sum(num1, num2));
		System.out.println("________________________________");

//2. Define a method that returns the product of two numbers entered by user.
		MethodsAssignment b=new MethodsAssignment();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 1st number-");
		int n1=sc1.nextInt();
		System.out.println("Enter 2nd number-");
		int n2=sc1.nextInt();
		System.out.println("Product of 2 numbers "+b.product(n1, n2));
		System.out.println("________________________________");
//3.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
//Answer
		MethodsAssignment aoc= new MethodsAssignment();
        Scanner s=new Scanner(System.in);
        System.out.println("enter Radius-");
        double d=sc.nextDouble();
        System.out.println("Area of circle defined by user is "+aoc.AreaOfCircle(d, d));
        System.out.println("Circumference of circle is "+aoc.CircumferenceOfCircle(d, d));		
		System.out.println("________________________________");

//4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
		MethodsAssignment mm= new MethodsAssignment();
        Scanner s1=new Scanner(System.in);
        int M1=s1.nextInt();
        System.out.println("Enter 1st number for comparison");
        int M2=s1.nextInt();
        System.out.println("Enter 2nd number for comparison");
        int M3=s1.nextInt();
        System.out.println("Enter 3rd number for comparison");
       // System.out.println("The minimum and maximum number is "+mm.MaxMin(M1, M2, M3));
        
		System.out.println("________________________________");

//5. Define a program to find out whether a given number is even or odd.	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int even=scan.nextInt();
		if(even%2==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
		
		System.out.println("________________________________");

//	6. A person is elligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote.
		
		MethodsAssignment age= new MethodsAssignment();
        Scanner S=new Scanner(System.in);
        int Vote=S.nextInt();
        System.out.println("The age of the voter is :"+age.EligibletoVote(Vote));
        
		System.out.println("________________________________");
//	7. Define a method to find out if number is prime or not.
		MethodsAssignment prime= new MethodsAssignment();
        Scanner p=new Scanner(System.in);
        int no=S.nextInt();
        System.out.println("The number entered by user is "+prime.prime(no));
        
		System.out.println("________________________________");

//	8. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//		Marks        Grade
//		91-100         AA
//		81-90          AB
//		71-80          BB
//		61-70          BC
//		51-60          CD
//		41-50          DD
//		<=40          Fail
		
		MethodsAssignment stumark= new MethodsAssignment();
        Scanner s3=new Scanner(System.in);
        System.out.println("Enter student marks");
        int mark=s3.nextInt();
        //System.out.println("The student obtained the grade  :"+stumark.grades(mark));
        
		System.out.println("________________________________");



	}

}
