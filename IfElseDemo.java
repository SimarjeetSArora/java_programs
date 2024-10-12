import java.util.Scanner;
class IfElseDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int n1=sc.nextInt();
		System.out.print("Enter Second Number: ");
		int n2=sc.nextInt();

		if(n1+n2==20)
		{
			System.out.println("If Block Executed");
		}
		else
		{
			System.out.println("Else Block Executed");
		}
		System.out.println("Outside of If and Else Block");
	}
}