package Zad1;

import java.util.Scanner;

/**
 * Created by Micha³ on 2015-06-23.
 */
public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(getText());
        System.out.println(a);
    }

    public static String getText()
    {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
