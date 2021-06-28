package JavaSessions;

public class TestCarFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory c=new CarFactory("BMW",90,"black",'A',true);
		CarFactory c1=new CarFactory("Audi",80,"Gryblack",'M',false);
		CarFactory c2=new CarFactory("Honda",20,"white",'A',false);
		CarFactory c3=new CarFactory("maruti",40,"red",'A',true);
		CarFactory c4=new CarFactory("kia",70,"redblack",'A',false);

		System.out.println(c1.color+c2.price);

		

	}

}
