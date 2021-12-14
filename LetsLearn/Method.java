package LetsLearn;

public class Method {
	
	static void add(int a,int b)
	{
		int add;
		add=a+b;
		System.out.println("Addition is :"+add);
	}
	
	static int sub(int a,int b)
	{
		int sub;
		sub=a-b;
		return sub;
	}
	static void mul(int a,int b)
	{
		int res;
		res=a+b;
		System.out.println("Subtraction is :"+res);
	}
	static void div(int a,int b)
	{
		int res;
		res=a+b;
		System.out.println("Division is :"+res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=7,j=3;
		add(i,j);
		System.out.println("Subtraction is: "+sub(i,j));
		mul(i,j);
		div(i,j);
	}

}
