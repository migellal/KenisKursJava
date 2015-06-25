/**
 * Created by Micha³ on 2015-05-19.
 */
public class Zad1_Computer {

    String processor;

    public void Start(boolean on)
    {
        if(on)
            System.out.println("Computer is on");
        else
            System.out.println("Computer is off");
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

}
