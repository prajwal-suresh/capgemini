package LetsLearn;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		// static
		int numb1=10;
		int numb2=20;
		int mul;
		mul=numb1*numb2;
		System.out.println("Mutiplication is :"+mul);
		
		// dynamic
				int num1;
				int num2;
				int mult;
				Scanner scan=new Scanner(System.in);
				System.out.println("enter two numbers");
				num1=scan.nextInt();
				num2=scan.nextInt();
				mult=num1*num2;
				System.out.println("Mutiplication is :"+mult);
				
		scan.close();

	}

}
