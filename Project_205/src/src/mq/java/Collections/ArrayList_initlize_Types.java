package mq.java.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayList_initlize_Types {

	public static void main(String[] args) {
		
		
		//Java7
		 List<String> browsers=new ArrayList<String>();
		 browsers.add("chrome");
		 browsers.add("firefox");
		
		 //java8
	     List<String> fruits = Arrays.asList("Apple", "Grape", "Pear");
	     System.out.println(fruits);
	     System.out.println(fruits.get(1));
	     
	     //java8
	     List<String> fruits1 = Stream.of("Apple", "Banana", "Orange").collect(Collectors.toList());   
	     System.out.println(fruits1);
	      
	      
	}

}
