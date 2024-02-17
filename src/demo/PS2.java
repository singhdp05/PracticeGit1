package demo;

public class PS2 extends PS3{
	int a;  //global and class variable
	
	public PS2(int a)   //constructor //instance variable //scope is inside this block
	{
		super(a);  //parent class constructor is invoked //should be first line in child constructor
		this.a = a; //calls own class variable(global variable)
	}
	public int increment()
	{
		a=a+1;
		a=+2;
		a+=3;
		return a;
	}

	public int decrement()
	{
		a=a-1;
		return a;
	}
}
