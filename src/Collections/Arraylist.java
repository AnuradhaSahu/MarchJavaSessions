package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		
		// 3 ways -declaring arraylist
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add(200);
		
		 ArrayList<Integer> arr=new ArrayList<Integer>();
		 arr.add(10);
		 arr.add(200);
		 arr.add(400);
		 
		 
		 System.out.println(arr.size());//length of arraylist
		 
		 //iteration
		 for(int i=0;i<arr.size();i++) {
			 System.out.println(i);
		 }
		 
		 for(Integer e:arr) {
			 System.out.println(e);
		 }
		 
		 arr.stream().forEach(e->System.out.println(e));
		 
		 Iterator<Integer>it=arr.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		System.out.println("******************************************");

		//create one arraylist with another
		
		ArrayList<Integer> list= new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		
		//arraylist methods
		//1.Add
		list.add(90);
		System.out.println(list);
		
		//2.AddAll
		ArrayList<String> ar1=new ArrayList<String>(Arrays.asList("Ruby","Python","Java","C#"));
		
		ArrayList<String> ar2=new ArrayList<String>(Arrays.asList("Testing","Devops"));

		ar1.addAll(ar2);
		ar2.addAll(ar1);
		System.out.println(ar1);
		System.out.println(ar2);
		
		//3.clear
		//ar1.clear();
		System.out.println(ar1);
		
		//4.clone
		ArrayList<String> clonelist=( ArrayList<String>)ar2.clone();
		System.out.println(clonelist);

		//5.contains
		System.out.println(ar2.contains("python"));
		
		//6.index of
		System.out.println(ar1);
		System.out.println(ar1.indexOf("java")>0);
		
		//7.last index of-returns inetegre
		
		ArrayList<String> list1=new ArrayList<String>(Arrays.asList("Anu","Naveen","Tom"));
		int i=list1.lastIndexOf("test");
		System.out.println(i);
		
		//8.remove
		list1.remove(1);
		list1.remove("Anu");
		
		//9.removeif
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num->num%2==0);//printing all odd numbers /elimnating even numbers
		System.out.println(numbers);
		
		//10.retain All
		ArrayList<String> al=new ArrayList<String>(Arrays.asList("ANu","Robin","Sky","Red"));
		al.retainAll(Collections.singleton("ANu"));
		System.out.println(al);
		
		//11.How to create a substring from arraylist
		ArrayList<Integer> no=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,12,13,14));
		
		ArrayList<Integer> substring=new ArrayList<Integer>(no.subList(3, 9));
		System.out.println(substring);
		
		//How to convert an arraylist to array
		Object arr1[]=no.toArray();
		System.out.println(Arrays.toString(arr1));
		
		for(Object e:arr1) {
			System.out.println(e);
		}
		
		/*How to synchronise arraylist
		 * 1.collections.synchronisedlist()->returns a synchronised list
		 * 2.CopyOnWriteArraylist-synchronised variant of arraylist
		*/
		
		List<String> namelist=(List<String>) Collections.synchronizedCollection(new ArrayList<String>());
		
		
		//How to remove duplicate elements using linkedhashset and streams
		
		//how to compare 2 arraylist
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
