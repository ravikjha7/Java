import java.lang.*;

class Variables
{
	public static void main(String arg[])
	{
		// byte b => Not allowed without initialisation , you cannot print
		byte b;
		b = 9; // Allowed , Variables Are MutableAttrListImpl
		// b = 130; // Not Allowed , Out of Range Of Byte
		
		float f = 2.35f;
		System.out.println(b);
		System.out.println(f);
	}
}