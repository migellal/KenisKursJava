/**
 * Created by Micha³ on 2015-04-28.
 */
public class Zad3 {

    public static void main (String args[])
    {
        int[][] tab = {{0, 0, 0, 0, 0},{0, 0, 0, 0},{0, 0, 0},{0, 0},{0}};

        for (int i = 0; i<tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++)
                System.out.print(tab[i][j]);
            System.out.println("");
        }

    }

}
