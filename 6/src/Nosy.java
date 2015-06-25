/**
 * Created by Micha³ on 2015-05-23.
 */
public class Nosy extends TV{

    static int a = 56;
    @Override
    public void onTV(boolean b) {
        if(b)
            System.out.println("TV is on");
        else
            System.out.println("TV is off");
    }

    @Override
    public String toString() {
        return "Metoda toString klasy Nosy";
    }

    @Override
    public void changeChannel() {
        System.out.println("Zmiana kana³u");
    }
}
