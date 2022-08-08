package mq.java.methods.MethodTypes;

public class Product
{
	
	Details selectProduct(String name)
	{
		System.out.println(name);
		return new Details();
	}

}
