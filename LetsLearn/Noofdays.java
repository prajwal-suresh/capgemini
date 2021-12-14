package LetsLearn;

import java.util.Scanner;

public class Noofdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the month");
	    month=scan.nextInt();
		scan.close();
		switch (month) {
		case 1:
			System.out.println("Number of days in jan is 31  ");
			break;
		case 2:
			System.out.println("Number of days in Feb is 28  ");
			break;
		case 3:
			System.out.println("Number of days in march is 31  ");
			break;
		case 4:
			System.out.println("Number of days in April is 30  ");
			break;
		case 5:
			System.out.println("Number of days in May is 31  ");
			break;
		case 6:
			System.out.println("Number of days  in  Jun is 30  ");
			break;
		case 7:
			System.out.println("Number of days  in July is 31  ");
			break;
		case 8:
			System.out.println("Number of days in  Augast is 31 ");
			break;
		case 9:
			System.out.println("Number of days in Sept is 30  ");
			break;
		case 10:
			System.out.println("Number of days in October is 31  ");
			break;
		case 11:
			System.out.println("Number of days in Nov is 30 ");
			break;
		case 12:
			System.out.println("Number of days in Dec is 31  ");
			break;
		default:
			System.out.println("Invalid Input");
		}

	}

}
