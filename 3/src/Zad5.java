/**
 * Created by Micha³ on 2015-04-28.
 */
public class Zad5 {

    public static void main (String args[])
    {
        int tab[] = new int[10];
        int i = 0;
        int j = 11;
        while(i<tab.length) // dla odmiany, pêtla while
        {
            tab[i] = j;
            j = j + 11;
            i++;
        }
        i = 0; // utworzyliœmy t¹ zmienn¹ wczeœniej, u¿yjmy jej znowu jako iteratora

        for(; i<tab.length; i++)
        {
            System.out.println(tab[i]);
        }
    }

}
