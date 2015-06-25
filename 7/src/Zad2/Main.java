package Zad2;

/**
 * Created by Micha³ on 2015-06-23.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int i)
    {
        if (i == 0)
            return 1;
        else
            return i * factorial(i - 1);
    }


}
