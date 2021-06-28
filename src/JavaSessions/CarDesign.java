package JavaSessions;

public class CarDesign {

	String name;
	String color;
	int price;
	double mileage;
	boolean isLaunched;
	char type;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we can create n number of objects for teh same template
		
		CarDesign c1=new CarDesign();
		System.out.println(c1.name+" "+c1.color+" "+c1.price+" "+c1.mileage+" "+c1.isLaunched+" "+c1.type);//defualt value printing
		c1.name="Audi";
		c1.color="Black";
		c1.type='A';
		c1.mileage=29.89;
		c1.price=80000;
		c1.isLaunched=true;
		System.out.println(c1.name+" "+c1.color+" "+c1.price+" "+c1.mileage+" "+c1.isLaunched+" "+c1.type);//defualt value printing

		CarDesign c2=new CarDesign();
		System.out.println(c2.name+" "+c2.color+" "+c2.price+" "+c2.mileage+" "+c2.isLaunched+" "+c2.type);//defualt value printing
		c2.name="HondaCity";
		c2.color="White";
		c2.type='M';
		c2.mileage=79.89;
		c2.price=100000;
		c2.isLaunched=true;
		System.out.println(c2.name+" "+c2.color+" "+c2.price+" "+c2.mileage+" "+c2.isLaunched+" "+c2.type);//defualt value printing

		
	}

}
