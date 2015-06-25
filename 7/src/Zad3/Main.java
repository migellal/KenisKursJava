package Zad3;

import Zad3.Bricks.Brick;
import Zad3.Bricks.Greens.Green;
import Zad3.Bricks.Reds.Red;

/**
 * Created by Micha³ on 2015-06-23.
 */
public class Main {

    public static void main(String[] args) {
        Brick brick = new Brick();
        Green green = new Green();
        Red red = new Red();
        brick.iAm();
        green.iAm();
        red.iAm();
    }
}
