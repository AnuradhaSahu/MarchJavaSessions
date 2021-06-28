package OOPS;

public class TestEncapsulation {
/*
 * We can access public layer but not the private data members-Encapsulation
 * 
 */
	
	public static void main(String[] args) {

       //company c=new company();// normal object
		company c=new company("Contentserv",899,"Pune");// obj from constructor 
       c.setName("BNY Mellon");
       c.setHQ("PUNE");
      System.out.println(c.getHQ());	
      System.out.println(c.getName());
      System.out.println(c.getShareprice());
	}

}
