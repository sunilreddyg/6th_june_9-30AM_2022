package mq.java.variables.initiations;

public class Method_Initiation
{
	
	int a;
	
	void m1()
	{
		a=20;
		System.out.println(a);
	}
	
	void m2()
	{
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		Method_Initiation obj=new Method_Initiation();
		obj.m1();
		

	}

}
