package mq.java.methods;

public class TVRemote 
{
	
	//Reusable method
	void turnon()
	{
		System.out.println("Turnon");
	}
	
	//Reusable method
	void turnoff()
	{
		System.out.println("turnoff");
	}
	
	//Reusable method
	void nextchannel()
	{
		System.out.println("Next channel");
		
	}
	
	
	//Runnable method
		public static void main(String[] args) 
		{
			new TVRemote().turnon();
			new TVRemote().nextchannel();
		}

}
