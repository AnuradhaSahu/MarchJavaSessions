package Abstraction;

class vehicle {

	 static int max_speed=200;
	public static void drive() {
		System.out.println("Driving vehicle");
	}
	public  void race() {
		System.out.println("Driving at speed "+max_speed);
	}
}

class car extends vehicle {

	 static int max_speed=180;
	public static void drive() {
		System.out.println("Driving vehicle");
	}
	@Override
	public  void race() {
		System.out.println("Driving at speed "+max_speed);
	}
}

