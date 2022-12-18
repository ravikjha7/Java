package classes;

class Rectangle {
    private int length;
    private int breadth;

    // Non Parametrised Constructor
    public Rectangle() {
        length = 1;
        breadth = 1;
    }

    // Parametrised Constructor
    public Rectangle(int l,int b) {
        length = l;
        breadth = b;
    }

    public int area() {
        return length*breadth;
    }

    public int perimeter() {
        return 2*(length + breadth);
    }
}

class Constructor {
    public static void main(String[] args) {
        // Making Object With Non Parametrised Constructor
        Rectangle r = new Rectangle();

        System.out.println(r.area());
        System.out.println(r.perimeter());

        // Object With Parametrised Constructor
        Rectangle r1 = new Rectangle(7,3);

        System.out.println(r1.area());
        System.out.println(r1.perimeter());

    }
}