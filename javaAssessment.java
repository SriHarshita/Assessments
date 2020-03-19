package myproject;

abstract class Testing{
	abstract void git();
	void sql()
	{
		System.out.println("This is sql part");
	}
}
class javaAssessment extends Testing
{
	void git()
	{
		System.out.println("This is git method");
	}
	public static void main(String []args)
	{
		javaAssessment sa = new javaAssessment();
		sa.git();
		sa.sql();
	}
}