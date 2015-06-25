/**
 * Created by Micha³ on 2015-05-23.
 */
public class Home {
    Nosy n1 = new Nosy();
    public static void main (String args[])
    {
        Nosy n = new Nosy();
        System.out.println(n);
        String s1 = "tekst";
        String s2 = new String("tekst");
        if (s1==s2)
            System.out.println("s1==s2");
        if(s1.equals(s2))
            System.out.println("s1.equals(s2)");
        if(n instanceof Object)
            System.out.println("n instanceof Object");

        TV.changeVolume();
        int y = Nosy.a;
    }
}
