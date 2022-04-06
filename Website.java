import java.lang.*;
import java.util.*;

class Website
{
	public static void main(String[] args)
	{
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		if(s.startsWith("https")) System.out.println("Hyper Text Transfer Protocol Secure");
		else if(s.startsWith("http")) System.out.println("Hyper Text Transfer Protocol");
		else if(s.startsWith("ftp")) System.out.println("File Transfer Protocol");
		
		if(s.endsWith("com")) System.out.println("Commercial Website");
		else if(s.endsWith("gov")) System.out.println("Government Website");
		else if(s.endsWith("org")) System.out.println("Non Profit Website");
		else if(s.endsWith("net")) System.out.println("Network Website");
	}
}