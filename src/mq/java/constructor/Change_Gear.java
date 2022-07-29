package mq.java.constructor;

public class Change_Gear 
{

	public Change_Gear() 
	{
		System.out.println("Hold clutch");
	}

	public void first_gear() 
	{
		System.out.println("First Gear");
	}
	
	public void second_gear() 
	{
		System.out.println("Second Gear");
	}
	
	public void third_gear()
	{
		System.out.println("Third Gear");
	}
	
	public static void main(String[] args) 
	{
		new Change_Gear().first_gear();
		new Change_Gear().second_gear();
		new Change_Gear().third_gear();
		
		
		Change_Gear obj=new Change_Gear();
		obj.first_gear();
		obj.second_gear();
		obj.third_gear();
		
		
	}
	
}
