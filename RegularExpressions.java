import java.lang.*;
import java.util.*;

class RegularExpressions
{
	public static void main(String[] args)
	{
		String str = "f";
		System.out.println(str.matches(".")); // Anything but only one character
		String str1 = "b";
		System.out.println(str1.matches("[abc]"));// One Character From abc
		String str2 = "b";
		System.out.println(str1.matches("[^abc]")); // One Character Except abc
		String str3 = "7";
		System.out.println(str3.matches("[a-z0-9]")); // One Character From a - z or  0 - 9
		String str4 = "a7";
		System.out.println(str4.matches("[a-z][0-9]")); // Two Characters , first from a-z second 0-9
		String str5 = "a";
		System.out.println(str5.matches("a|b")); // One character from a or b
		String str6 = "xz";
		System.out.println(str6.matches("xz")); // Only xz
		
		String str7 = "7";
		System.out.println(str7.matches("\\w")); // One character either Alpabet or digit
		System.out.println(str7.matches("\\W")); // One character except for Alpabet or digit
		String str8 = "7";
		System.out.println(str8.matches("\\d")); // One character from digit only
		System.out.println(str8.matches("\\D")); // One character except from digit only
		
		String st = "anything";
		System.out.println(str7.matches(".*")); // Any character any number of times
		System.out.println(str7.matches("[a-z]*")); // Anything from a-z any number of times
		System.out.println(str7.matches(".+")); // Any character more than or equal to 1 times
		System.out.println(str7.matches("[a-z]?")); // Anything from a-z only one time
		System.out.println(str7.matches("[a-z]{2}")); // Anything from a-z only two times
		System.out.println(str7.matches("[a-z]{2,4}")); // Anything from a-z from 2-4 times
		
		// Email Matching
		String email = "ravi_k_jha7@gmail.com";
		System.out.println(email.matches("\\w*@gmail.*"));
	}
}