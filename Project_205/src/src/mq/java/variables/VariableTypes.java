package mq.java.variables;

public class VariableTypes 
{
	//Global variables [Instant variable]
	int a=100;
	boolean b=true;
	
	//Global Variables [Static Variables]
	static int c=200;
	static boolean d=false;
	
	public void method1() 
	{
		String name="Sunil";   //local variable
		System.out.println(name);
		System.out.println(b);
	}
	
	public void method2()
	{
		System.out.println(a+c);
	}
	public static void main(String[] args)
	{
		VariableTypes obj=new VariableTypes();
		obj.method1();
		obj.method2();
		
	}

}
