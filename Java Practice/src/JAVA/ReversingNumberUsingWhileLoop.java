package JAVA;

import java.util.Scanner;

public class ReversingNumberUsingWhileLoop {

	public static void main(String[] args) {
		int rev=0;
		Scanner obj;
		int reminder;//
		 obj= new Scanner(System.in);
		System.out.println(" Enter your Number ");
		int num = obj.nextInt();		
		while(num!=0) {
			reminder=num%10;//last value
			rev=rev*10+reminder;//adding from last one by one
			num=num/10;//give you without last value
		}
		System.out.println("Your reversing number is "+rev);
		
		int num1 = 123;
		int rev1=0;
		int rem1;
		
		while(num1 !=0) {
			rem1=num1%10;
			rev1=rev1*10+rem1;
			num1=num1/10;
		}
		System.out.print(rev1);
		
	}
	
	

}
