class IncrementOp
{
	public static void main(String args[])
	{
		int a=5;
		int b=7;
		//here will not increment immediately and a++ will return 5, it will increment after the semicolon;
		int res=a++ +b;//post Increment
		System.out.println("result: "+res);

		res=++a +b;//post Increment
		System.out.println("result: "+res);
	}
}