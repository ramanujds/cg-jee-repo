package lambdawithcollection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class StramApiDemo {

	public static void main(String[] args) {
		
		
		List<Integer> nums=Arrays.asList(10,12,16,7,3,5);
		
		// Find Odd
		// Find Square
		// Add
		
		int sum=nums.stream().filter(num->num%2==0)
								.map(num -> num * num)
								.findFirst()
								.get();
								
		
		System.out.println(sum);

	}

}
