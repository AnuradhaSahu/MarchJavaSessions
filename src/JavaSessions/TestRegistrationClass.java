package JavaSessions;

public class TestRegistrationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RegistrationClass e=new RegistrationClass("Robin", "Pwd", "email@email.com", 90907878, "8989@okaxis", 1234467);
		RegistrationClass e1=new RegistrationClass("Anu", "Pwd", "email@email.com", 90907878, "8989@okaxis", 1234467);
		RegistrationClass e2=new RegistrationClass("Rakesh", "Pwd", "email@email.com", 90907878, "8989@okaxis", 1234467);
		RegistrationClass e3=new RegistrationClass("jinisha", "Pwd", "email@email.com", 90907878, "8989@okaxis", 1234467);
		
		System.out.println(e.un+" "+e.pwd+" "+e.email+" "+e.phone+" "+e.Gpay);
	}

}
