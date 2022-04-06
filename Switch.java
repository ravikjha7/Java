import java.lang.*;
import java.util.*;

class Switch
{
	public static void main(String[] args)
	{
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		String protocol = s.substring(0,s.indexOf(":"));
		String domain = s.substring(s.lastIndexOf(".")+1);
		switch(protocol)
		{
			case "https" :
				System.out.println("Hyper Text Transfer Protocol Secure");
				break;
			case "http" :
				System.out.println("Hyper Text Transfer Protocol");
				break;
			case "ftp" :
				System.out.println("File Transfer Protocol");
				break;
		}
		switch(domain)
		{
			case "com" :
				System.out.println("Commercial Website");
				break;
			case "gov" :
				System.out.println("Government Website");
				break;
		}
	}
}