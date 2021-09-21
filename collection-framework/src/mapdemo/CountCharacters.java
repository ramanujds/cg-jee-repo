package mapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		String inputString=scan.nextLine();
		
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		
		char[] chars=inputString.toCharArray();
		
		for(char ch:chars) {
			if(charMap.containsKey(ch)) {
				int count=charMap.get(ch)+1;
				charMap.put(ch, count);
			}
			else {
				charMap.put(ch, 1);
			}
		}
		
//		for(char ch:charMap.keySet()) {
//			System.out.println(ch+" -- "+charMap.get(ch));
//		}
		
		charMap.forEach((ch,count)->System.out.println(ch+" -- "+count));
		

	}

}
