package tp2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

    //Now we want to create a program that takes a file name and prints it s content

    public static void main(String[] args) {
        System.out.println("Give me your file name :)"); //try isi as an input ;)
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        printFileContent(fileName);
        scanner.close();
    }

    //Here you have 2 methods
    // getFileContent aims to get the content of a file
    // printFileContent that prints it s content otherwise print 'file not found :/'
    // todo : implement the methods and force exception handling in the printFile method

    private static String getFileContent(String fileName) {
        File file = new File("src/exp3/" + fileName);
        //the lines below help you to get the content
       try {
        Scanner reader = new Scanner(file);
        String content = reader.nextLine();
        return content;
       } catch (FileNotFoundException e) {
           //TODO: handle exception
           return "file not found" ;
       }
        
    }

    private static void printFileContent(String fileName) {
        String data = getFileContent(fileName);
        System.out.println(data);
    }
}
