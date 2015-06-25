/**
 * Created by Micha³ on 2015-05-24.
 */
public class Zad4_RearWheel extends Zad4_Wheel {
    Zad4_Chain chain = new Zad4_Chain();

    @Override
    public void spin() {
        super.spin();
        System.out.println("Krêci siê dziêki:" + chain);
    }
}
