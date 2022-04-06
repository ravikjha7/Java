import java.lang.*;
import java.util.*;

class Rotate
{
	static void reverse(int arr[],int low,int n)
	{
		int i = low;
		int j = n;
		while(i < j)
		{
			int temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}
	}
	public static void main(String[] args)
	{
		int n,k;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		reverse(arr,0,n-1);
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		// System.out.println(arr);
	}
}