package lambdaexpression;

interface Test{
	int calculate(int x);
}

public class InterfaceWithLambda {

	public static void main(String[] args) {
		
		Test t1= a -> ++a;
		
		System.out.println(t1.calculate(15));

	}

}
