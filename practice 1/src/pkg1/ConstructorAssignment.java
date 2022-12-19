package pkg1;

public class ConstructorAssignment 
{

		public ConstructorAssignment() 
		{
			this(10,20,30);
			
			System.out.println("default constuctor");		
		}
		public ConstructorAssignment(int a) 
		{
			this();
			System.out.println("one parameterized constructor");		
		}
		public ConstructorAssignment(int a, int b)
		{
			this(6);
			System.out.println("two parameterized constructor");
		}
		public ConstructorAssignment(int a, int b, int c)
		{
			
			System.out.println("three parameterized constructor");
		}
		public ConstructorAssignment(int a,int b, int c, int d)
		{
			this(10,20);
			System.out.println("four parameterized constructor");
		}
		
		public static void main(String[] args) 
		{
			ConstructorAssignment obj = new ConstructorAssignment(10,20,30,40);
			
		}

	}

