package pkg1;

public class Method 
{
   public int sum(int a, int b)
   {
	   int c;
	   c=a+b;
	   System.out.println("sum result is "+c);
	   return c;
   }
   public int sub(int x, int y)
   {
	   int z;
	   z=x-y;
	   System.out.println("sub result is "+z);
	   return z;
   }
	public void multi(int x1,int x2)
	{
		int x3;
		x3=x1*x2;
		System.out.println("multi result is "+x3);
				
	}
	public static void main(String[] args)
	{
		Method obj=new Method();
	int sumresult =obj.sum(20,10);
	int subresult=obj.sub(20,10);
	obj.multi(sumresult, subresult);
	
		
		
		
	}

}