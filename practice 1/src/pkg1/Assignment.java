package pkg1;

public class Assignment 
{
	public int sum(int a, int b)
	{
			int c;
			c=a+b;
			System.out.println("sum result is "+ c);
			return c;
	}
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("sub result is " + z);
		return z;
		
	}
	public int multi(int x1, int x2)
	{
		int x3;
		x3=x1*x2;
		System.out.println("multi result is "+ x3);
		return x3;
		
	}
	public void div(int y1,int y2)
	{
		int y3;
		y3=y1/y2;
		System.out.println("div result is " + y3);
	}
	public static void main(String[] args) 
	{
		Assignment obj=new Assignment();
	    int sumresult =obj.sum(10,2);
	    int sumresult2=obj.sum(sumresult, 2);
	    int sumresult3=obj.sub(sumresult2, 2);
	    int sumresult4=obj.multi(sumresult3, 2);
	    obj.div(sumresult4,2);
	}

}
