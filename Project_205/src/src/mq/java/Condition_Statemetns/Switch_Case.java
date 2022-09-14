package mq.java.Condition_Statemetns;

public class Switch_Case {

	public static void main(String[] args) 
	{
		
		/*
		 * Switch Statement it is similar to else if statement
		 * Only Difference is switch statement execute required
		 * case instead of checking all conditions..
		 */
		
		String month="apr";
		switch (month) 
		{
		case "jan":
			System.out.println("10% Discount");
			break;
			
		case "feb":
			System.out.println("20% Discount");
			break;	
			
		case "mar":
			System.out.println("30% Discount");
			break;
			
		case "apr":
			System.out.println("40% Discount");
			break;
			
		case "may":
			System.out.println("50% Discount");
			break;

		default:
				System.out.println("No discount");
			break;
		}
		

	}

}
