package JAVA;

import java.util.Scanner;

public class FcatrialUsingForLoop {

	public static void main(String[] args) {
		System.out.println("Enter Your Number");
		Scanner obj= new Scanner(System.in);
		int no= obj.nextInt();
		int fact =1;int i;
		
		for( i=1; i<=no;i++) {
			
			fact=fact*i;
			System.out.println(fact);
		}
		System.out.println("Final Factorial value is  "+fact);
		System.out.println("Final Factorial value is  "+fact);

	}

}
