package Zad2;

import java.util.Scanner;

/**
 * Created by Micha³ on 2015-06-23.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.toLowerCase();
        str = str.replaceAll(" ", "");
        char[] chars = str.toCharArray();
        char[] chars2 = new char[chars.length];
        int count = 0;
        for(int i=chars.length-1; i>=0; i--)
        {
            chars2[count] = chars[i];
            count++;
        }
        boolean theSame = true;
        for(int i=0; i<chars.length; i++)
        {
            if(chars[i]!=chars2[i])
                theSame=false;
        }
        System.out.println("Result is " + theSame);

    }

}
