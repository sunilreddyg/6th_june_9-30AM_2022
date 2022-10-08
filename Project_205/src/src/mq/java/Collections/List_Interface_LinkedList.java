package mq.java.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List_Interface_LinkedList {

	public static void main(String[] args) {
		
		
		/*
		 * => Collection Store objects order wise
		 * => Allo Duplicate obejcts
		 */
		
		List<String> list=new LinkedList<String>();
		//Adding objects to set
		list.add("one");
		list.add("two");
		list.add("one");
		list.add("three");
		list.add("four");
		list.add("five");
		
		//Get Single object from list using Index Number
		String SingleObject=list.get(4);
		System.out.println("4th Index Object is --> "+SingleObject);
		
		//Remove Object Form Collection
		list.remove("three");
				
		//Get Size of objects
		int Count=list.size();
		System.out.println("Object Count is --> "+Count);
		
		//Check object contains at collection
		boolean flag=list.contains("three");
		System.out.println("Object available status is ---> "+flag);
		
		//Read First iteratable object
		String itr=list.iterator().next();
		System.out.println("first iterator of object is --> "+itr);

		//Clear All Collection of objects
		//list.clear();
		
		
		//Verify Collection Empty status
		boolean flag1=list.isEmpty();
		System.out.println("Collection Emtpy Status --> "+flag1);
		
		
		
		//Reading list of object using forloop
		for (int i = 0; i < list.size(); i++) 
		{
			String Obj=list.get(i);
			System.out.println("Object is -> "+Obj);
		}
		
		
		//Read all obejcts from list
		for (String eachobj : list) 
		{
			System.out.println("=> "+eachobj);
		}
		
		
		//Reading list Interface objects using while loop
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

	}

}
