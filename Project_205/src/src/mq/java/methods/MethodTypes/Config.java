package mq.java.methods.MethodTypes;

public class Config 
{
	void GB64()
	{
		System.out.println("64 Gb Selected");
	}
	
	void GB32()
	{
		System.out.println("32 Gb selected");
	}
	
	public static void main(String[] args) 
	{
		Product obj=new Product();
		obj.selectProduct("Iphone").Model().GB64();
		obj.selectProduct("Samsung").Model().GB32();
	}

}
