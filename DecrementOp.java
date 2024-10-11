class DecrementOp
{
	public static void main(String args[])
	{
		int a=45;
		int b=13;
		//here will not increment immediately and a++ will return 5, it will increment after the semicolon;
		int res=a-- +b;//post Increment
		System.out.println("result: "+res);

		int res1=--a +b;//post Increment
		System.out.println("result: "+res1);
	}
}