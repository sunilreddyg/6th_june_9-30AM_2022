package mq.java.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface_HashSet {

	public static void main(String[] args)
	{
		
		/*
		 * => Set is a unorder collection of objects
		 * => Set Doesn't accept duplicates
		 */
		
		Set<String> set=new HashSet<String>();
		
		//Adding objects to set
		set.add("one");
		set.add("two");
		set.add("one");
		set.add("three");
		set.add("four");
		set.add("five");
		
		//Remove Object Form Collection
		set.remove("three");
				
		//Get Size of objects
		int Count=set.size();
		System.out.println("Object Count is --> "+Count);
		
		//Check object contains at collection
		boolean flag=set.contains("three");
		System.out.println("Object available status is ---> "+flag);
		
		//Read First iteratable object
		String itr=set.iterator().next();
		System.out.println("first iterator of object is --> "+itr);

		//Clear All Collection of objects
		//set.clear();
		
		
		//Verify Collection Empty status
		boolean flag1=set.isEmpty();
		System.out.println("Collection Emtpy Status --> "+flag1);
		
		
		
		//Read all obejcts from set
		for (String eachobj : set) 
		{
			System.out.println("=> "+eachobj);
		}
		
		
		//Reading Set Interface objects using while loop
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
	}

}
