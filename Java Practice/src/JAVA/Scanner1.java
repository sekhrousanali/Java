package JAVA;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		
		
		Scanner obj= new Scanner(System.in);
		System.out.println("write your name");
		String name=obj.next();
		System.out.println("Type your Genader");
		char Gender=obj.next().charAt(0);
		System.out.println("type your age");
		int age= obj.nextInt();
		System.out.println("Phone Number");
		long Phone=obj.nextLong();
		System.out.println("-------------------------");
		System.out.println("Name-:"+name);
		System.out.println("Gender-:"+Gender);
		System.out.println("Age-:"+age);
		System.out.println("Phone Number-:j"+Phone);
		
		}

}
