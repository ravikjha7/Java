import java.io.*;
import java.util.Scanner;

// Problem : Memory Leak
// Solution :
// 1) Close File Using Finally Block
// 2) Write FileInputStream Inside Try Block Only

public class ResourcesDemo {
    static FileInputStream f1;
    static Scanner sc;

    // If we write something inside Try Block, It Automatically Closes It when Try Block Is Over !!!
    static void Divide2() throws Exception {
        try (FileInputStream f2 = new FileInputStream("/home/thelunatic/IdeaProjects/ErrorHandling/src/first.txt"); Scanner sc2 = new Scanner(f2);){
            int a = sc2.nextInt();
            int b = sc2.nextInt();
            int c = sc2.nextInt();

            System.out.println(a / c);
        }
    }

    static void Divide() throws Exception {
        f1 = new FileInputStream("/home/thelunatic/IdeaProjects/ErrorHandling/src/first.txt");
        try {
            sc = new Scanner(f1);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println(a / c);
        } finally {
            // If we are writing inside finally block, it will always be closed;
            f1.close();
            // sc.close();
        }
    }

    public static void main(String[] args) {
        try {
            Divide2();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
