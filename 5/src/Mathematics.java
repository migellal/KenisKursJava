/**
 * Created by Micha³ on 2015-05-09.
 */
public class Mathematics {

    public static void main (String args[])
    {
        Mathematics m = new Mathematics();
        m.className();
        System.out.println(m.sqrt(5));
        System.out.println(m.sqrt(55));
        System.out.println(m.sqrt(10));
        System.out.println(m.sqrt(10.5));
        System.out.println(m.sqrt(15.5));
        System.out.println(m.sqrt(20.5));
    }

    public void className()
    {
        System.out.println("Mathematics");
    }

    public int sqrt(int a)
    {
        return a*a;
    }

    public double sqrt(double a)
    {
        return a*a;
    }
}
