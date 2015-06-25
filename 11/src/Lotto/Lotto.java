package Lotto;

import java.math.BigInteger;

/**
 * Created by Micha³ on 2015-06-25.
 * Z racji, ¿e to ju¿ ostanie, dzisiaj równie¿ bêdzie jedno zadanie. Bêdzie wymaga³o poszukania dodatkowych
 * informacji, o których nie mówi³em podczas kursu, ale taka rola programisty, ca³y czas siê rozwija i szuka
 * rozwi¹zañ, do dzie³a!

 Napisz program obliczaj¹cy szansê na wygranie w lotto. Wzór wygl¹da tak:

 k!
 ---------
 k!(n-k)!

 czyli

 49!
 ---------
 6!(49-6)!


 Powodzenia!
 */
public class Lotto {

    public static BigInteger factorial(int a)
    {
        BigInteger s = new BigInteger("1");
        for(int i=1; i<=a; i++)
        {
            s = s.multiply(BigInteger.valueOf(i));
        }
        return s;
    }

    public static void main(String[] args) {
        int n = 49;
        int k = 6;
        BigInteger result = factorial(n).divide(factorial(k).multiply(factorial(n-k)));
        System.out.println("Probably to Lotto win is like 1 to "+result);

    }
}
