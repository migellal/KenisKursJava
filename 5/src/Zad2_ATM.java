import java.util.Scanner;

/**
 * Created by Micha³ on 2015-05-23.
 */
// Klasa bankomat zawiera operacje logicznie dostêpne w bankomacie, czyli wyp³aæ œrodki. Operacje takie jak aktualizacja informacji o œrodkach znajduj¹ siê
// w klasie CardDB. Skonstruowanie wp³atomatu w tej sytuacji, gdybym pojawi³ siê taki wymóg bêdzie bardzo proste, odpowiednie metoda tutaj i operacja w klasie CardDB.
public class Zad2_ATM {

    private String cardNumber;
    private Zad2_CardDB cardDB = new Zad2_CardDB();
    int choice = 0;
    private Scanner scanner = new Scanner(System.in);

    public void startATM()
    {
        System.out.println("Wloz karte: ");
        cardNumber = scanner.next();
        if(!cardDB.checkCard(cardNumber))
            System.out.println("Nie rozpoznano karty. Koniec programu.");
        else
        {
            while (choice!=3) {
                System.out.println(
                        "Wybierz operacje: " + "\n" +
                                "Aby sprawdzic stan konta wybierz [1]" + "\n" +
                                "Aby wyplacic pieniadze wybierz [2]" + "\n" +
                                "Aby zakonczyc wybierz [3]"
                );
                choice = operation(scanner.nextInt());
            }
        }

    }

    private void paycheck(int pay)
    {
        if(pay<=cardDB.getAccountBalance(cardNumber))
        {
            cardDB.updateAccountBalance(cardNumber, pay);
            System.out.println("Wyplacono: " + pay + "\n");
        }
        else
            System.out.println("Zbyt malo srodkow na koncie, wybierz inna operacje, lub zmniejsz kwote."+"\n");
    }

    private int operation(int a)
    {
        switch (a){
            case 1:
                System.out.println("Masz "+cardDB.getAccountBalance(cardNumber)+" na koncie."+"\n");
                break;
            case 2:
                System.out.println("Ile chcesz wyplacic?");
                paycheck(scanner.nextInt());
                break;
            case 3:
                System.out.println("Koniec programu.");
                break;
            default:
                System.out.println("Nie rozpoznano polecenia."+"\n");
        }
        return a;
    }
}
