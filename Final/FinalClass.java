package Final;

final class Example{
	
}
public class FinalClass extends Example{  
	//This will gives an error since final can't be inherited
	void method() {
		System.out.println("SubClass Method..!");
	}
	public static void main(String[] args) {
		FinalClass obj = new FinalClass();
		obj.method();	
	}
}
