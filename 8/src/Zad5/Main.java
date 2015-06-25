package Zad5;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Micha³ on 2015-06-23.
 */
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int r;
        for(int i = 0; i < a; i++)
        {
            r = random.nextInt(26)+97; // daje nam to zakres od 97 do 123 czyli wszystkie ma³e litery
            stringBuilder.append((char)r);
        }
        System.out.println(stringBuilder.toString());
    }
}
