package lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prior java 8
		Comparator<Integer> c = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2);  //0 if  o1==o2,  o1> o2 then 1 else -1
				
			}};
		
			System.out.println("comparing two number: "+ c.compare(1, 2));
			
			
			// using java 8 
			//Comparator<Integer> c1=(Integer a,Integer b) -> { return a.compareTo(b); }; // for one we use as used below
			Comparator<Integer> c1=(a,b)-> a.compareTo(b);
			System.out.println("comparing two number using java8 : "+ c1.compare(2,1));
			
			
		}
		
}

