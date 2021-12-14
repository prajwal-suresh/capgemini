package LetsLearn;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String original_string,reverse_string="";
		System.out.println("enter the string to be reversed");
		original_string=scan.nextLine();
		int len=original_string.length();
		for(int i=len-1;i>=0;i--)
		{
			reverse_string=reverse_string+original_string.charAt(i);
		}
		System.out.println("reverse string is: "+reverse_string);
		scan.close();

	}

}
