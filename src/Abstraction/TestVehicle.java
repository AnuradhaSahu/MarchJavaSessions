package Abstraction;

public class TestVehicle {

	public static void main(String[] args) {
		
		vehicle v=new car();
		v.drive();
		v.race();
		System.out.println(v.max_speed	);
		
	}
}

