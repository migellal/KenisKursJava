/**
 * Created by Micha³ on 2015-06-17.
 */
public class Zad3_Coordinates {

    public static void main(String[] args) {
        int a, b, c;
        Zad3_Point3D[] points3D = new Zad3_Point3D[10];

        for(int i=0; i<10; i++)
        {
            a = i + 2;
            b = i * 2;
            c = i - 17;
            points3D[i] = new Zad3_Point3D(a, b, c);
        }
        printTable(points3D);
    }

    public static void printTable(Zad3_Point3D[] points3D)
    {
        for(Zad3_Point3D i : points3D)
        {
            System.out.println("id#"+i+" x="+i.getX()+" y="+i.getY()+" z="+i.getZ());
        }
    }

    // Po uruchoamieniu programu widaæ, ¿e dostajemy nazwê klasy@ i jakieœ dane
    // Mo¿na by przeci¹¿yæ metodê toString w klasie Point3D, zapraszam, jeœli chcesz ;)
}
