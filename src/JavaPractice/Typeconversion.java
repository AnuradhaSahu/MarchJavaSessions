package JavaPractice;

public class Typeconversion {

	public static void main(String[] args) {
		//convert a character to string
				char ch1='a';
				String String=Character.toString(ch1);
				System.out.println(" The string is "+String);
				
				//charcter array to string
				char[] c1= {'a','e','i','o','u'};
				String g=String.valueOf(c1);
				System.out.println(g);
				
	//convert char type variable into int
				
				char a='y';
				int i=a;
				System.out.println(i);
	//int to char
				int j=2;
				char b=(char)j;
				System.out.println(b);
				
				
	//long to int conversion
				
				long l=123456l;
				int k=(int)l;
				System.out.println(k);
				
	//int to long
				int num=10;
				long l1=(long)num;// type casting
				System.out.println(l1);
	//boolean to string
				boolean bo =true;
				String o=String.valueOf(bo);
				System.out.println(o);
	//String to boolean
				String q="false";
				boolean b1=Boolean.parseBoolean(q);
				System.out.println(b1);
	//String to int
				String w="123";
				int h=Integer.parseInt(w);
				System.out.println(h);
	//int to string
				int i1=90;
				String s1=String.valueOf(i1);
				System.out.println(s1);
	//int to double
				int i2=890;
				double d=i2;
				System.out.println(d);
	//double to int
				double d1=123d;
				int i3=(int)d1;
				System.out.println(i3);
				
	//string to double
				String c="888";
				double d2=Double.parseDouble(c);
				System.out.println(d2);
	//double to string
				double d3=666;
				String x=String.valueOf(d3);
				System.out.println(x);
				
	//convert primitive type of objects and vice versa
				//create primitive data types
				int n1=123;
				double db=7.88;
				boolean bb=false;
				//convert into wrapper class
				Integer obj1=Integer.valueOf(n1);
				Double obj2=Double.valueOf(db);
				Boolean obj3=Boolean.valueOf(bb);
				// verify if objects of wrapper class created
				if(obj1 instanceof Integer) {
					System.out.println("An object of integer created");
				}
				if(obj2 instanceof Double) {
					System.out.println("An object of double class created");
				}
				if(obj3 instanceof Boolean) {
					System.out.println("An object of boolean class created");
				}
	// convert wrapper objects into primitive types
				//create objects of wrapper class
				Integer ob=Integer.valueOf(10);
				Double ob1=Double.valueOf(12.90);
				Boolean ob2=Boolean.valueOf(false);
				//convert into primitive  types
				int var1=ob.intValue();
				double var2=ob1.doubleValue();
				boolean var3=ob2.booleanValue();
				//print the primitive values
				System.out.println("The value of interger variable is "+var1);
				System.out.println("The value of double variable is "+var2);
				System.out.println("The value of boolean variable is "+var3);
				
				
				
				
				
				
				
				
				
				
				
	}

}
