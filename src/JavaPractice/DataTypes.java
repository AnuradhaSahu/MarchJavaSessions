package JavaPractice;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
/*
 * Write a Java program to convert temperature from Fahrenheit to Celsius degree. Go to the editor
Test Data
Input a degree in Fahrenheit: 212
 */
//		Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the farenhiet temprature");	
//       double Fahrenheit= sc.nextDouble();
//       
//       double celcius=(5*(Fahrenheit-32)/9);
//       System.out.println("The equvalent celcius is "+celcius);
/*
 * Write a Java program that reads a number in inches, converts it to meters. Go to the editor
Note: One inch is 0.0254 meter.
Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters
 */
//   	Scanner sc1=new Scanner(System.in);
//    System.out.println("Enter the number in inches");	
//    double meter= sc1.nextDouble();
//       
//       double inch=(meter*0.0254);
//       System.out.println("The Equivalent meter conversion is "+inch);
   
 /*
  * Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. Go to the editor

Test Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16
  */
//		Scanner sc1=new Scanner(System.in);
//	    System.out.println("Input an integer between 0 and 1000:");	
//        int num=sc1.nextInt();
//        int firstdigit=num%10;
//        int remianingnumber=num/10;
//        int seconddigit=num%10;
//         remianingnumber=num/10;
//         int thrddigit=num%10;
//          remianingnumber=num/10;
//          int fourhdigit=num%10;
//          remianingnumber=num/10;
//          int sum=firstdigit+seconddigit+thrddigit+fourhdigit;
//          System.out.println(sum);
//          
 /*
  * Write a Java program to convert minutes into a number of years and days. Go to the editor

Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days
  */
          
          Scanner sc=new Scanner(System.in);
  	      System.out.println("number of minutes");	
          double minutesInaYear=60 * 24 * 365;
          double min=sc.nextDouble();
          long year=(long)(min/minutesInaYear);
          long day=(long)(min/60/24)%365;
          System.out.println("year "+year);
          System.out.println("day "+day);

          
		
	}

}
