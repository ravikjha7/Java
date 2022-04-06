import java.lang.*;
import java.util.*;

class StringMethods
{
	public static void main(String[] args)
	{
		String str = "    Hello World!!!";
		System.out.println(str.length());
		str = str.toLowerCase();
		System.out.println(str);
		str = str.toUpperCase();
		System.out.println(str);
		str = str.trim();
		System.out.println(str);
		str = str.substring(1);
		System.out.println(str);
		str = str.substring(1,9);
		System.out.println(str);
		str = str.replace('L','V');
		System.out.println(str);
		
		String s = "Mr. Daulatrao Patil";
		System.out.println(s);
		if(s.startsWith("Mr.")) System.out.println("Male");
		else System.out.println("Female");
		if(s.endsWith("Patil")) System.out.println("Marathi");
		else System.out.println("Bihari");
		if(s.contains("Patil")) System.out.println("Marathi");
		else System.out.println("Bihari");
		System.out.println(s.charAt(4));
		System.out.println(s.indexOf("Daulatrao"));
		System.out.println(s.indexOf("Daulatrao",9));
		System.out.println(s.lastIndexOf("Daulatrao"));
		System.out.println(s.lastIndexOf("Daulatrao",3));
		
		String s1 = "Java";
		String s2 = "Java";
		String s4 = "java";
		String s3 = new String("Java");
		if(s1.equals(s2)) System.out.println("Same");
		else System.out.println("Different");
		if(s1.equalsIgnoreCase(s4)) System.out.println("Same");
		else System.out.println("Different");
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareToIgnoreCase(s4));
		String ans = String.valueOf(100);
		System.out.println(ans);
		System.out.println(s1.concat(s));
	}
}