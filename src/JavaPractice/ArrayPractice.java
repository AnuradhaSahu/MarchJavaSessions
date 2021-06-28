package JavaPractice;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
//types of array-1.static array and 2.dynamic array
		//static array
		int i[]=new int[4];
		i[0]=12;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println("li "+i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		int len=i.length;
		System.out.println("length="+ len);
		System.out.println(len-1);
	//	System.out.println(i[-1]);

		//printing all the values of array
		for(int k=0;k<i.length;k++) {
			System.out.println(i[k]);
		}
		for(int e:i) {//for each
			System.out.println(e);
		}
		System.out.println("==============================================");
		double d[]=new double[3];
		d[0]=12.33;
		d[1]=13.22;
		d[2]=87.99;
		System.out.println(d.length);
		System.out.println(d[2]);

		for(double e:d) {
			System.out.println(e);
		}
		
		System.out.println("==============================================");
		char ch[] = new char[3];
		ch[0]='A';
		ch[1]='%';
		ch[2]='&';
		
		System.out.println(ch.length);
		System.out.println(ch[2]);
		
		for(char e:ch) {
			System.out.println(e);
		}
		
		for(int j=0;j<=ch.length-1;j++) {
			System.out.println(ch[j]);
		}
		
		System.out.println("==============================================");

		String sarray[]=new String[3];
		sarray[0]="Anu";
		sarray[1]="Sonu";
		sarray[2]="Monu";
		System.out.println(sarray.length);
		for(String e:sarray) {
			System.out.println(e);
			if(e.equals("Anu")) {
				System.out.println("She is a women");
			}
		}
		
		System.out.println("==============================================");

		Object ob[]=new Object[4];
		ob[0]="HASH";
		ob[1]="MASH";
		ob[2]="BASH";
		ob[3]="STASH";

		System.out.println(ob[2]);
		for(Object e:ob) {
			System.out.println(e);
		}
		System.out.println("==============================================");
	
//calculate average using arrays
	
		double average[]=new double[6];
		average[0]=100;
		average[1]=200;
		average[2]=300;
		average[3]=400;
		average[4]=500;
		average[5]=600;
		
		double sum=average[0]+average[1]+average[2]+average[3]+average[4]+average[5];
		
		double ave=sum/(average.length);
		System.out.println(ave);
		//using arrayliterals
		int av[]= {10,20,30,40,50,60};
		int total=0;
		for(int i1=0;i1<=av.length-1;i1++) {
			total=total+av[i1];
		}
		double averagee=total/av.length;
		System.out.println(averagee);
		
		System.out.println("==============================================");
//largest element of an array
		int ar[]= {23,45,78,90,100};
		int largest=ar[0];
		System.out.println(getlargest(ar,2));
		
		for(int num:ar) {
			if(largest<num) {
				largest=num;
			}
		}
		System.out.println(largest);
		System.out.println("==============================================");
		
//print an array
		String[] st= {"Test","Selenium","Java"};
		
		for(String e:st) {
			System.out.println(e);
		}
		System.out.println("==============================================");
//concatenate 2 arrays
		int[] i2= {10,20,30};
		int[] i3= {40,50,60};

		int i2len=i2.length;
		int i3len=i3.length;

        int[] resArray=new int [i2len+i3len];
        System.arraycopy(i2, 0, resArray, 0, i2len);
        System.arraycopy(i3, 0, resArray, i2len, i3len);

        System.out.println(Arrays.toString(resArray));
		System.out.println("==============================================");
 //check if an array contains any given value
		String[] st1= {"Test","Selenium","Java"};

		for(int j=0;j<st1.length;j++) {
			System.out.println(st1[j]);
			if(st1[j]=="Test") {
				System.out.println("Given element is present");
			}
		}
		System.out.println("==============================================");
//missing number in an array
		int arr[]= {1,2,3,4,6};
		int res1=0;
		
		//find sum of arr[]-10+20+30+40+60=160
		//find sum of arr[] -10+20+30+40+50+60=210
		//210-160=50
		for(int k=0;k<arr.length;k++) {
			res1=res1+arr[k];
		}
		System.out.println(res1);
		
		int res2=0;
		for(int l=1;l<=6;l++) {
			res2=res2+l;
		}
		System.out.println(res2);
		
		int missingno=(res2-res1);
		System.out.println(missingno+ " is the missing number");
		System.out.println("==============================================");
//duplicate elemnt in an array
		int arr1[]= {1,2,3,3,6};//bad solution as the time complexity is O(N*N)
		for(int a1=0;a1<arr1.length;a1++) {
			for(int a2=a1+1;a2<arr1.length;a2++) {
				
				if(arr1[a1]==(arr1[a2])){
				
				System.out.println("Duplicate value is :"+ arr1[a1]);
				}
			}
		}
		
//second solution-using hashmap and hasset
	
		System.out.println("==============================================");
//Largest and smallest number in an array
		int numbers[]= {10,20,-20,0,98089,-9990};
		int largest1=numbers[0];
		int smallest=numbers[0];
		
		for(int b=1;b<numbers.length;b++) {
			if(numbers[b] >largest1) {
				largest=numbers[b];
			}else if(numbers[b] <smallest) {
				smallest=numbers[b];
			}
		}
		System.out.println("\nThe given array is :"+Arrays.toString(numbers));
		System.out.println("largest number is :"+largest1);
		System.out.println("smallest number is :"+smallest);
		System.out.println("==============================================");
//swap 2 numbers
		int num1=1890;
		int num2=2008;
		
		int num3=0;
		num3=num2;
		num2=num1;
		num1=num3;
		System.out.println(num1);
		System.out.println(num2);

//swap without using 3rd integer
	System.out.println("Swapping using + - operator");
		int x=123;
		int y=543;
		
		x=x+y;
		y=x-y;
		x=x-y;	
		
		System.out.println(x);
		System.out.println(y);

	System.out.println("Swapping using * / operator");
		int x1=10;
		int y1=20;
		
		x1=x1*y1;
		y1=x1/y1;
		x1=x1/y1;	
		
		System.out.println(x1);
		System.out.println(y1);
	System.out.println("Swapping using XOR operator");
		int x2=10;// binary of 10-1010
		int y2=20;//binary of 20=10100

		x2=x2^y2;
		y2=x2^y2;
		x2=x2^y2;	
		
		System.out.println(x2);
		System.out.println(y2);
		System.out.println("==============================================");
//swap 2 strings
		
		
		
		

		
		
		
		
		
	}
	public static int getlargest(int[] a,int total) {
		Arrays.sort(a);
		return a[total-1];
	}

}
