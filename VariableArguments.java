import java.lang.*;
import java.util.*;

class VariableArguments
{
	static void show(int ...x)
	{
		for(int a : x)
		{
			System.out.println(a);
		}
	}

	static void display(int start,String ...s)
	{
		for(int i = 0; i < s.length; i++)
		{
			System.out.println(start + "." + s[i]);
			start++;
		}
	}
	
	public static void main(String[] args)
	{
		show();
		show(1);
		show(1,3,4,5);
		show(new int[]{1,2,3,4,5}); // Anonymous Array
		display(1,"John","Mark","Mox");
		display(1,new String[]{"John","Mark","Mox"});
	}
}