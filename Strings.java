import java.lang.*;
import java.util.*;

class Strings
{
	public static void main(String[] args) 
	{
		String s = "Hello Java"; // We are not creating using new so object is created in pool
		System.out.println(s);
		String str = "Hello Java"; // str will Point To Same Object
		System.out.println(str);
		
		System.out.println(str == s); // If they are pointing to same object then true
		
		// Constructors
		char c[] = {'a','b','c','d'};
		String str1 = new String(c);
		String str4 = new String(c,2,2); // String starting form position 2 and size = 2
		System.out.println(str1);
		System.out.println(str4);
		
		byte b[] = {65,66,67,68};
		String str2 = new String(b);
		String str5 = new String(b,2,2); // String starting form position 2 and size = 2
		System.out.println(str2);
		System.out.println(str5);
		
		String str3 = new String("Hello Java");
		System.out.println(str3);
		
	}
}