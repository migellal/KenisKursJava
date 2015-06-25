package Zad4;

/**
 * Created by Micha³ on 2015-06-23.
 */
public class Main {
    public static void main(String[] args) {
        iClick  ic = new iClick() {
            @Override
            public void onRightButtonClick() {
                System.out.println("Right Button Clicked");
            }

            @Override
            public void onLeftButtonClick() {
                System.out.println("Left Button Clicked");
            }
        };
    }
}
