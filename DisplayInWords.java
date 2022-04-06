import java.lang.*;
import java.util.*;

class DisplayInWords
{
	public static void main(String[] args)
	{
		String ans;
		Scanner sc = new Scanner(System.in);
		ans = sc.next();
		for(int i = 0; i < ans.length(); i++)
		{
			switch (ans.charAt(i))
			{
				case '0' :
					System.out.print("Zero ");
					break;
				case '1' :
					System.out.print("One ");
					break;
				case '2' :
					System.out.print("Two ");
					break;
				case '3' :
					System.out.print("Three ");
					break;
				case '4' :
					System.out.print("Four ");
					break;
				case '5' :
					System.out.print("Five ");
					break;
				case '6' :
					System.out.print("Six ");
					break;
				case '7' :
					System.out.print("Seven ");
					break;
				case '8' :
					System.out.print("Eight ");
					break;
				case '9' :
					System.out.print("Nine ");
					break;
			}
		}
		System.out.println();
	}
}