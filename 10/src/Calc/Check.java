package Calc;

/**
 * Created by Michał on 2015-06-24.
 */
public class Check {
    public String checkConditions(String str) {
        String result = "OK";
        if (str.contains(" ")) {
            result = "Please remove space and try again";
        } else if(!str.contains("+")&&!str.contains("-")&&!str.contains("*")&&!str.contains("/")) {
            result =  "This is not mathematics operation";
        }
        return result;
    }

    public int check1Number(String str, String oper) {
        String number1 = str.substring(0, str.indexOf(oper));
        if (checkNumber(number1))
            return Integer.parseInt(number1);
        else
            return 1000;

    }

    public int check2Number(String str, String oper) {
        String number2 = str.substring(str.indexOf(oper)+1, str.length());
        if (checkNumber(number2))
            return Integer.parseInt(number2);
        else
            return 1000;
    }

    public String checkOperation(String str) { // minus znajduje się na końcu, żeby nie pomylił operatora z liczbą ujemną
        if (str.contains("+"))
            return "+";
        else if (str.contains("*"))
            return "*";
        else if (str.contains("/"))
            return "/";
        else
            return "-";
    }

    private boolean checkNumber(String candidate) {
        boolean result;
        try {
            Integer.parseInt(candidate);
            result = true;
        } catch (Exception e) {
            result = false;
        }
        return result;
    }
}
