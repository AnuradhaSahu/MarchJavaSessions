package Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DifferntWaysofCreatingHashMap {
	
	public static Map<String, Integer> marksmap;
	
	static {
		marksmap=new HashMap<>();
		marksmap.put("A", 100);
		marksmap.put("B", 600);

	}
		

	public static void main(String[] args) {

		//1.Using HashMap class
		HashMap<String,String> hp=new HashMap<String, String>();
		//top casting-child class object refered by parent class refernce variable
		Map<String,String> map=new HashMap<String, String>();
		
		//2.Static hashmap
		System.out.println(DifferntWaysofCreatingHashMap.marksmap.get("A"));
		
		//3.Immutable map with only single entry
		Map<String,Integer> map3=Collections.singletonMap("test", 100);
		System.out.println(map3.get("test"));
		
		//4.using 2D array of strings using Stream and collecting in the form map
		Map<String,String> map4=Stream.of(new String[][] {
			{"Tom","A Grade"},
			{"Lisa","C Grade"},
		}).collect(Collectors.toMap(data->data[0], data->data[1]));
		System.out.println(map4.get("Tom"));
		map4.put("Lisa", "A++");
		System.out.println(map4.get("Lisa"));
		
		
		
	}

}
