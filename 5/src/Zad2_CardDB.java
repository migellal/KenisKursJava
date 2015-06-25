/**
 * Created by Michał on 2015-05-23.
 */
public class Zad2_CardDB {

    // Ten fragment nie jest idealny, ale dla naszego programu wystarczy, najelpiej było by to zrobić zmienną przechowującą pary Klucz, wartość
    // Ale jeszcze o niej nie mówiłem
    private String[] cardNumbers = {"ABC", "CDE"};
    private int[] accountBalance = {1500, 780};

    public boolean checkCard(String card)
    {
        boolean result = false;
        for(int i = 0; i<cardNumbers.length; i++)
        {
            if(card.equals(cardNumbers[i]))
            {
                result = true;
            }
        }
        return result;
    }

    public int getAccountBalance(String card)
    {
        int result = 0;
        for(int i = 0; i<cardNumbers.length; i++)
        {
            if(card.equals(cardNumbers[i]))
            {
                result = accountBalance[i];
            }
        }
        return result;
    }

    public void updateAccountBalance(String card, int pay)
    {
        for(int i = 0; i<cardNumbers.length; i++)
        {
            if(card.equals(cardNumbers[i]))
            {
                accountBalance[i] = accountBalance[i] - pay;
            }
        }
    }


}
