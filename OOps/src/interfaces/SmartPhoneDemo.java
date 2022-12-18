package interfaces;

class Phone {
    void call() {
        System.out.println("I can Call !!!");
    }
    void sms() {
        System.out.println("I can Message !!!");
    }
}

interface Camera {
    void click();
    void record();
}

interface MusicPlayer {
    void play();
    void pause();
    void stop();
}

class SmartPhone extends Phone implements Camera,MusicPlayer {

    void videoCall() {
        System.out.println("Let's Do A Video Call !!!");
    }

    public void click() {
        System.out.println("Click A Pic !!!");
    }
    public void record() {
        System.out.println("Recod A Video !!!");
    }
    public void play() {
        System.out.println("Play A Music !!!");
    }
    public void pause() {
        System.out.println("Pause The Music !!!");
    }
    public void stop() {
        System.out.println("Stop The Music !!!");
    }
}

public class SmartPhoneDemo {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();

        // We can make a reference of Class or Interface to Hold The Object
        Phone p = s;
        Camera c = s;
        MusicPlayer m = s;
    }
}
