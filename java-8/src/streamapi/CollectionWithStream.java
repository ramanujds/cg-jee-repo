package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionWithStream {

	public static void main(String[] args) {
		
		Stream<Integer> streams= Stream.of(10,13,14,16,9,59,6);
		
//		int oddSum= streams.filter(i->i%2!=0).reduce((s,a)->a<s?a:s).get();
		
		int oddSum= streams.filter(i->i%2!=0).mapToInt(i->i).min().getAsInt();
		
		
		
		System.out.println("Total Odds = "+oddSum);
		
//		List<String> names=Arrays.asList("Harish","Mohan","Riya","Archit","Karthik");
//		
//		
//		String ch="x";
//		
//		List<String> namesWithA = names.stream()
//										.filter(name->name.toLowerCase().contains("r"))
//										//.map(String::toUpperCase)
//										.collect(Collectors.toList());
//		
//		System.out.println(namesWithA.equals(names));
		
		
		
		
		
	}
	
	
	
	
}
