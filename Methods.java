import java.lang.*;
import java.util.*;

class Methods
{
	static int max(int a,int b)
	{
		if(a > b) return a;
		return b;
	}
	int min(int a,int b)
	{
		if(a < b) return a;
		return b;
	}
	public static void main(String[] args)
	{
		int a = 7, b = 3;
		System.out.println("Maximum Element : " + max(a,b));
		Methods mp = new Methods();
		System.out.println("Minimum Element : " + mp.min(a,b));
	}
}