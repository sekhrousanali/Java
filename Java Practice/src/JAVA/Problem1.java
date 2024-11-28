package JAVA;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("Today Date");
		String Date= obj.next();
		System.out.println("Customer Name");
		String CustomerName=obj.next();
		System.out.println("Address");
		String Address=obj.next();
		System.out.println("Item Description");
		String Item=obj.next();
		System.out.println("Quantity");
		int Quantity=obj.nextInt();
		System.out.println("unit Price");
		long UnitPrice=obj.nextLong();
		System.out.println("_____________________________________________________________________");
		System.out.println("Date-:"+Date);
		System.out.println("Customer Name-:"+CustomerName);
		System.out.println("Address-:"+Address);
		System.out.println("Item Description-:"+Item);
		System.out.println("Quantity"+Quantity);
		System.out.println("Unit Price-:"+UnitPrice);
		


	}

}
