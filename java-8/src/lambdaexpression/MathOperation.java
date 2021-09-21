package lambdaexpression;

@FunctionalInterface
public interface MathOperation {

	int operate(int x, int y);
	
	default void show() {
		System.out.println("...");
	}
	
}


