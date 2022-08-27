package defaultpackage;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashSet;

import java.util.List;
import java.util.Set;

import java.util.stream.Collectors;

public class ProgramTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,2,2,3,4,56,53,45,1,2,4);
		//imperative 
		List<Integer> finallist = new ArrayList<Integer>();
		for(Integer i:list)
		{
			if(!finallist.contains(i))
			{
				finallist.add(i);
			}
		}
		System.out.println("imperative way after copying list to another list: " + finallist);
		Set<Integer> set=new HashSet<Integer>();
		set.addAll(list);
		
		System.out.println("imperative way using set: " + set);
		//declarative
		
		 List<Integer> finallist2 =list.stream().distinct().collect(Collectors.toList());
		
		System.out.println("declarative way using distinct: " + finallist2);
		

        Set<Integer> items = new HashSet<Integer>();
        
        Set<Integer> items1= list.stream()
                .filter(n -> items.add(n)) // Set.add() returns false if the element was already in the set.
                .collect(Collectors.toSet());
        System.out.println("using set in declarative way using filter:" + items1);
				
	}

}
