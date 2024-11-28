package JAVA;

import java.util.Scanner;

public class Odd_Even_number {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		int number=obj.nextInt();
		if(number%2==0) {
			System.out.println("NUmber is even");
		
		}else
			System.out.println("NUmber is odd");
		
	}

}
