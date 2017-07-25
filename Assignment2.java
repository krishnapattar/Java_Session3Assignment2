
class Super {

	int x;
	Super(int x)
	{
		this.x = x;
	}
	
	void display1()
	{
		System.out.println("super x = "+x);
	}
}
class Sub extends Super
{
	int y;
	void sub (int x, int y)
	{
		super(x);
		this.y = y;
	}
	void display()
	{
		System.out.println("super x = "+x);
		System.out.println("super y = "+y);
	}
	
}
class OverrideTest
{
	public static void main(String args []){
		Sub s1 = new Sub();
		s1.display();
	}
	}