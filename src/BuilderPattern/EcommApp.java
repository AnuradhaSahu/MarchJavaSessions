package BuilderPattern;

public class EcommApp {

	public EcommApp login() {
		System.out.println("Login to app");
		return this;
	}
	public EcommApp login(String un,String pwd) {
		System.out.println("Login to app with "+un+":"+pwd);
		return this;
	}
	public EcommApp search(String productname) {
		System.out.println("search in the app for "+productname);
		return this;
	}
	public EcommApp search(String productname,int price) {
		System.out.println("search in the app for "+productname+price);
		return this;
	}
	public EcommApp addtocart(String productname) {
		System.out.println(productname);
		return this;
	}
    public EcommApp dopayment(String gpay) {
    	System.out.println("enter gpay "+gpay);
    	return this;
    }
    public EcommApp dopayment(int cc,int code) {
    	System.out.println("enter payment details "+cc+code);
    	return this;
    }
    public EcommApp logout() {
    	System.out.println("Logged out from ecommapp");
    	return this;
    }   
}
