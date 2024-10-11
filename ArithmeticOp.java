class ArithmeticOp
{
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		System.out.println("a+b: "+(a+b));
		System.out.println("a-b: "+(a-b));
		System.out.println("a*b: "+(a*b));
		System.out.println("a/b: "+(a/b));
		System.out.println("a%b: "+(a%b));

		a++;
		b++;
		System.out.println("a++ : "+a);
		System.out.println("b++ : "+b);

		int c=5;
		c++;
		System.out.println("c++ : "+c);
		++c;
		System.out.println("++c : "+c);
		c--;
		System.out.println("c-- : "+c);
		--c;
		System.out.println("--c : "+c);
	}
}