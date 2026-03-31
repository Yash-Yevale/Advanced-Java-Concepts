interface Itemconstants
{
	int code = 1001;
	String name = "fan";
} 

interface ItemMethods
{
	void display();
	void get(String S);
}

interface Item extends Itemconstants , ItemMethods
{	
	int price = 5000;		
}

class Interface_class implements Item
{
	String manufacturer;
	public void get(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}
	public void display()
	{	
		System.out.println("Code : "+code+"\nName : "+name+"\nPrice : "+price+"\nManufacturer : "+manufacturer);
	}
			
} 
class Extending_interface
{
	public static void main(String args[])
	{	
		Interface_class obj = new Interface_class();
		obj.get("Alex");
		obj.display();	
	}


}