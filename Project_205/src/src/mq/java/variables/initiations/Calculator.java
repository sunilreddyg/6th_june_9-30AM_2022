package mq.java.variables.initiations;

public class Calculator 
{
	int a;
	int b;
	
	public Calculator(int x, int y) 
	{
		a=x;
		b=y;
	}
	
	public void add()
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args)
	{
		Calculator obj=new Calculator(10, 20);
		obj.add();
	}

}
