package MethodsExample;

public class StaticExample {
	//static and non static methods importance and rules.
	
	
	static int a=10; // static
	int b=20;  // non static
	
	
	public static void m1() {      // this is Static method and m1() is class name.
		System.out.println(" this is static method m1");
	}
	
	public  void m2() {          // this is non Static method m2() is class name.
		System.out.println(" this is Non static method m2");
	}
	
	public void m3() {          
		System.out.println("=========> this is method m3");
		
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	public static void main(String[] args) {
		//main method is always static because we don't need to create object for this.
		
		// rule 1 :- Static methods can access static members directly. (without creating the object)
		
		System.out.println(a);
		m1();
		
		// rule 2 :- Static methods can also access non static members through objects only.
		
		StaticExample se = new StaticExample();
		System.out.println(se.b);
		se.m2();
		
		// rule 3 :- Non Static methods can access both static and non static members directly.
		StaticExample se1 = new StaticExample();
		
		se1.m3();
	}
	
}

