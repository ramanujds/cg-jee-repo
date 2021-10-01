package regexbasics;

import java.util.regex.Pattern;

public class RegexExpressions {

	public static void main(String[] args) {
		
		
		String pattern;
		
		// Regex Classes
		
		// one character a/b/c
		pattern="[abc]";
		
		// one character other than abc
		
		pattern="[^abc]";
		
		// any char from a to z
		
		pattern="[a-z]";
		
		pattern="[a-zA-Z]";
		
		
		// Intersection
		
		pattern="[a-y&&[xyz]]";
		
		
		// Union
		
		pattern="[a-p[m-x]]";
		
		// Excluding x and y
		
		pattern = "[a-z&&[xy]]";
		
		
		// Regex Quantifiers
		
		
		// Zero or More Occurrences of abc
		pattern = "[abc]*";
		
		// At least one occurrence of abc
		pattern = "[abc]+";
		
		
		// Pattern for Person Name 
		
		pattern="[a-zA-Z]{3,}";
		
		
		// Zero or Only one occurrences
		
		pattern = "[abc]?";
		
		// One time only
		
		pattern = "[abc]{1}";
		
		// Two or More time
		
		pattern = "[abc]{2}";
		
		// Two to Five times
		
		pattern = "[abc]{2,5}";
		
		
		// Metacharacters (Shortcuts)
		
		// \d any digit [0-9]
		
		// \D non digit [^0-9]
		
		// \s any space
		
		// \w any word
		
		String emailPattern="[A-Za-z0-9+_.-]+@[a-zA-Z0-9]+\\.[a-z]+";
		
		String phoneNoPattern="\\d{10}";
		
		String phone="7867543217";
		
		Pattern pattern1=Pattern.compile(phoneNoPattern);
		
		boolean match=pattern1.matcher(phone).matches();
		
		System.out.println(match);
		

	}

}
