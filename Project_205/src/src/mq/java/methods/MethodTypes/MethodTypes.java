package mq.java.methods.MethodTypes;


public class MethodTypes 
{
	
	//Void type method
	void method1()
	{
		String name="WebDriver";
	}
	
	//String return method
	String method2()
	{
		String name="Webdriver";
		return name;
	}
	
	//integer return method
	int method3(int a, int b)
	{
		int x=a;
		int y=b;
		return x*y;
	}
	
	//boolean return method
	boolean method4()
	{
		return false;
	}
	
	//Double return method
	double method5()
	{
		return 12000.00;
	}

	public static void main(String[] args)
	{
			MethodTypes obj=new MethodTypes();
			obj.method1();
			
			String str=obj.method2(); 
			System.out.println(str);
		
			int num=obj.method3(10, 20);
			System.out.println(num);
			
			boolean status=obj.method4();
			System.out.println(status);
			
			double dble=obj.method5();
			System.out.println(dble);
	}

}
