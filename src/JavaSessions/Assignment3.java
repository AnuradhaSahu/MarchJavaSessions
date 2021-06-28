package JavaSessions;
import java.util.ArrayList;
import java.util.Collections;
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Write a program to print the following pattern using for loop:

00 01 02 03 04 05 06 07 08 09 
10 11 12 13 14 15 16 17 18 19 
20 21 22 23 24 25 26 27 28 29 
30 31 32 33 34 35 36 37 38 39 
 */
		for(int i=0;i<4;i++) {
			int k=i*10;
			for(int j=0;j<10;j++) {
				System.out.printf("%02d ", j+k);
			}
			System.out.println("\n");
		}
System.out.println("----------------------------------------");
/*
 * WAP to print the following pattern
 * 000 001 002 003 004
 * 005 006 007 008 009
 * 010 011 012 013 014
 */
for(int m=0;m<=4;m++) {
	for(int n=0;n<=4;n++) {
		for(int o=0;o<=4;o++) {
			System.out.print(m+""+n+""+o+" ");
		}
		System.out.println();
	}
}
System.out.println("-----------------------------------------");
for(int q=0;q<4;q++) {
	int w=q*10;
	for(int e=0;e<4;e++) {
		System.out.printf("%03d ",e+w);
	}
	System.out.println("\n");
}
/*
 *  Write a program to create a static Array, having following cricket data:
--name, age, team name, DOB, gender, Strike Rate
--Try to create multiple Object Arrays for different players 
--Try to print all the values of each player on the console
 */
	Object CricketData[]=new Object[7];
	CricketData[1]="Rakesh";
	CricketData[2]=32;
	CricketData[3]="MumbaiIndians";
	CricketData[4]="1-08-1987";
	CricketData[5]='M';
	CricketData[6]=50.7;
	for(Object e:CricketData) {
		System.out.println(e);
	}
	Object CricketData1[]=new Object[7];
	CricketData1[1]="Robin";
	CricketData1[2]=32;
	CricketData1[3]="CSK";
	CricketData1[4]="1-08-1987";
	CricketData1[5]='M';
	CricketData1[6]=50.7;
	for(Object e1:CricketData1) {
		System.out.println(e1);
	}	
System.out.println("----------------------------------------");
	
/*
 * Try to print the following pattern on the console:
n = 4
n = 3
n = 2
n = 1
n = 0
 */
		System.out.println("n=4\nn=3\nn=2\nn=1\nn=0");
		System.out.println("----------------------------------------");
	
// ArrayList:
//1. Write a Java program to create a new array list, add some colors (string) and print out the collection
ArrayList<String> colors=new ArrayList<String>();
colors.add("Pink");
colors.add("Red");
colors.add("Black");
colors.add("Orange");
for(String e:colors) {
	System.out.println(e);
}
System.out.println("----------------------------------------");

//2. Write a Java program to insert an element into the array list at the first and last positions.
ArrayList<String> col=new ArrayList<String>();
col.add("Pink");
col.add("Red");
col.add("Black");
col.add("Orange");
System.out.println(col.get(0));
col.remove(0);
System.out.println(col.get(0));
col.add(0,"first");
System.out.println(col.get(0));
col.remove(3);
col.add(3,"Last");
System.out.println(col.get(3));
System.out.println("----------------------------------------");

//3. Write a Java program to retrieve an element (at a specified index) from a given array list.
ArrayList<String> color=new ArrayList<String>();
color.add("Pink");
color.add("Red");
color.add("Black");
color.add("Orange");
System.out.println(color.get(2));
System.out.println("----------------------------------------");

//4. Write a Java program to update specific array element by given element.

int in[]=new int[5];
in[0]=10;
in[1]=50;
in[2]=20;
in[3]=30;
in[4]=40;
in[2]=409;
for(int h:in) {
	System.out.println(h);
}

System.out.println("----------------------------------------");


//5. Write a Java program to remove the third element from a array list. 

ArrayList<Integer> i=new ArrayList<Integer>();
i.add(10);
i.add(20);
i.add(30);
i.add(40);
i.add(50);
System.out.println(i.size());
i.remove(2);
for(int e:i) {
	System.out.println(e);
}
System.out.println("----------------------------------------");

//6. Write a Java program to search an element in a array list.
ArrayList ar=new ArrayList();
ar.add("ANU");
ar.add("Robin");
ar.add("Pihu");
ar.add("Sonu");
System.out.println(ar.get(2));
System.out.println("----------------------------------------");

//7. Write a Java program to reverse elements in a array list
ArrayList aL=new ArrayList();
aL.add("ANU");
aL.add("Robin");
aL.add("Pihu");
aL.add("Sonu");
for(int L=aL.size()-1;L>=0;L--) {
	System.out.println(aL.get(L));
}
System.out.println("----------------------------------------");

//8. Write a Java program to extract a portion of a array list.
ArrayList<String> a2=new ArrayList<String>();
a2.add("Test");
a2.add("RobinTest");
a2.add("PihuTest");
a2.add("SonuTest");
a2.add("New");
for(int o=2;o<=a2.size()-1;o++) {
	System.out.println(a2.get(o));
}
System.out.println("----------------------------------------");

//9. Write a Java program of swap two elements in an array list.
ArrayList<String> a1=new ArrayList<String>();
a1.add("Test");
a1.add("RobinTest");
a1.add("PihuTest");
a1.add("SonuSwap");
System.out.println("Before swap");
for(String sw:a1) {
	System.out.println(sw);
}
Collections.swap(a1, 0, 3);
System.out.println("After swap");
for(String sw1:a1) {
	System.out.println(sw1);
}

System.out.println("----------------------------------------");

//10. Write a Java program to empty an array list.
ArrayList<String> arr=new ArrayList<String>();
arr.add("ANU");
arr.add("Robin");
arr.add("Pihu");
arr.add("Sonu");
arr.removeAll(arr);
for(String s1:arr) {
	System.out.println(s1);
}
System.out.println("----------------------------------------");

//11. Write a Java program to trim the virtual capacity of an array list the current list size.
ArrayList<String> AL=new ArrayList<String>();
AL.add("ANU");
AL.add("Robin");
AL.add("Pihu");
AL.add("Lisa");
AL.add("Jhon");
AL.trimToSize();//trims teh size of VC

for(String s:AL) {
	System.out.println(s);
}
System.out.println("----------------------------------------");

//12. Write a Java program to print all the elements of a ArrayList using the position of the elements
ArrayList<String> emp=new ArrayList<String>();
emp.add("TOM");
emp.add("Robin");
emp.add("Harry");
emp.add("Rakesh");
System.out.println(emp.get(0));
System.out.println(emp.get(1));
System.out.println(emp.get(2));
System.out.println(emp.get(3));
System.out.println("----------------------------------------");
}
}
