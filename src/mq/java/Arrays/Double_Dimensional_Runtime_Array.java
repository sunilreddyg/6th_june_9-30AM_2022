package mq.java.Arrays;

public class Double_Dimensional_Runtime_Array {

	public static void main(String[] args) 
	{
		
		String data[][]=
				{
						{"arun","9030","TE"},
						{"asha","9040","DEV"},
						{"sam","9050","DEVOPS"},
				};
		
		System.out.println(data[1][0]);
		
		
		
		Object Products[][]=
			{
				new Object[] {"Iphone",true},
				new Object[] {"Samung",false},
			};
		
		//Print statemetn by default cast object to Datatype
		System.out.println(Products[0][0]);
		
		//Casting Object value to string datatype
		String FirstProduct=(String) Products[0][0];
		System.out.println(FirstProduct);
		
	}

}
