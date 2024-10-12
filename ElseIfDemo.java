class ElseIfDemo
{
	public static void main(String args[])
	{
		int x=20;
		if(x>10)
		{
			System.out.println("x is greater than 10");
		}
		else if(x>13)
		{
			System.out.println("x is greater than 13");
		}
		else if(x>20)
		{
			System.out.println("x is greater than 20");
		}
		else if(x>30)
		{
			System.out.println("x is greater than 30");
		}
		else
		{
			System.out.println("else execution");
		}
		System.out.println("final destination");
	}
}