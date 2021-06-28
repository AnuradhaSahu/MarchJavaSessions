package JavaSessions;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * array can be used to store multiple values 
 * 2 types of array-1.static array(size s fixed), 2.dynamic array-(size varies)
 * array is non priomitive datatype as we r using new keyword  n creating objects n allocating space
 */
		//static array
		int i[]=new int[4];
		i[0]=10;
		i[1]=30;
		i[2]=40;
		i[3]=50;
		
		int len=i.length;
		System.out.println("length="+len);
		System.out.println("li="+(len-1));
		System.out.println(i[0]);
		System.out.println(i[1]);
		
		//printing all the values of array
		for (int k=0;k<i.length;k++) {
			System.out.println(i[k]);
		}
		System.out.println("---------------------");
		//print all the values using for each loop
		for(int q:i) {
			System.out.println(q);
		}
		System.out.println("---------------------");
		//double array
		double d[]=new double[3];
		d[0]=12.33;
		d[1]=11.22;
		d[2]=34.09;
		System.out.println(d[0]+d[1]+d[2]);
		//char array
		char c[]=new char[3];
		c[0]='!';
		c[1]='$';
		c[2]='&';
		for(char e:c) {
			System.out.println(e);
		}
		//String array
		String name[]=new String[3];
		name[0]="Anu";
		name[1]="Rak";
		name[2]="Sonu";
		for (String e:name) {
			System.out.println(e);
			if(e.equals("Anu")) {
				System.out.println("WOman");
			}
		}
		//Object array-Can store any type of data
		Object ob[]=new Object[5];
		ob[0]="Anu";
		ob[1]=10.89;
		ob[2]=30;
		ob[3]='F';
		ob[4]="Pune";
		for(int p=0;p<ob.length;p++) {
			System.out.println(ob[p]);
		}
		for(Object e:ob) {
			System.out.println(e);
		}
	/*
	 * Array Literals-use case of array literals -when we r sure about teh size of teh array
	 * only diff between array literals n array is syntax
	 * 
	 */
		int num[]= {1,2,3,4,5};
		System.out.println(num.length);
				
		
				
	
	}

}
