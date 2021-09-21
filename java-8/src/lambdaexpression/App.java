package lambdaexpression;


interface StringLength{
	
	int getLength(String str);
	
}

public class App {

	public static void main(String[] args) {
		
//		MathOperation operation=new MathOperation() {
//			
//			@Override
//			public int add(int x, int y) {
//				return x+y;
//			}
//		};
		
		StringLength strLen= str -> str.length();
		
		MathOperation operation= (x, y) ->  x+y;
		
		
//		int sum=operation.add(10, 15);
//		
//		System.out.println("Sum = "+sum);

	}

}
