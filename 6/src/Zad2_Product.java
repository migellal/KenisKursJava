/**
 * Created by Micha³ on 2015-06-17.
 */
public class Zad2_Product {

    private static int id = 1000;
    private final String name = "Product";
    private int tempId;

    Zad2_Product()
    {
        tempId = id;
        id++;
    }

    public void start()
    {
        System.out.println("I am "+ name+ ". My #ID"+ tempId);
    }


}
