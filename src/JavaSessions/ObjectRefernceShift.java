package JavaSessions;

public class ObjectRefernceShift {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectRefernceShift e1=new ObjectRefernceShift();
		e1.age=20;
		e1.name="Anu";
		e1.city="Pune";
		
		ObjectRefernceShift e2=new ObjectRefernceShift();
		e2.age=30;
		e2.name="SOnu";
		e2.city="Bangalore";
		
		ObjectRefernceShift e3=new ObjectRefernceShift();
		e3.age=40;
		e3.name="Monu";
		e3.city="BBSR";
		
		System.out.println(e1.name+" "+e1.age+" "+e1.city);
		System.out.println(e2.name+" "+e2.age+" "+e2.city);		
		System.out.println(e3.name+" "+e3.age+" "+e3.city);
System.out.println("----------------------------------------------");
		e1=e2;//single object refering to multiple reference
		System.out.println(e1.name+" "+e1.age+" "+e1.city);
		System.out.println(e2.name+" "+e2.age+" "+e2.city);		
		System.out.println(e3.name+" "+e3.age+" "+e3.city);
System.out.println("----------------------------------------------");
		e2=e3;//single object refering to multiple reference
		System.out.println(e1.name+" "+e1.age+" "+e1.city);
		System.out.println(e2.name+" "+e2.age+" "+e2.city);		
		System.out.println(e3.name+" "+e3.age+" "+e3.city);
System.out.println("----------------------------------------------");
		e3=e1;//single object refering to multiple reference
		System.out.println(e1.name+" "+e1.age+" "+e1.city);
		System.out.println(e2.name+" "+e2.age+" "+e2.city);		
		System.out.println(e3.name+" "+e3.age+" "+e3.city);
		
		new ObjectRefernceShift();//can be created but not a good practice as it deos not have nay refernce->garbage collector destroy the objects
		/*			
		 * No refernce objects- here  3 objects got created
		new ObjectRefernceShift().name="Tesla";
		new ObjectRefernceShift().age=5;
		new ObjectRefernceShift().city="Ny";
		*/
		//Null pointer exception
		System.out.println("----------------------------------------------");
		ObjectRefernceShift e4=new ObjectRefernceShift();
		e4.name="IND";
		System.out.println(e4.name);
		e4=null;
		System.out.println(e4.name);

		
		
	}

}
