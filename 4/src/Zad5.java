import java.util.Scanner;

/**
 * Created by Micha³ on 2015-04-30.
 * 5.	Pobierz od u¿ytkownika dowolny tekst, nastêpnie pobierz liczbê. Nastêpnie spytaj, czy wydrukowaæ dany tekst?
 * W zale¿noœci od odpowiedzi, 1 oznacza tak, 2 oznacza nie, wykonaj zadanie, tzn wydrukuj tyle razy, jak¹ liczbê poda³
 * u¿ytkownik. Jeœli u¿ytkownik wpisze coœ innego ni¿ 1 lub 2, wypisz nie zrozumia³em, wybierz odpowiedŸ jeszcze raz.
 */
public class Zad5 {
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int number = scanner.nextInt();
        int print = 0;
        boolean b = true;
        System.out.println("Wydrukowac podany tekst? 1-tak 2-nie");
        while(b)
        {
            print = scanner.nextInt();
            if(print==1||print==2)
            b = false;
            else
                System.out.println("Nie zrozumialem, wydrukowac podany tekst? 1-tak 2-nie");
        }

        if(print==1)
            for(int i = 0; i<number; i++)
                System.out.println(text);
    }

}
