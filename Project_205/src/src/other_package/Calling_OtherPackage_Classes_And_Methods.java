package other_package;

import mq.java.methods.RobotA;
import mq.java.methods.staticmethods.NativeInputs;

public class Calling_OtherPackage_Classes_And_Methods 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Rule1:--> 
		 * 			In Order to call other package class methods and
		 * 			variables we should declare with public modifier
		 * 
		 * Rule2:-->
		 * 			We should import other package to current Constructed class
		 * 		
		 * 			Syntax:--> 
		 * 				import packagename.*
		 * 				import packagename.classname;
		 */
		
		RobotA obj=new RobotA();
		obj.active();
		
		NativeInputs.Mouse();
		NativeInputs.Keyboard();
	
	}

}
