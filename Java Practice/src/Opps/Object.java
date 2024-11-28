package Opps;

public class Object {

	public static void main(String[] args) {
		Object obj=new Object();
		//MethodClass obj1= new MethodClass();
		obj.method1();
		method2();
		MethodClass.method3();
		

	}
	//1.if you dont want return anythigs the use return type void
	public void method1() {
		System.out.println("Method 1 dose not return any things");
		
	}
	//if you want to call this in a same class without creating an object then declared "static" Method
	public static void method2() {
		System.out.println("Method 2 no static dose not need to create any object for call this method ");
		
	}

}
