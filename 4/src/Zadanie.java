import java.util.Scanner;

/**
 * Created by Micha? on 2015-04-27.
 */
public class Zadanie {

    /*
    * U?ytkownik podaje 3 warto?ci liczbowe typu int. Sprawd?, czy te podane 3 cyfry mog? by? ramionami trójk?ta
    * */

    public static void main (String args[])
    {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        a = scanner.nextInt();
        System.out.print("b=");
        b = scanner.nextInt();
        System.out.print("c=");
        c = scanner.nextInt();

        if(a<b+c||b<a+c||c<a+b)
        {
            System.out.println("Tak.");
        }
        else
            System.out.println("Nie.");
    }
}
