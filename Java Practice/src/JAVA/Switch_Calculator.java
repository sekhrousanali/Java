package JAVA;

import java.util.Scanner;

public class Switch_Calculator {

	public static void main(String[] args) {
		String yn;
		Scanner obj= new Scanner(System.in);
		do {
			 
		System.out.println("Enter Your First Number");
		int Num1=obj.nextInt();
		System.out.println("Enter Your 2nd Number");
		int Num2=obj.nextInt();
		System.out.println("Chose ur symble(+,/,%,-,*)");
		String symble=obj.next();
		long res;
		
		switch(symble) 
		{
		case "+": res=Num1+Num2;
		        System.out.println("Addition is="+res);
		        break;
		case "-": res=Num1-Num2;
        System.out.println("subtraction is="+res);
        break;
		case "/": res=Num1/Num2;
        System.out.println("divison is="+res);
        break;
		case "*": res=Num1*Num2;
        System.out.println("multiplication is="+res);
        break;
		default:System.out.println("invalid Symbol");
		      
		
		}System.out.println("do You Want to continue Yes for Y No for N");
		yn=obj.next();
		
	}while(yn.equals("Y")||yn.equals("y"));

   }
}
