import java.lang.*;
import java.util.*;

class Arrays
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		int maxm = 0;
		int second_maxm = 0;
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i] > maxm) 
			{
				second_maxm = maxm;
				maxm = arr[i];
			}
			if(arr[i] > second_maxm && arr[i] < maxm) second_maxm = arr[i];
		}
		System.out.println(second_maxm);
	}
}