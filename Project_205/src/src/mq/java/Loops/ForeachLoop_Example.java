package mq.java.Loops;

public class ForeachLoop_Example 
{

	public static void main(String[] args) 
	{
		//Reading string array values using foreah loop
		String browsers[]= {"chrome","firefox","ie","edge","safari"};
		for (String EachBrowser : browsers) 
		{
			System.out.println(EachBrowser);
		}
		
		
		//Reading Numric array values using foreach loop
		int num[]= {100,200,300,400};
		for (int i : num) 
		{
			System.out.println(i);
		}
		
		//Double Dimensional runtime array
		String data[][]=
			{
					{"arun","9030","TE"},
					{"asha","9040","DEV"},
					{"sam","9050","DEVOPS"},
			};
		
		for (String[] eachrow : data) 
		{
			System.out.println(eachrow[0]+"   "+eachrow[1]);	
		}
	
		
		

	}

}
