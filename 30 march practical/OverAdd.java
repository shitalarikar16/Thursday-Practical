




class Overload
{
	int add(int a,int b)
	{
		return a+b;
		
	}
	int add(int a,int b,int c)
	{
		
		return a+b+c;
		
	}
	
	
}
class OverAdd
{
	public static void main(String[] args)
	{
		
		Overload o1=new Overload();
		int sum=o1.add(5,6);
		System.out.println("Addition of two no:"+sum);
		int sum2=o1.add(5,6,4);
		System.out.println("Addition of three no:"+sum2);
	}
	
	
}