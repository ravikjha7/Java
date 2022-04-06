import java.lang.*;
import java.util.*;

class Armstrong
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int sum = 0;
		int temp = n;
		while(n > 0)
		{
			int r = n % 10;
			sum += (Math.pow(r,3));
			n /= 10;
		}
		n = temp;
		if(n == sum) System.out.println("Armstrong Number");
		else System.out.println("Not An Armstrong Number");
	}
}