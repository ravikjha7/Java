import java.lang.*;
import java.util.*;

class Try
{
    public static void main(String arg[])
    {
        int n;
        double d;
        String s;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        d = sc.nextDouble();
		sc.nextLine();
        s = sc.nextLine();
        System.out.println("String : " + s);
        System.out.println("Double : " + d);
        System.out.println("Int : " + n);
    }
}