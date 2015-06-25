/**
 * Created by Micha³ on 2015-05-23.
 */
public class Zad3_TV {

    private boolean state = false;
    private String currentChannel = "1";
    private String channels[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}; // 0 to atrapa, aby u³atwiæ iteracjê, przeanalizuj kod, to odgadniesz o co chodzi
    private int volume = 1; // nie mo¿e byæ wiêksza ni¿ 15

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
        if(state)
            System.out.println("TV jest wlaczony");
    }

    public void setChannel(String s) {
        currentChannel = s;
        System.out.println("Aktualny kanal to: " + s);
    }

    public void changeChannel(boolean b) {
        int nextChannel = 0;
            for(int i=0; i<channels.length; i++)
            {
                if(currentChannel.equals(channels[i])) {
                    nextChannel = i;
                }
            }
        if(b&&nextChannel==9)
            currentChannel = "1";
        else if(!b&&nextChannel==1)
            currentChannel = "9";
        else if(b)
            currentChannel = channels[++nextChannel];
        else
            currentChannel = channels[--nextChannel];
        System.out.println("Aktualny kanal to: " + currentChannel);
    }

    public void changeVolume(boolean b) {
        if(b) {
            if (volume < 15)
                volume++;
            else {}
        }
        else {
            if (volume > 1)
                volume--;
            else {}
        }
        System.out.println("Aktualna glosnosc to: " + volume);
    }
}
