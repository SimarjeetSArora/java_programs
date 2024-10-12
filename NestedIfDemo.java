import java.util.Scanner;
class NestedIfDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n=sc.nextInt();
		
		if(n>50)
		{
			System.out.println("Given Number is greater than 50");
			if(n%2==0)
			{
				System.out.println("Given Number is divisible by 2");
			}
			else
			{
				System.out.println("Given Number is not divisible by 2");
			}
		}
		else
		{
			System.out.println("Given Number is less than 50");
		}
	}
}