package mq.java.variables;

public class Run_Variables {

	public static void main(String[] args)
	{
		
		VariableTypes obj=new VariableTypes();
		int x=obj.a;
		boolean y=obj.b;
		System.out.println(x);
		System.out.println(y);
		
		//Calling Static variables
		int v1=VariableTypes.c;
		boolean v2=VariableTypes.d;
		System.out.println(v1);
		System.out.println(v2);
		
		
	}

}
