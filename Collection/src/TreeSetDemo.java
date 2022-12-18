import java.util.List;
import java.util.TreeSet;

class Point implements Comparable{
    int x;
    int y;

    public Point(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return "x = " + x + " y = " + y;
    }

    public int compareTo(Object o)
    {
        Point p = (Point)o;
        if(this.x < p.x) return -1;
        else if(this.x > p.x) return 1;
        else if(this.y < p.y) return -1;
        else if(this.y > p.y) return 1;
        return 0;
    }
}

public class TreeSetDemo {
    public static void main(String[] args) {

        // TreeSet Of Our Required Class
        TreeSet<Point> ts1 = new TreeSet<Point>();

        ts1.add(new Point(1,1));
        ts1.add(new Point(5,5));
        ts1.add(new Point(5,2));

        System.out.println(ts1);

        // Set in C++
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,20,30,40,50,30,20));

        // Adding Elements To Tree Set
        ts.add(65);

        // Ceiling -> Returns The Nearest Greater Than Equal To Value
        System.out.println(ts.ceiling(60));
        // Floor -> Returns The Nearest Less Than Equal To Value
        System.out.println(ts.floor(45));

        System.out.println(ts);
    }
}
