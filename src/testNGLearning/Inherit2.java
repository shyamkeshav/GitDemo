package testNGLearning;

public class Inherit2 extends Inheritchild{
	
	int a;

	public Inherit2(int a) {
		super();
		this.a = a;
	}
	public void add1()
	{
		System.out.println(a+1);
	}
	public void add2()
	{
		System.out.println(a+2);
	}
}
