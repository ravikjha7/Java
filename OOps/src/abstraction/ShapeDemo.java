package abstraction;

abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    int r;
    public Circle(int r)
    {
        this.r = r;
    }
    double area() {
        return 3.14*r*r;
    }
    double perimeter() {
        return 2*3.14*r;
    }
}

class Rectangle extends Shape {
    int l,b;
    public Rectangle(int l,int b)
    {
        this.l = l;
        this.b = b;
    }
    double area() {
        return l*b;
    }
    double perimeter() {
        return 2*(l+b);
    }
}


public class ShapeDemo {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }
}
