package SeleniumBatch.SeleniumBatch;
//three parameterized constructor
//default constructor
//2 parameterized constructor
//4 parameterized constructor
//one parameterized constructor
public class A1_constructor 
{
	public A1_constructor()
	{
		this(1,2,3);
		System.out.println("This is the default Constructor");
		
	}
	
	public A1_constructor(int x1)
	{	
		
		
		System.out.println("This is the one parametarized Constructor");
		
	}
	
	public A1_constructor(int x1,int x2)
	{
		
		System.out.println("This is the two parametarized Constructor");
		
	}
	
	public A1_constructor(int x1,int x2, int x3)
	{
		System.out.println("This is the three parametarized Constructor");
		
	}
	
	public A1_constructor(int x1,int x2, int x3, int x4)
	{
		this(4,5);
		System.out.println("This is the four parametarized Constructor");
		
	}
	
	public static void main(String[] args) 
	{
		A1_constructor c=new A1_constructor();
		A1_constructor c1=new A1_constructor(2,3,7,9);
		A1_constructor c2=new A1_constructor(5);
		
	}

}
