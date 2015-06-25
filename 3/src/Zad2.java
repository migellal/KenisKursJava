/**
 * Created by Micha³ on 2015-04-28.
 */
public class Zad2 {

    public static void main (String args[])
    {
        int[][] tab = new int[3][];
        tab[0] = new int[5];
        tab[1] = new int[3];
        tab[2] = new int[7];

        //dodawanie jedynek do tablicy
        for (int i = 0; i<tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = 1;
            }
        }

        //drukowanie
        for (int i = 0; i<tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++)
                System.out.print(tab[i][j]);
            System.out.println("");
        }


    }

}
