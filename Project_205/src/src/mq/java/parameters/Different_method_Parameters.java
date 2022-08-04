package mq.java.parameters;

public class Different_method_Parameters 
{
	
	public void ProductName(String name) 
	{
		System.out.println(name);
	}
	
	public void ProductPrice(double price)
	{
		System.out.println(price);
	}
	
	public void ProductStatus(boolean status)
	{
		System.out.println(status);
	}
	
	public void ProductQuantity(int volume)
	{
		System.out.println(volume);
	}
	
	
	//Sequence parameters
	public void ProductDetails(String ProductName,String Config)
	{
		System.out.println(ProductName+"    "+Config);
	}
	

	public void productinfo(String productname,double price,boolean status,int volume)
	{
		System.out.println(productname+"\t"+price+"\t"+status+"\t"+volume);
	}
	

	public static void main(String[] args) 
	{
		Different_method_Parameters obj=new Different_method_Parameters();
		obj.ProductName("Iphone");
		obj.ProductPrice(25000.00);
		obj.ProductStatus(true);
		obj.ProductQuantity(5);
		obj.ProductDetails("Mac", "128GB");
		
		obj.productinfo("Samsung", 35000, false, 3);
	}

}
