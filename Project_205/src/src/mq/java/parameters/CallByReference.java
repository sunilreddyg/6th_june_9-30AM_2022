package mq.java.parameters;



public class CallByReference 
{

	public void actionmethods(Calculator cal)
	{
		cal.add();
		cal.mul();
	}
	
	
	public static void main(String[] args) {
		
		CallByReference obj=new CallByReference();
		obj.actionmethods(new Calculator(100, 200));
	}


	
}
