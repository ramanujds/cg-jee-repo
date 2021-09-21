package defaultmethod;

public interface MyInterface {

	void show();
	
	default void fun() {
		System.out.println("Java 8 is Fun");
	}
	
	static void staticFun() {
		System.out.println("I am stable");
	}
	
}
