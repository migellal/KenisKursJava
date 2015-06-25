import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Micha³ on 2015-06-09.
 */
public class Main {
    public static void main(String args[]) {
        createTable();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz cyfrê: ");
        try {
            int n = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Nie wprowadzi³eœ cyfry");
            System.out.println(e);
        }

        System.out.println(division(5));
    }

    public static double division(int a) {
        Scanner scanner = new Scanner(System.in);
        try {
            return a / scanner.nextInt();
        } catch (ArithmeticException e) {
            return 0;
        } catch (InputMismatchException e) {
            return 123456789;
        } catch (Exception e) {
            return 0;
        } finally {
            System.out.println("finally");
        }

    }

    public static void createTable() {
        int tab[] = new int[10];

        try {
            tab[10] = 8;
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
