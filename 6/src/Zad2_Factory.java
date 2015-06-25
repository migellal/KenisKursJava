/**
 * Created by Micha³ on 2015-06-17.
 */

// W tym przypadku produkt sam zna swój numer ID. Implemntacja w której fabryka
// go przydziela wcale nie jest trudna i czasem zdarzaj¹ siê takie sytuacje
// wszystko zale¿y od konkretnego zadania
public class Zad2_Factory {

    public static void main(String args[])
    {
        Zad2_Factory factory = new Zad2_Factory();
        Zad2_Product[] myProducts = new Zad2_Product[100];
        factory.create100Product(myProducts);

        myProducts[5].start();
        myProducts[45].start();
        myProducts[82].start();
        myProducts[0].start();
        myProducts[99].start();
        myProducts[1].start();
    }

    private void create100Product(Zad2_Product[] myProducts)
    {
        for(int i=0; i<100; i++)
        {
            myProducts[i] = new Zad2_Product();
        }
    }
}
