package setdemo;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetOfStringReversed {

	public static void main(String[] args) {
		
		Comparator<String> revString=new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				return s2.compareToIgnoreCase(s1);
			}
		};
		
		Set<String> names=new TreeSet<String>(revString);
		
	
		
		names.add("rahul");
		names.add("Mahesh");
		names.add("Anil");
		names.add("Rachana");
		names.add("X");
		
		for(String name:names) {
			System.out.println(name);
		}

	}

}
