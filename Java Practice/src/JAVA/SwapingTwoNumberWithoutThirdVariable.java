package JAVA;

public class SwapingTwoNumberWithoutThirdVariable {

	public static void main(String[] args) {
		int a=10; int b=20;
		
		System.out.println("before swaping a value is"+a);
		System.out.println("before swaping a value is"+b);
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
		a=a/b;
		b=b/a;
		
		System.out.println("---------------------------------");
		System.out.println("after swaping a value is"+a);
		System.out.println("after swaping a value is"+b);

	}

}
