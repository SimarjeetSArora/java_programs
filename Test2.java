class Test2
{
	public static void main(String args[])
	{
		int i=11;
		i= i++ + ++i;
		System.out.println("i: "+i);

		System.out.println("****************************");

		int a=11, b=22, c;
		c=a+b + a++ + b++ + ++a + ++b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);

		System.out.println("****************************");

		int j=0;
		j=j++ - --j + ++j + j--;
		System.out.println("j: "+j);

		System.out.println("****************************");

		j=0;
		j=j++ - --j + ++j - j--;
		System.out.println("j: "+j);

		System.out.println("****************************");

		int k=3;
		i=1;
		j=2;
		int m=i-- - j-- - k--;
		System.out.println("i: "+i);
		System.out.println("j: "+j);
		System.out.println("k: "+k);
		System.out.println("m: "+m);

		System.out.println("****************************");

		i=19;
		j=29;
		int z;
		z=i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
		System.out.println("i: "+i);
		System.out.println("j: "+j);
		System.out.println("z: "+z);
	}
}