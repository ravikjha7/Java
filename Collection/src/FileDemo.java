import java.io.*;
import java.util.*;

public class FileDemo {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        sc.close();
        String curr_path = "/home/thelunatic/Desktop/";
        File obj = new File(curr_path  + s);
        if(obj.exists()) {
            System.out.println("File Already Exists !!!");
            System.out.println("Do You Want To Append To File?? Press Y for Yes, N for No");
            char c;
            Scanner sc2 = new Scanner(System.in);
            c = sc2.next().charAt(0);
            if(c == 'Y') {
                FileWriter fw = null;
                BufferedWriter bw = null;
                PrintWriter pw = null;

                try {
                    fw = new FileWriter(curr_path + s,true);
                    bw = new BufferedWriter(fw);
                    pw = new PrintWriter(bw);

                    pw.println("Rao");
                    pw.println("Abhi");

                    System.out.println("Data SuccessFully Added !!!");
                    pw.flush();
                }
                catch(IOException io) {
                    System.out.println("An Error Occured !!!");
                }
                finally {
                    try {
                        pw.close();
                        bw.close();
                        fw.close();
                    } catch(IOException io) {

                    }
                }
            }
        }


    }
}
