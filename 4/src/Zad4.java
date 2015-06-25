import java.util.Scanner;

/**
 * Created by Micha³ on 2015-04-30.
 * 4.	Zadanie po angielsku. Stwórz system do robienia wizytówek. Odpytaj u¿ytkownika o imiê (name),
 * nazwisko (surname), numer telefonu (telephone w typie int). Nastêpnie wydrukuj to w ³adny sposób,
 * tzn ramka i mo¿e jakieœ efekty, wedle woli i chêci.
 */
public class Zad4 {
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();
        int telephone = scanner.nextInt();

        System.out.println("*______________________________*");
        System.out.println("| NAME          " + name );
        System.out.println("| SURNAME       " + surname );
        System.out.println("| TELEPHONE     " + telephone );
        System.out.println("*______________________________*");
    }

}
