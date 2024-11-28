package JAVA;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter your number");
		int  number= obj.nextInt();
	
		
		if(number%400==0 || number%4==0 && number%100!=0) {
			System.out.println(number+" + is leap year");
		}
		else 
			System.out.println(number+ "is not leap year");

	}

}
