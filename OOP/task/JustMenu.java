package epam.OOP.task;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class JustMenu {
    public static int variants(/*byte changer*/Scanner scanner) {
        int changer = -1;
        /*Scanner scanner = new Scanner(System.in);*/
        try {
            System.out.println("=========================");
            System.out.println("1. Create a train.");
            System.out.println("2. Print piece of Info.");
            System.out.println("0. End program.");
            System.out.println("=========================");
            changer = scanner.nextByte();
        } catch (NoSuchElementException ex) {
            System.out.println("HERE");
        }

        return changer;
    }
}
