package BuilderPattern;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EcommApp e=new EcommApp();
		//1 usecase
		e.login("ANu", "pwd")
		.search("MAC")
		.addtocart("MAC")
		.dopayment("89898989")
		.logout();
		
		//2nd business case
		e.login()
		.search("Laptop")
		.addtocart("Laptop")
		.logout();
		
		//3rd use case
		e.login()
		.dopayment("Laptop")
		.logout();
		
		//4th use case
		e.login()
		.logout();
		
	}

}
