package mq.java.Loops;

public class ForLoop_Example {

	public static void main(String[] args) 
	{
		
		
		//Print number from 1 to 10
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i);
		}
		
		//Print number from 20 to 10
		for (int i = 20; i >= 10; i--) 
		{
			System.out.println(i);
		}
		
		
		//Print Array value using for loop
		String Browser[]= {"chrome","firefox","ie","edge"};
		for (int i = 0; i < Browser.length; i++) 
		{
			String string = Browser[i];
			if(string.equals("firefox"))
			{
				System.out.println(string+" -->Browser is Opened");
				break;
			}
		}
			
		//Conduct Sum between 1 to 100
		int sum=0;
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println("Total value is --> "+sum);
		
		
		//How to reverse a string
		String name="linus";
		char ch[]=name.toCharArray();
		
		String str="";
		for (int i = ch.length-1; i >= 0 ; i--) 
		{
			str=str+ch[i];
		}
		System.out.println(str);
		
		
		//Revers a string using Direct method
		StringBuilder builder=new StringBuilder("selenium");
		String value=builder.reverse().toString();
		System.out.println(value);
		
		
		
	}

}
