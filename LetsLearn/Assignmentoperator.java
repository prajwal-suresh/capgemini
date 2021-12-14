package LetsLearn;

import java.util.Scanner;

public class Assignmentoperator {

	public static void main(String[] args) {
		// static
		int numb1=32;
		int numb2=43;
		numb1+=32;
		numb2-=32;
		numb2*=32;
		numb1/=32;
		numb2%=32;
		System.out.println("number1: "+numb1);
		System.out.println("number2: "+numb2);
		
		//dynamic
		int num1;
		int num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the two numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num1+=12;
		num2-=8;
		numb2*=10;
		num1/=5;
		num2%=2;
		System.out.println("number1: "+num1);
		System.out.println("number2: "+num2);
		scan.close();
		
		
		
	}

}
