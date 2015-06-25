import java.util.Scanner;

/**
 * Created by Micha³ on 2015-05-23.
 */
public class zad3_Pilot {

    Zad3_TV TV = new Zad3_TV();
    Scanner scanner = new Scanner(System.in);
    public void start()
    {
        showMenu();
        if(scanner.next().equals("on")) {
            TV.setState(true);
            while (TV.isState())
                operation(scanner.next());
        }
        System.out.println("TV jest wylaczony.");
    }

    private void showMenu()
    {
        System.out.println(
                "Aby wlaczyc TV wpisz on, aby go wylaczyc: off\n" +
                        "Aby wybrac kanal wpisz cyfry od 1 do 9\n" +
                        "Aby zmienic kanal wpisz + lub -\n" +
                        "Aby zwiekszyc glosnosc wpisz vol+\n" +
                        "Aby zmniejszyc glosnosc wpisz vol-\n" +
                        "Wylaczenie TV konczy prace programu\n" +
                        "Pamietaj, aby najpierw go wlaczyc."
        );
    }

    private void operation(String o)
    {
        if(o.equals("on"))
            TV.setState(true);
        else if(o.equals("off"))
            TV.setState(false);
        else if(o.equals("1")||o.equals("2")||o.equals("3")||o.equals("4")||o.equals("5")||
                o.equals("6")||o.equals("7")||o.equals("8")||o.equals("9"))
            TV.setChannel(o);
        else if(o.equals("+"))
            TV.changeChannel(true);
        else if(o.equals("-"))
            TV.changeChannel(false);
        else if(o.equals("vol+"))
            TV.changeVolume(true);
        else if(o.equals("vol-"))
            TV.changeVolume(false);
        else
            System.out.println("Nie rozpoznaje polecenia, wpisz nastepne");
    }
}
