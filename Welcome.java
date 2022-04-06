import java.lang.*;
import java.util.*;

class Welcome
{
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		String name;
		System.out.println("Enter Your Name : ");
		name = s.nextLine();
		System.out.println("Welcome To The World Of Java , Mr. " + name);
	}
}