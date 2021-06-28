package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
/*1. Write a Java program to create a new array list, 
 * add some colors (string) and print out the collection.*/
		
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Violet");
		colors.add("Green");
		colors.add("Blue");
		colors.add("White");
		colors.add("Purple");
		//printing teh collection
		System.out.println(colors);
		
        //Iterate through all elements
		for(String e:colors) {
			System.out.println(e);
		}
		
		//insert elemnt at 1st position
		colors.add(0,"Amber");
		System.out.println(colors);
		
		//retrive an element from 5th index
		String element=colors.get(5);
		System.out.println("5Th index is "+ element);
		
		//update specific element
		colors.set(0,"Maroon");
		System.out.println(colors);
		
		//remove 3rd element 
		colors.remove(3);
		System.out.println(colors);
		
		//search element from arraylist
			if(colors.contains("Green")) {
				System.out.println("Green is present in colors arraylist");
			}else {
				System.out.println("Green is not present");
			}
		//sort a given arraylist
			System.out.println("Before sorting "+colors);
			Collections.sort(colors);
			System.out.println("After sorting "+colors);
			
		//copy one arraylist into another
			ArrayList<String> code=new ArrayList<String>(Arrays.asList("RE01","BL02"));
			colors.addAll(code);
			System.out.println(colors);
			
		//shuffle elements in an arraylist
            System.out.println("Before shuffling "+colors);
			Collections.shuffle(code);
            System.out.println("After shuffling "+colors);
			
          //reverse eleemnts of an arraylist
            for(int i=colors.size();i>0;i--) {
            	System.out.println(i);
            }
            Collections.reverse(colors);
            System.out.println(colors);
            
            //get the exact portion of arraylist
            ArrayList<String> colorssubstring=new ArrayList<String> (colors.subList(3, 7));
			System.out.println(colorssubstring);
			
			//compare 2 arraylists
			ArrayList<String> li=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
			
			ArrayList<String> li1=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));

			Collections.sort(li);
			Collections.sort(li1);
			
			System.out.println(li.equals(li1));
			
			ArrayList<String> li3=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));

			Collections.sort(li3);
			System.out.println(li1.equals(li3));
			
			//swap 2 eleemnts
			
			ArrayList<String> sw=new ArrayList<String>
			(Arrays.asList("Anu","Bheem","Chai","DEsert","Exotic"));

			
			ArrayList<String> sw1=new ArrayList<String>
			(Arrays.asList("Texas","Boston","chicago","Daman","Egypt"));

			Collections.swap(sw, 0, 3);
			System.out.println(sw);
			
			//join 2 arraylist
			sw.addAll(sw1);
			System.out.println(sw);
			
			//Clone an arraylist 
			ArrayList<String> clone=(ArrayList<String>)sw1.clone();
			System.out.println(clone);
			
			//Emty an arraylist
			sw.clear();
			System.out.println(sw);
			
			//test if the arraylist is empty or not
			if(sw.isEmpty()) {
				System.out.println(sw + " is empty");
			}else {
				System.out.println(sw+ " is not empty");
			}
			
			//Trim the capacity of arryalist-to the current list size
			colors.trimToSize();
			System.out.println(colors);
			
			//increase the size of arraylist
			colors.ensureCapacity(3);
			colors.add("Magenta");
			colors.add("Turquoise");
			colors.add("peacock blue");

			System.out.println(colors);
			
			//replace the second element of the arraylist with speicifed element
			colors.set(2, "Grey");
			System.out.println(colors);
			
			//all the elements of a ArrayList using the position of the elements
			for(int i=0;i<colors.size();i++) {
				System.out.println(colors.get(i));
			}
		}

}
