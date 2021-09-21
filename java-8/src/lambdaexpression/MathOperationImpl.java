package lambdaexpression;

public class MathOperationImpl {

	public int calculate(int x, int y, MathOperation op) {
		return op.operate(x, y);
	}
	
	public static void main(String[] args) {
		
		MathOperationImpl obj=new MathOperationImpl();
		
//		MathOperation multiply=new MathOperation() {
//		
//			public int operate(int x, int y) {
//				return x*y;
//			}
//		};
		
		int result=obj.calculate(5, 10, (x,y)->{
			System.out.println("This is a Multiplication Operation");
			return x*y;
		});
		
		System.out.println(result);
		
		result =obj.calculate(16, 10, (a,b)->a-b);
		
		System.out.println(result);
	}
	
}
