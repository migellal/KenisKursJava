import java.util.Scanner;

/**
 * Created by Micha³ on 2015-04-30.
 */
/*
* 1.	SprawdŸ, czy wprowadzona przez u¿ytkownika liczba jest pierwsza (0 i 1 nie s¹ pierwsze, 2 jest liczb¹ pierwsz¹,
* dalej standardowa definicja). Do sprawdzenia u¿yj prostego algorytmu, sprawdzaj¹cego czy liczba dzieli siê przez wszystkie
* liczby mniejsze od jej po³owy. Jeœli dzieli siê przez któr¹kolwiek, nie jest pierwsza.*/

public class Zad1 {

    public static void main (String args[]) {
        System.out.println("Wprowadz liczbe, a ja sprawdze, czy jest pierwsza: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // u¿ytkownik wproawadza liczbê
        int limit = n/2; // ustalamy limit do którego bêdziemy dzieliæ, na po³owê wprowadzonej liczby, jeœli liczba jest nie parzysta, jest to po³owa minus 0.5, o czym ju¿ mówi³em, przy t³umaczeniu typu int
        boolean isPrime = true;
        String yes = "Liczba " + n + " jest pierwsza";
        String no = "Liczba " + n + " NIE jest pierwsza";

        if(n==0||n==1||n==4) // dlaczego znajduje siê tutaj liczba 4? Poniewa¿ jeœli spojrzymy na nasz prosty algorytm, to zgodnie z jego logik¹, 4 zostanie uznane za liczbê pierwsz¹
            isPrime=false;
        else if (n==2||n==3) // dlaczego znajduje siê tutaj liczba 3? Tylko dla porz¹dku, po co wrzucaæ j¹ w algorytm, skoro wiemy, ¿e jest pierwsza?
            isPrime=true;
        else { // algorytm startuje dla liczb wiêkszych ni¿ 4
            for (int i = 2; i < limit; i++) {
                if (n % i == 0) { // w pierwszym kroku pêtli sprawdzamy, czy dzieli siê przez dwa, to wtedy odpada najwiêcej liczb
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime)
            System.out.println(yes);
        else
            System.out.println(no);

        /* Problem poszukiwania liczby pierwszej, to z³o¿ony informatyczny problem, a nasze rozwi¹zanie jest bardzo proste i na
        pewno nie optymalne. Zachêcam do zapoznania siê z innymi metodami pozyskiwania liczby pierwszej
        * */

    }
}
