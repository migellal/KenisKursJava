/**
 * Created by Micha³ on 2015-05-09.
 */
public class Home {

    public static void main (String args[])
    {
        TV nosy = new TV(45, "nosy123");
        TV sama = new TV(32, "sama2345");

        System.out.println(sama.getName() + " " + sama.getSize());
        System.out.println(nosy.getName() + " " + nosy.getSize());

        sama.getOnOff();
        sama.setOnOff(true);
        sama.getOnOff();

        Dog rex = new Dog();
        rex.speak();
        rex.setSize(15);
        System.out.println(rex.getSize());


    }

}
