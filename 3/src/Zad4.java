/**
 * Created by Micha³ on 2015-04-28.
 */
public class Zad4 {

    public static void main (String args[])
    {
        char letter = 'a';
        letter--; // potrzebne, nastêpna pêtla najpierw zwiêksza wartoœæ, potem drukuje, czyli zaczê³a by drukowanie od b
        while (letter!='z')
        {
            letter++;
            System.out.println(letter);
        }
        // mo¿na oczywiœcie rozwi¹zaæ pêtl¹ for, ale tak jest zgrabniej ;)
    }

}
