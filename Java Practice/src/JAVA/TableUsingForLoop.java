package JAVA;

import java.util.Scanner;

public class TableUsingForLoop {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num=obj.nextInt();
		int i;
		     for( i=1; i<=10; i++) {
		    	 
		    	System.out.println(num+"*"+i+"="+num*i);
		     }
    	}

}
