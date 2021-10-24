package tp2;

import java.util.Scanner;

public class num {

    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner scanner = new Scanner(System.in);

        //get input from console
        String line = scanner.nextLine();

        //convert it to number
        
        try {
        	int num = Integer.parseInt(line);
        	System.out.println("It's a number :)");
        }catch (NumberFormatException e) {
        // todo print the answer based on the input
        System.out.println("It's not a number :(");
    }
}}

