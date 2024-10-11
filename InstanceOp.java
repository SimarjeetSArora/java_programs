class InstanceOp
{
	public static void main(String args[])
	{
		String s="Simarjeet Singh";
		//reference variable
		String s1=new String("Simarjeet Singh");
		boolean res= s1 instanceof String;
		System.out.println(res); 
	}
}