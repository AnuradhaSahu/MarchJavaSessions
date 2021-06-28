package Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
/*Hashmap is class <K,V> pair which extends Anstract Map and which implements interface Map<K,V> , serializable and clonable
 * it does not stores the value based on indexing
 * stores the value in the form of key, value pair
 * does not maintain order , indexing
 * key cannot be duplicate, always unique 
 * Hashmap is not ThreadSafe- it is not synchronised
 * hashtable is synchronised
 * 
 */
		HashMap<String,String> capitalMap=new HashMap<String,String>();//creating hashmap
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "WashingtonDC");//adding values into it
		capitalMap.put("UK", "London");
		capitalMap.put("Australlia", "Canberra");
		capitalMap.put("UK", "London111");
		capitalMap.put("Africa", null);
		capitalMap.put("Odisa", null);


		//getting the values from it
		System.out.println(capitalMap.get("Australlia"));
		System.out.println(capitalMap.get("Germany"));// if value is not present then it will throw null
		System.out.println(capitalMap.get("UK"));// always take the lates value
		
		//we  can store n number of null valuesbut only one null key
		capitalMap.put(null, "LA");
		capitalMap.put(null, "SFO");// can have multiple null values but one null key
		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap.get("Africa"));
		System.out.println(capitalMap.get("Odisa"));
		
		//How to Traverse through Hashmap-USing Iterator
		Iterator<String> it=capitalMap.keySet().iterator();// applying iterator on keyset or value set
		
		while(it.hasNext()) {
		String key=	it.next();
		String value=capitalMap.get(key);
		System.out.println("Key = "+key+" "+"value= "+value );
		}
		
		System.out.println("****************************************");
		//entry set iterator
		Iterator<Entry<String, String>> it1=capitalMap.entrySet().iterator();
		
		while(it1.hasNext()) {
			Entry<String, String> entry=it1.next();
			System.out.println("Key is "+entry.getKey()+ " Value is "+entry.getValue());
		}
		
		System.out.println("****************************************");
		
		//iterator with for each and lamda java 8
		capitalMap.forEach((k,v)->System.out.println("key "+k+" value"+v));
		
		
		


		

		
		
		
		
		
		
		
		
	}

}
