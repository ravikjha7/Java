import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class FileDemo {
    public static void main(String[] args)
    {
        File myfile = new File("data.txt");
        File newfile = new File("newEse.txt");
        try{
            newfile.createNewFile();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

        try{
            FileWriter file1 = new FileWriter("newEse.txt");
            Scanner sc = new Scanner(myfile);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                file1.write(line);
            }
            file1.close();
            System.out.println("Content has been copied from one file to another succesfully");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }
}