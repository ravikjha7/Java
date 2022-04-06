import java.lang.*;
import java.util.*;

class Email
{
	public static void main(String[] args)
	{
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		if(s.contains("@gmail"))
		{
			System.out.println("A Gmail");
		}
		else 
		{
			System.out.println("Not a Gmail");
		}
		int index = s.indexOf("@");
		System.out.println("Username : " + s.substring(0,index));
		System.out.println("Domain : " + s.substring(index+1));
	}
}	