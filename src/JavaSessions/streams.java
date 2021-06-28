package JavaSessions;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Stream got added in java after jdk 1.8
		 * list->converting into stream->capture->e->sive to sop->print
		 * we can filter stream
		 * stream is a chain of methods
		 * actual use cases->capture 500 links ->filter using any value->filter whose name starts with amazon etc
		 * 2 types of stream-Parallel n sequential
		 * parallel is fastest but when we hv more than 1000 elements then only its good to use parallel stream
		 * in java application whenever we have lots of data then we can use stream->stream pipeline
		 * we cannot use stream with array only with arraylist,list hashmap  set objects etc.
		 */

		ArrayList<String> studentlist=new ArrayList<String>();
		studentlist.add("Tom");
		studentlist.add("Peter");
		studentlist.add("Lisa");
		studentlist.stream().forEach(e->System.out.println(e));//prinnts all present in arraylist
		studentlist.stream().filter(e->e.equals("TOM")).forEach(e->System.out.println(e));//filterng out data
		
		IntStream.range(1, 5).forEach(e->System.out.println(e));//printing 1-5
		IntStream.iterate(0, i->i+2).limit(10).forEach(e->System.out.println(e));
		
	}

}
