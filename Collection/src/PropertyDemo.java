import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class PropertyDemo {
    public static void main(String[] args) {
        Properties p = new Properties();

        p.setProperty("Name","Abhi");
        p.setProperty("Speciality","CP");

        // p.store(new FileOutputStream("/home/thelunatic/Downloads/Ravi.txt"), "Abhijit Puri");
    }
}
