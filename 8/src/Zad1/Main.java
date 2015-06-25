package Zad1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Micha³ on 2015-06-23.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count = 0;
        int x, y;
        int result = 1;
        while (result!=0)
        {
            x = random.nextInt(10)+1;
            y = random.nextInt(10)+1;
            System.out.print(x + " * " + y + " = ");
            result = scanner.nextInt();
            if(result==x*y) {
                System.out.println("Good!");
                count++;
            }
            else {
                if (result != 0)
                    System.out.println("Bad...");
            }
            if(count==10)
            {
                System.out.println("Good Job!");
                count = 0;
            }
        }

    }

}
