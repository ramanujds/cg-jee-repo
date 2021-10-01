package lambdaexpression;

import java.util.Arrays;
import java.util.List;

interface Test1{
	MethodReference getObj();
}

public class MethodReference {

	public  int makeSquares(int num) {
		int sq=num*num;
		System.out.println(sq);
		return sq;
	}
	
	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(5,8,2,6,1,7);
		
		Test1 m1=MethodReference::new;
		
		m1.getObj();
		

	}

}
