package inheritance;

class TV {
    private String Colour;

    public void switchON() {
        System.out.println("TV Switched On !!!");
    }
    public void changeChannel() {
        System.out.println("TV Channel Changed !!!");
    }
}

class SmartTV extends TV{
    private String Colour;

    // We can Override Function written in Parent Class Using @Override
    @Override
    public void switchON() {
        System.out.println("Smart TV Switched On !!!");
    }

    @Override
    public void changeChannel() {
        System.out.println("Smart TV Channel Changed !!!");
    }
}

public class Overriding {
    public static void main(String[] args) {
        TV t = new TV();
        t.switchON();
        t.changeChannel();

        SmartTV tt = new SmartTV();
        tt.switchON();
        tt.changeChannel();


    }
}
