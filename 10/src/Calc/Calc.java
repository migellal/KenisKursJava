package Calc;

import java.util.Scanner;

/**
 * Created by Micha³ on 2015-06-24.
 * Z racji, ¿e to ju¿ praktycznie koniec, pora na jedno du¿e zadanie z kilku podpunktów:
 * Napisz kalkulator do interpretuj¹cy wpisany tekst, tzn u¿ytkownik wpisuje liczby naturalne od -999 do 999,
 * nastêpnie znak mno¿enie, dzielenie, dodawanie lub odejmowanie i znowu cyfry -999 do 999. Program
 * drukuje wynik, a u¿ytkownik wpisuje nastêpne dzia³anie. Zabezpiecz siê przed najwiêksz¹ mo¿liw¹ iloœci¹
 * b³êdów u¿ytkownika. Tekst END koñczy wpisywanie danych.
 * a)	Pamiêtaj poinformowaæ u¿ytkownika co w³aœciwie ma robiæ odpowiednimi komendami
 * b)	Napisz metodê sprawdzaj¹c¹, czy u¿ytkownik wprowadzi³ tekst, czy liczbê, czy mo¿e liczbê ujemn¹,
 * dobrze przemyœl t¹ metodê, u¿ytkownik mo¿e wprowadziæ 800, 7 i -60 i wszystko to s¹ prawid³owe liczby
 * c)	Staraj siê daæ jak najwiêcej informacji zwrotnej, np. w tekœcie znajduje siê spacja, spróbuj znowu usuwaj¹c j¹
 * d)	Staraj siê zwracaæ typ int, chyba, ¿e mamy u³amek, wtedy double.
 * e)	Wszystko ³adnie sformatuj, niech aplikacja wygl¹da porz¹dnie.
 */
public class Calc {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calc calc = new Calc();
        Check check = new Check();
        String str = "", oper, checkResult;
        int number1, number2;
        System.out.println("Enter the operation.");
        System.out.println("Example: 36+72, don't use space, use number from -999 to 999 and +, -, * or /");
        System.out.println("Word END endings program");
        System.out.println("Enter the operation:");
        while (!str.equals("end")) {
            str = calc.read().toLowerCase();
            if (!str.equals("end")) {
                checkResult = check.checkConditions(str);
                if (!checkResult.equals("OK")) {
                    System.out.println(checkResult);
                    System.out.println("Enter the operation:");
                } else {
                    oper = check.checkOperation(str);
                    number1 = check.check1Number(str, oper);
                    number2 = check.check2Number(str, oper);
                    if (number1 > 999 || number1 < -999 || number2 > 999 || number2 < -999)
                        System.out.println("I do not recognize digits");
                    else
                        System.out.println("= " + calc.calculate(number1, number2, oper));
                    System.out.println("Enter the operation:");
                }
            }
        }

    }

    private String calculate(int n1, int n2, String oper) {
        if (oper.equals("+"))
            return (n1 + n2) + "";
        else if (oper.equals("-"))
            return (n1 - n2) + "";
        else if (oper.equals("*"))
            return (n1 * n2) + "";
        else {
            double result = (double)n1/(double)n2;
            return result+"";
        }
    }

    private String read() {
        return scanner.next();
    }
}
