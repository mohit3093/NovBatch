package pkg1;

public class Constructor
{
	public Constructor() 
	{
		System.out.println("default constuctor");		
	}
	public Constructor(int a) 
	{
		System.out.println("one parameterized constructor");		
	}
	public Constructor(int b, int c)
	{
		System.out.println("two parameterized constructor");
	}
	public static void main(String[] args) 
	{
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor(2);
		Constructor obj2= new Constructor(1,3);
	}

}
