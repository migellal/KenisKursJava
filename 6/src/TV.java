/**
 * Created by Micha³ on 2015-05-23.
 */
public abstract class TV implements ChangeChannel, Change {

    public abstract void onTV(boolean b);

    @Override
    public String toString() {
        return "Metoda toString klasy TV";
    }

    public static void changeVolume()
    {
        System.out.println("Zmiana glosnosci.");
    }

}
