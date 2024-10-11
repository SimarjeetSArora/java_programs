import java.util.Scanner;
class NamePrint
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Name: ");
		String fName=sc.next();
		System.out.print("Enter Last Name: ");
		String lName=" "+sc.next();
		System.out.println("Full Name is "+(fName+lName));
	}
}