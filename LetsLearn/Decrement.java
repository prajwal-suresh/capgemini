package LetsLearn;

import java.util.Scanner;

public class Decrement {

	public static void main(String[] args) {
		// static
		int let=10;
		let--;
		System.out.println(let);
		--let;
		System.out.println(let);
		
		//dynamic
		int say;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to decrement");
		say=scan.nextInt();
		System.out.println(say);
		say--;
		System.out.println(say);
		--say;
		System.out.println(say);
		scan.close();

	}

}
