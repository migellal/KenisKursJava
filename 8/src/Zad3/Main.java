package Zad3;

import java.util.Scanner;

/**
 * Created by Micha³ on 2015-06-23.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.toLowerCase();
        int count;
        for(int i=97; i<123; i++) // sprawdzone empirycznie, zawiera wszystkie ma³e litery
        {
            count = 0;
            for(int j = 0; j<str.length(); j++)
            {
                if(str.charAt(j)==(char)i)
                {
                    count ++;
                }
            }
            if(count>0)
            {
                System.out.println("#"+(char)i+ " " + count);
            }
        }

    }
}
