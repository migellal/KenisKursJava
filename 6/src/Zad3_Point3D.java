/**
 * Created by Micha³ on 2015-06-17.
 */
public class Zad3_Point3D extends Zad3_Point {
    private int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Zad3_Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
