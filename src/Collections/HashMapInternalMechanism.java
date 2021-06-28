package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternalMechanism {

	public static void main(String[] args) {
		/*
		 * Map is a Associative Data Structur which stroes teh data in the form of key- value pair
		 */

		Map<String ,Integer> marks=new HashMap<String, Integer>();
		marks.put("Anu", 100);
		marks.put("Rakes", 600);
		marks.put("Robin", 800);
		marks.put("Rashmi", 500);
		marks.put("Pihu", 500);
		marks.put(null, 100);
		marks.put("Nav", 900);

		/*Hashmap works on the basis of Hashing concept->hashcode()->hashing
		//16 nodes created it contains-K,V,Pointer for next 
		 * every bucket serves as node-every node has [int hash, k, v, node<k,v> next]
		 * 
		 * [Naveen, 210039(hashcode), 100(value),null]->[Tom, 210089(hashcode), 190(value),null]->[Anu, 210839(hashcode), 100(value),null]
		*->link list implementation
		*
		*/

	}

}
