package JavaSessions;
import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
/*
 *Arraylist-Default value of arraylist-10
 *it is a part of collections -Holdings API
 *it is dynamic array-whre size is not fixed
 *it is order based it miantains index
 *uber request-dyanmic request on ecommerce
 *we can juse generics to restrict the arraylist
 */
		ArrayList ar=new ArrayList();
		ar.add(10);
		System.out.println(ar.size());
		ar.add("Anu");
		ar.add(12.90);
		ar.add('F');
		ar.add(90);
		ar.add('T');
		ar.add('^');
		ar.add(78);
		ar.add(56.89);
		ar.add("AJJK");
		ar.add('I');
		ar.add('0');
		ar.add('9');
		ar.add('T');
		ar.add('T');
		ar.add(78);
		ar.add(67);
		ar.add(66);
		System.out.println(ar.size());
		//Printing all the values of arraylist
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		for(Object e:ar) {//for each loop
			System.out.println(e);
		}
		//generics in arraylist
		ArrayList<Integer> marklist=new ArrayList<Integer>();
		marklist.add(12);
		//Emp NAme
		ArrayList<String> emplist=new ArrayList<String>();
		emplist.add("ANu");
		emplist.add("TOM");
		for(String e:emplist) {
			System.out.println(e);
		}
		ArrayList<Object> ar1=new ArrayList<Object>();
		ar1.add("TOMMY");
		ar1.add('M');
		ar1.add(12.99);
		ar1.add(678);
		for(Object e:ar1) {
			System.out.println(e);
		}
		ar1.remove(2);
		
	}
}
