package lambdawithcollection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class LambdaCollectionDemo {

	public static void main(String[] args) {
		
		
		List<Integer> nums=Arrays.asList(10,12,16,23,3,5);
		
		nums.forEach(num->System.out.println(num));
		
		Map<Integer, String> numMap=new HashMap<Integer, String>();
		
		numMap.put(1, "One");
		numMap.put(2, "Two");
		numMap.put(3, "Three");
		numMap.put(10, "Ten");
		
		
		numMap.forEach((k,v)->System.out.println(k+" ---- "+v));

	}

}
