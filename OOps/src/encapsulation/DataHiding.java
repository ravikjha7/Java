package encapsulation;

class DataHiding {
    // Making variables private will make it not accessible to user Out Of Class
    private int length;
    private int breadth;

    // Get Function To Return Value Of Length
    public int getLength() {
        return length;
    }

    // Set Function To Set Value Of Length
    public void setLength(int l) {
        length = l;
    }

    // Get Function To Return Value Of Length
    public int getBreadth() {
        return breadth;
    }

    // Set Function To Set Value Of Length
    public void setBreadth(int b) {
        breadth = b;
    }

    // Area Function
    public int area() {
        return length*breadth;
    }

    // Perimete Function
    public int perimeter() {
        return 2*(length + breadth);
    }

    public static void main(String[] args) {
        DataHiding d = new DataHiding();

        // d.length = 7 ---> Not Allowed
        // d.breadth = 3 --> Not Allowed

        // Using Set Function To Set Values Of Length and Breadth
        d.setLength(7);
        d.setBreadth(3);

        // Using Get Function To Access Values Of Length and Breadth
        System.out.println(d.getBreadth());
        System.out.println(d.getLength());

        // Methods of Data Hiding Class
        System.out.println(d.area());
        System.out.println(d.perimeter());

    }
}