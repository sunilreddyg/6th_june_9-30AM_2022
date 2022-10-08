package mq.java.Collections;

import java.util.Hashtable;
import java.util.Map;

public class Map_Interface {

	public static void main(String[] args) 
	{
		
		   Map<Integer, String> map=new Hashtable<Integer,String>();
		   map.put(100, "iphone");
		   map.put(101, "Samsung");
		   map.put(102, "Vivo");
		   map.put(103, "Blakberry");
		   map.put(104, "OnePlus");
		   map.put(null, "OnePlus");
		   
		   //Read Any Object value using keyname
		   String object=map.get(102);
		   System.out.println("Keyname is --> "+object);
		   
		   //Read all object using Keyname
		   for (Integer EachKey : map.keySet()) 
		   {
			   System.out.println(map.get(EachKey));
		   }
		   
		   
		  
		   
		   
		   
		   
		   
		   

	}

}
