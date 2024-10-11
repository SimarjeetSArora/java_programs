import java.util.Scanner;
class Sumoftwo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	//Scanner Object
		System.out.print("Enter a: ");
		int a=sc.nextInt();					//taking input from user
		System.out.print("Enter b: ");
		int b=sc.nextInt();
		System.out.println("*****************");
		System.out.println("a+b= "+(a+b));
	}
}