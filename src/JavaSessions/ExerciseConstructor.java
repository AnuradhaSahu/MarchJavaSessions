package JavaSessions;

public class ExerciseConstructor {
	String name;
	int id;
	long phone;
	String email;
	public ExerciseConstructor() {
		System.out.println("default constructor");
		this.name=name;
	}
	public ExerciseConstructor(int a,String s) {
		System.out.println("2 parameters constructor");
		this.id=id;
		this.email=email;
		this.phone=phone;
	}
	public static void main(String[]args) {
		ExerciseConstructor e=new ExerciseConstructor();
		System.out.println(e.name);
		System.out.println(e.email);
		System.out.println(e.phone);
		System.out.println(e.id);
		
		ExerciseConstructor e1=new ExerciseConstructor(90,"Anu");
		System.out.println(e1.name);
		System.out.println(e1.email);
		System.out.println(e1.phone);
		System.out.println(e1.id);
	}
}
