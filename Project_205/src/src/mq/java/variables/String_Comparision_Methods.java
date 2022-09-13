package mq.java.variables;

public class String_Comparision_Methods {

	public static void main(String[] args) 
	{
		
		/*
		 * String:->
		 * 		=> String is a non primitive datatype
		 * 		=> String Also called as class
		 * 		=> String Store set of characters 
		 * 		=> String Contains set of events to validate
		 * 			stored characters..
		 */
		
		
		/*
		 * Equals:-->
		 * 		Method verify equal comparision between two strings
		 * 		and return boolean value true/false.
		 * 		=> Equal comparision is casesensitive
		 */
		String act_msg="Account Created";
		String exp_msg="Account created";
		
		boolean flag=act_msg.equals(exp_msg);
		System.out.println("Equal Comparision is --> "+flag);
		
		
		/*
		 * EqualIgnoreCase:-->
		 * 		Method verify Equal comparision between two
		 * 		string by ignoring casesensitive
		 */
		boolean flag1=act_msg.equalsIgnoreCase(exp_msg);
		System.out.println("EqualIgnoreCase Comparision is --> "+flag1);
		
		
		
		/*
		 * Contains:-->
		 * 		Method verify sub string available at main String
		 */
		String Status="Account 100 Created";
		boolean flag2=Status.contains("Created");
		System.out.println("Sub String available status  ==> "+flag2);

		
		/*
		 * length:--> 
		 * 		Method verify number of characters available with in
		 * 		string.
		 */
		String MobileNumber="9030248855";
		int len=MobileNumber.length();
		System.out.println("Mobile Number lengh is --> "+len);
	    System.out.println(len==10);
	    
	    
	    /*
	     * trim:-->
	     * 		Method trim left and right extra spaces
	     * 		with in string.
	     */
	    String zipcode="   500036   ";
	    System.out.println("before trim --> "+zipcode.length());
	    String Newzipcode=zipcode.trim();
	    System.out.println("After trim --> "+Newzipcode.length());
	    
	    
	    /*
	     * SubString:-->
	     * 		Method get subString characters from main String
	     */
	    String AccountNumber="202044441234";
	    String str=AccountNumber.substring(8);
	    System.out.println("End 4 digits are --> "+str);
		
	    String str1=AccountNumber.substring(4, 8);
		System.out.println("Middle 4 digits are --> "+str1);
		
		

		/*
		 * startswith:-->
		 * 			Method verify given string started with expected characters
		 * 			and return boolean value
		 */
		String IFSC_Code="HDFC000178";
		boolean flag5=IFSC_Code.startsWith("HDFC");
		System.out.println("Starts with Comparision is --> "+flag5);
		
		/*
		 * endswith:-->
		 * 			Method verify given string ends with expected characters
		 * 			and return boolean value
		 */
		boolean flag6=IFSC_Code.endsWith("000178");
		System.out.println("ends with Comparision is --> "+flag6);
		

		/*
		 * tolowercase:-->
		 * 			Convert all uppercase characters in lowercase
		 */
		String toolname="WebDriver";
		System.out.println(toolname.toLowerCase());
		System.out.println(toolname.toUpperCase());
		
		

		/*
		 * charsAt:-->
		 * 		Method return single character using index number
		 */
		String browsername="Chrome,Firefox";
		char ch=browsername.charAt(7);
		System.out.println("charcters available at 7th index number is =>"+ch);
		

		/*
		 * isempty:-->
		 * 		method return characters available status in 
		 * 		boolean format
		 * 		=> Return true when string doesn't have any charactes
		 * 		=> Return false when string has characters
		 */
		String var="";
		String var1="Hello";
		System.out.println("var empty status is ---> "+var.isEmpty());
		System.out.println("Var1 empty statu is ---> "+var1.isEmpty());
		
		/*
		 * replace:-->
		 * 		Replace old characters with New characters 
		 */
		String Price="$40,000";
		String NewPrice=Price.replace("$", "").replace(",", "");
		System.out.println("Price after replace characters is --> "+NewPrice);
		System.out.println(NewPrice.replaceAll("0", "1"));
		

		/*
		 * Concat:-->
		 * 			Add new string to existing charactes
		 */
		String New_browser=browsername.concat(",Safari");
		System.out.println(New_browser);
		
		
		String f="Hi";
		String s="Users";
		System.out.println(f+s);
		System.out.println(f.concat(s));
		
	}

}
