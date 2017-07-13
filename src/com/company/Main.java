package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int userInput;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a number:  ");
        userInput = scan.nextInt();

        System.out.println("\tNumber" + "\tSquared\t" + "Cubed\t");

	for (int i = 0; i <= userInput; i++) {

        System.out.println(("\t" + i + "\t" + "\t" + (int) (Math.pow(i, 2)) + "\t" + "\t" + (int) (Math.pow(i,3)) + "\t"));
        }

    }
}
