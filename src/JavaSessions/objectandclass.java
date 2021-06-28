package JavaSessions;

public class objectandclass {
	
	int age;
	String name;//class variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Class-Blueprint/template/catalogue of all the object
 * Object-Physical entity of the class ex-laptop catagory->laptop(object)
 * every class have 2 type of memebers->1.methods 2.variables
 * from teh blueprint we hv to create multile objects
 * 
 */
		int i=10;//local variable
		System.out.println(i);

		objectandclass obj=new objectandclass();//object creation for aceessing class variable
		obj.age=20;
		obj.name="SD";
		
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

}
