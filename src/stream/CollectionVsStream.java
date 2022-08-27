package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionVsStream {
	
	public static void main(String[] args) {
		
		List<String> names=new ArrayList<String>();
		
		names.add("rohit");
		names.add("ramesh");
		names.add("ram");
		
		names.remove(0);
		
		for(String name:names)
		{
			System.out.println(name); //collections perform external iteration
		}
		System.out.println("printing multiple times------------------------------");
		for(String name:names)
		{
			System.out.println(name);
		}
		System.out.println(names); //collection allows to delete,add elements to list after creation
		
		Stream<String>st=names.stream();//with stream we dont have have any method to delete or add items to list of stream
		
		
		st.forEach(System.out::println); //internal iteration 
		
		//st.forEach(s->System.out.println(s)); we cannot write this again since stream can be traversed only once will throw exception
		
	}
}
