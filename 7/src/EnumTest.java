/**
 * Created by Micha³ on 2015-06-06.
 */
public enum EnumTest {
    SMALL(false), MEDIUM(false), LARGE(true), XXL(true);

    boolean isBig;
    EnumTest(boolean isBig)
    {
        this.isBig=isBig;
    }

    String getSize(EnumTest et)
    {
        String size = (et.isBig) ? "big" : "small";
        return "Size " + et + " its " + size;
    }
}
