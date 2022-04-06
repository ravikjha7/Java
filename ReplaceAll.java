import java.lang.*;
import java.util.*;

class ReplaceAll
{
	public static void main(String[] args)
	{
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		System.out.println(s.replaceAll("[^A-Za-z0-9]",""));
		
		String s1;
		sc.nextLine();
		s1 = sc.nextLine();
		System.out.println(s1.replaceAll("\\s+"," ").trim());
		
		String s2;
		// sc.nextLine();
		s2 = sc.nextLine();
		System.out.println(s2.split("\\s+").length);
	}
}